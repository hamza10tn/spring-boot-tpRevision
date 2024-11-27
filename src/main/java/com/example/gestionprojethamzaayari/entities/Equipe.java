package com.example.gestionprojethamzaayari.entities;

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
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    @Enumerated(EnumType.STRING)
    private Domaine domaine;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "equipe_projet",
            joinColumns = @JoinColumn(name = "equipe_id"),
            inverseJoinColumns = @JoinColumn(name = "projet_id")
    )
    private Set<Projet> projets=new HashSet<>();


}
