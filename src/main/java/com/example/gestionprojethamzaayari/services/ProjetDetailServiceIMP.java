package com.example.gestionprojethamzaayari.services;

import com.example.gestionprojethamzaayari.entities.ProjetDetail;
import com.example.gestionprojethamzaayari.entities.ProjetDetail;
import com.example.gestionprojethamzaayari.repository.ProjetDetailRepository;
import com.example.gestionprojethamzaayari.repository.ProjetDetailRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjetDetailServiceIMP implements IProjetDetailService{
    private ProjetDetailRepository projetDetailRepository;
    @Override
    public ProjetDetail addProjetDetail(ProjetDetail projetDetail) {
        return projetDetailRepository.save(projetDetail);
    }

    @Override
    public ProjetDetail updateProjetDetail(ProjetDetail projetDetail) {
        return projetDetailRepository.save(projetDetail);
    }

    @Override
    public List<ProjetDetail> retreiveAllProjetDetails() {
        return projetDetailRepository.findAll();
    }

    @Override
    public ProjetDetail retreiveProjetDetailById(long id) {
        return projetDetailRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteProjetDetailById(long id) {
        projetDetailRepository.deleteById(id);
    }
}
