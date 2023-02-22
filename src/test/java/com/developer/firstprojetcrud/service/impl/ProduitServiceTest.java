package com.developer.firstprojetcrud.service.impl;

import com.developer.firstprojetcrud.entity.Produits;
import com.developer.firstprojetcrud.service.ProduitService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProduitServiceTest {
    @Autowired
    private ProduitService produitService;
  @Test
  public void testSaveProduit(){
      Produits produit =new Produits();
      produit.setNompr("TestProd");
      produit.setQt(45);
      produit.setDisponible(true);


    Produits savedProduit = produitService.saveProduit(produit, 3L);

    assertThat(savedProduit).isNotNull();
    assertThat(savedProduit.getNompr()).isEqualTo("Testprod");

  }
}
