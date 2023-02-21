package com.developer.firstprojetcrud.service;

import com.developer.firstprojetcrud.entity.CategoproddbEntity;
import com.developer.firstprojetcrud.entity.Produits;

import java.util.List;
import java.util.Optional;

public interface ProduitService {
    List<Produits> findAllProduit();
    Optional<Produits> findById(Long id);
    Produits saveProduit(Produits produits,Long id );
    Produits updateProduit(Produits produits);
    void deleteProduits(Long id);
}
