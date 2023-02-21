package com.developer.firstprojetcrud.service.impl;

import static org.assertj.core.api.Assertions.assertThat;

import com.developer.firstprojetcrud.entity.CategoproddbEntity;
import com.developer.firstprojetcrud.service.CategoprodService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoprodServiceTest {

    @Autowired
    private CategoprodService categorieService;

    @Test
    public void testSaveCategoprod() {
        CategoproddbEntity categorie = new CategoproddbEntity();
        categorie.setName("Test Category");
        categorie.setQt(50);

        CategoproddbEntity savedCategorie = categorieService.saveCategoprod(categorie);
        assertThat(savedCategorie).isNotNull();
        assertThat(savedCategorie.getName()).isEqualTo("Test Category");

    }


}

