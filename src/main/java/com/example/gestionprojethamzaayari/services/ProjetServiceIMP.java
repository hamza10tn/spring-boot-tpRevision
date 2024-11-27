package com.example.gestionprojethamzaayari.services;

import com.example.gestionprojethamzaayari.entities.Projet;
import com.example.gestionprojethamzaayari.entities.Projet;
import com.example.gestionprojethamzaayari.entities.ProjetDetail;
import com.example.gestionprojethamzaayari.repository.ProjetDetailRepository;
import com.example.gestionprojethamzaayari.repository.ProjetRepository;
import com.example.gestionprojethamzaayari.repository.ProjetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjetServiceIMP implements IProjetService{
    private ProjetRepository projetRepository;
    private ProjetDetailRepository projetDetailRepository;
    @Override
    public Projet addProjet(Projet equipe) {
        return projetRepository.save(equipe);
    }

    @Override
    public Projet updateProjet(Projet equipe) {
        return projetRepository.save(equipe);
    }

    @Override
    public List<Projet> retreiveAllProjets() {
        return projetRepository.findAll();
    }

    @Override
    public Projet retreiveProjetById(long id) {
        return projetRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteProjetById(long id) {
        projetRepository.deleteById(id);
    }
    public void assignProjetDetailToProjet(Long projetId, Long projetDetailId) {
        Projet projet = projetRepository.findById(projetId).get();
        ProjetDetail projetDetail = projetDetailRepository.findById(projetDetailId).get();
// on set le fils dans le parent :
        projet.setProjetDetail(projetDetail);
        projetRepository.save(projet);
    }

}
