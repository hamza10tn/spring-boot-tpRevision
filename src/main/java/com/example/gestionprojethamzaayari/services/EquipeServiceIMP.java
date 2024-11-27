package com.example.gestionprojethamzaayari.services;

import com.example.gestionprojethamzaayari.entities.Equipe;
import com.example.gestionprojethamzaayari.repository.EquipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipeServiceIMP implements IEquipeService{
    private EquipeRepository equipeRepository;
    @Override
    public Equipe addEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public Equipe updateEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public List<Equipe> retreiveAllEquipes() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe retreiveEquipeById(long id) {
        return equipeRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteEquipeById(long id) {
         equipeRepository.deleteById(id);
    }
}
