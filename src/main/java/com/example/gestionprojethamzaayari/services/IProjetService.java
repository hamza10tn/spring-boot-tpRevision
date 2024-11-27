package com.example.gestionprojethamzaayari.services;


import com.example.gestionprojethamzaayari.entities.Projet;

import java.util.List;

public interface IProjetService {
    public Projet addProjet(Projet projet);
    public Projet updateProjet(Projet bloc);
    public List<Projet> retreiveAllProjets();
    public Projet retreiveProjetById(long id);
    public void deleteProjetById(long id);
    public void assignProjetDetailToProjet(Long projetId, Long projetDetailId);
}
