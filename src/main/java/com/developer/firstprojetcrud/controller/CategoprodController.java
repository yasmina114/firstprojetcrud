package com.developer.firstprojetcrud.controller;

import com.developer.firstprojetcrud.entity.CategoproddbEntity;
import com.developer.firstprojetcrud.entity.Produits;
import com.developer.firstprojetcrud.service.CategoprodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/categoprod")
public class CategoprodController {

    private final CategoprodService categoprodService;

    public CategoprodController(CategoprodService categoprodService) {
        this.categoprodService = categoprodService;
    }
    @GetMapping("/all-categorie")

    public List<CategoproddbEntity>findAllCategoprod(){
       return categoprodService.findAllCategoprod();
    }
    @GetMapping("/{id}")
    public Optional<CategoproddbEntity> findCategoproddbById(@PathVariable("id") Long id){
      return categoprodService.findById(id);
    }


    @GetMapping(path = "/getProdCat/{id}")
    public List<Produits> getAllConsumers(@PathVariable("id") Long id){
        return categoprodService.getAllListProdCat(id);

    }



     @PostMapping
    public CategoproddbEntity  saveCategoprod(@RequestBody CategoproddbEntity categoproddbEntity ){
      return categoprodService.saveCategoprod(categoproddbEntity);

    }
    @PutMapping
    public CategoproddbEntity updateCategoprod(@RequestBody CategoproddbEntity categoproddbEntity ){
        return categoprodService.updateCategoprod(categoproddbEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteCategoprod(@PathVariable("id") Long id){
        categoprodService.deleteCategoprod(id);
    }

}
