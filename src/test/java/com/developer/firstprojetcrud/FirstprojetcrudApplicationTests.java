package com.developer.firstprojetcrud;

import com.developer.firstprojetcrud.entity.CategoproddbEntity;
import com.developer.firstprojetcrud.service.CategoprodService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class FirstprojetcrudApplicationTests {
	@Autowired
	private CategoprodService categorieService;


	@Test
	void contextLoads() {
		CategoproddbEntity expectedCategorie = CategoproddbEntity.builder()
				.name("aaaa")
				.qt(1)
				.build();
		CategoproddbEntity savedCategorie = categorieService.saveCategoprod(expectedCategorie);
		assertNotNull(savedCategorie);
		assertNotNull(expectedCategorie.getName() , savedCategorie.getName());
	}


}
