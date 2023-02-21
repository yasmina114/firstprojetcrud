package com.developer.firstprojetcrud.service.impl;

import com.developer.firstprojetcrud.entity.CategoproddbEntity;
import com.developer.firstprojetcrud.entity.Produits;
import com.developer.firstprojetcrud.repository.CategoprodRepository;
import com.developer.firstprojetcrud.repository.ProduitRepository;
import com.developer.firstprojetcrud.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitsServiceImpl implements ProduitService {
   private final ProduitRepository  produitRepository;

    public ProduitsServiceImpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }
    @Autowired
    CategoprodRepository categoprodRepository;

    @Override
    public List<Produits> findAllProduit() {
        return produitRepository.findAll();
    }

    @Override
    public Optional<Produits> findById(Long id) {
        return produitRepository.findById(id);
    }

    @Override
    public Produits saveProduit(Produits produits,Long id ){
        CategoproddbEntity cat = categoprodRepository.findById(id).orElse(null);
        produits.setCat(cat);
        LocalDate date = LocalDate.now();
        produits.setDate_crea(date);
        produits.setDate_modif(date);

        return produitRepository.save(produits);
    }

    @Override
    public Produits updateProduit(Produits produits) {
        LocalDate date = LocalDate.now();
        produits.setDate_modif(date);
        return produitRepository.save(produits);
    }



    @Override
    public void deleteProduits(Long id) {
        produitRepository.deleteById(id);

    }
}
