package com.developer.firstprojetcrud.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
import java.util.List;
@Builder
@Entity
@Table(name="mt_categoprod")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CategoproddbEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name="categoprod_id")
    private Long id;
    @Column(name="name" ,length=30)
    private String name;
    @Column(name="QT")
    private int qt;
    @Column(name="Date_cre")
    private LocalDate dateCre;
    @Column(name="Date_modif")
    private LocalDate dateModif;
    @JsonManagedReference
    @OneToMany(mappedBy = "cat",cascade = CascadeType.ALL)
    private List<Produits> p;



}
