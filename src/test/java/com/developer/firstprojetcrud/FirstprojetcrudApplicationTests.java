package com.developer.firstprojetcrud;

import com.developer.firstprojetcrud.entity.CategoproddbEntity;
import com.developer.firstprojetcrud.service.CategoprodService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FirstprojetcrudApplicationTests {
	@Autowired
	private CategoprodService categorieService;


	@Test
	void contextLoads() {
		CategoproddbEntity categorie = new CategoproddbEntity();
		categorie.setName("Test Category");
		categorie.setQt(50);

		CategoproddbEntity savedCategorie = categorieService.saveCategoprod(categorie);
		assertThat(savedCategorie).isNotNull();
		assertThat(savedCategorie.getName()).isEqualTo("Test Category");
	}

}
