package com.example.gestionprojethamzaayari.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String sujet;
    @ManyToMany(mappedBy ="projets")
    @JsonIgnore
    private Set<Equipe> equipes=new HashSet<Equipe>();
//new HashSet<Equipe>();optionelle
    @OneToOne(cascade = CascadeType.ALL)

    @JoinColumn(name = "projet_detail_id")
    private ProjetDetail projetDetail;


}
