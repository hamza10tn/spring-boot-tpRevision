package com.example.gestionprojethamzaayari.restcontrollers;

import com.example.gestionprojethamzaayari.entities.Projet;
import com.example.gestionprojethamzaayari.services.IProjetService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Projet")
@Tag(name = "Gestion Projet")
public class ProjetRestController {
    private IProjetService projetService;

    @Operation(description = "récupérer toutes les projets de la base de données")
    @GetMapping("/getProjet/")
    public List<Projet> retrieveAllProjet() {
        List<Projet> projet = projetService.retreiveAllProjets();
        return projet;
    }
    @Operation(description = "récupérer une projet par id de la base de données")
    @GetMapping("/getProjetNumber/{eqId}")
    public Projet retrieveProjet(@PathVariable("eqId") Long eqId) {
        Projet projet = projetService.retreiveProjetById(eqId);
        return projet;
    }
    @Operation(description = "ajouter une projet dans la base de données")
    @PostMapping("/addProjet/")
    public Projet AjouterProjet(@RequestBody Projet projet){
        return projetService.addProjet(projet);
    }
    @Operation(description = "supprimer une projet de la base de données")
    @DeleteMapping("/remove-projet/{eqId}")
    public void removeProjet(@PathVariable("eqId") Long eqId) {
        projetService.deleteProjetById(eqId);
    }

    @PatchMapping("/modify-projet")
    public Projet modifyProjet(@RequestBody Projet e) {
        Projet projet = projetService.updateProjet(e);
        return projet;
    }


    @PutMapping("/affecter-projet-a-projet-details/{projet-id}/{projet-details-id}")
    public void affecgterProjetAProjetDetail(@PathVariable("projet-id") Long projetId, @PathVariable("projet-details-id") Long projetDetailsId) {
        projetService.assignProjetDetailToProjet(projetId, projetDetailsId);
    }
}
