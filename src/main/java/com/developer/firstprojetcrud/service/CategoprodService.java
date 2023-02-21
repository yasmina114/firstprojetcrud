package com.developer.firstprojetcrud.service;

import com.developer.firstprojetcrud.entity.CategoproddbEntity;
import com.developer.firstprojetcrud.entity.Produits;

import java.util.List;
import java.util.Optional;

public interface CategoprodService {
    List<Produits> getAllListProdCat(Long id);
  List<CategoproddbEntity> findAllCategoprod();
   Optional<CategoproddbEntity> findById(Long id);
   CategoproddbEntity saveCategoprod(CategoproddbEntity categoproddbEntity );
   CategoproddbEntity updateCategoprod(CategoproddbEntity categoproddbEntity);
   void deleteCategoprod(Long id);
}
