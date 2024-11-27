package com.example.gestionprojethamzaayari.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProjetDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private String technologie;
    private long cout;
    private Date dateDebut;

    @OneToOne(mappedBy = "projetDetail")
    //pour excluder les boucles
    @ToString.Exclude
    @JsonIgnore
    private Projet projet;



}
