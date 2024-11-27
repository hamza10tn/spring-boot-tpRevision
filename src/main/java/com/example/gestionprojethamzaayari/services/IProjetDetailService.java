package com.example.gestionprojethamzaayari.services;

import com.example.gestionprojethamzaayari.entities.ProjetDetail;
import com.example.gestionprojethamzaayari.entities.ProjetDetail;

import java.util.List;

public interface IProjetDetailService {
    public ProjetDetail addProjetDetail(ProjetDetail projetDetail);
    public ProjetDetail updateProjetDetail(ProjetDetail projetDetail);
    public List<ProjetDetail> retreiveAllProjetDetails();
    public ProjetDetail retreiveProjetDetailById(long id);
    public void deleteProjetDetailById(long id);
}
