package com.developer.firstprojetcrud.controller;

import com.developer.firstprojetcrud.entity.Produits;
import com.developer.firstprojetcrud.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/produits")
public class ProduitController {
    private final ProduitService produitService;
     @Autowired
    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }
    @GetMapping("/all-produit")
    public List<Produits> findAllProduits(){
        return produitService.findAllProduit();
    }
    @GetMapping("/{id}")
    public Optional<Produits> findProduitsById(@PathVariable("id")Long id){
        return produitService.findById(id);
    }
    @PostMapping("/saveProduit/{id}")
    public Produits saveProduits(@RequestBody Produits produits,@PathVariable Long id){
        return produitService.saveProduit(produits,id);



    }
    @PutMapping
    public Produits updateProduits(@RequestBody Produits produits){
        return produitService.updateProduit(produits);
    }
    @DeleteMapping("/{id}")
     public void deleteProduits(@PathVariable("id") Long id){
        produitService.deleteProduits(id);

     }
}
