package com.example.gestionprojethamzaayari.services;

import com.example.gestionprojethamzaayari.entities.Equipe;

import java.util.List;

public interface IEquipeService {
    public Equipe addEquipe(Equipe equipe);
    public Equipe updateEquipe(Equipe equipe);
    public List<Equipe> retreiveAllEquipes();
    public Equipe retreiveEquipeById(long id);
    public void deleteEquipeById(long id);
}
