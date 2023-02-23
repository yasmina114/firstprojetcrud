package com.developer.firstprojetcrud.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Table(name="produits")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Produits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long iD;

    @Column(name="Nom_pr")
    private String nompr;
    @Column(name="QT_pr")
    private int qt;
    @Column(name="Date_cre_prod")
    private LocalDate dateCrea;
    @Column(name="Date_mod_prod")
    private LocalDate dateModif;
    @Column(name="Disponible")
    private boolean disponible ;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name ="idCategories")
    private CategoproddbEntity cat;
    @Column(insertable = false,updatable = false)
    private Long idCategories;








}
