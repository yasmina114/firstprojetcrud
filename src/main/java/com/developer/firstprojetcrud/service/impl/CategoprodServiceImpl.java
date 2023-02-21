package com.developer.firstprojetcrud.service.impl;

import com.developer.firstprojetcrud.entity.CategoproddbEntity;
import com.developer.firstprojetcrud.entity.Produits;
import com.developer.firstprojetcrud.repository.CategoprodRepository;
import com.developer.firstprojetcrud.repository.ProduitRepository;
import com.developer.firstprojetcrud.service.CategoprodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoprodServiceImpl implements CategoprodService {
    private final CategoprodRepository categoprodRepository ;
    @Autowired
    public  ProduitRepository produitRepository;

    public CategoprodServiceImpl(CategoprodRepository categoprodRepository) {
        this.categoprodRepository = categoprodRepository;
    }

    @Override
    public List<CategoproddbEntity> findAllCategoprod() {
        return categoprodRepository.findAll();
    }

    @Override
    public Optional<CategoproddbEntity> findById(Long id) {
        return categoprodRepository.findById(id);
    }




    @Override
    public CategoproddbEntity saveCategoprod(CategoproddbEntity categoproddbEntity) {
        LocalDate date = LocalDate.now();
        categoproddbEntity.setDate_cre(date);   
        categoproddbEntity.setDate_modif(date);
        return categoprodRepository.save(categoproddbEntity);
    }

    @Override
    public CategoproddbEntity updateCategoprod(CategoproddbEntity categoproddbEntity) {

        LocalDate date = LocalDate.now();
        categoproddbEntity.setDate_modif(date);
        return categoprodRepository.save(categoproddbEntity);
    }

    @Override
    public void deleteCategoprod(Long id) {
        categoprodRepository.deleteById(id);

    }

    @Override
    public List<Produits> getAllListProdCat(Long id){
        List<Produits>produits;
        produits = produitRepository.findAll();
        List<Produits> produit1 = new ArrayList<>();
        for (Produits prod : produits) {

            if (prod.getId_categories() == id) {
                produit1.add(prod);
            }
        }
        return produit1;
    }

}
