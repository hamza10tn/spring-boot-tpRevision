package com.example.gestionprojethamzaayari.restcontrollers;


import com.example.gestionprojethamzaayari.entities.ProjetDetail;
import com.example.gestionprojethamzaayari.services.IProjetDetailService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/ProjetDetail")
@Tag(name = "Gestion ProjetDetail")
public class ProjetDetailRestController {
    private IProjetDetailService projetDetailsService;

    @Operation(description = "récupérer toutes les projets de la base de données")
    @GetMapping("/getProjetDetail/")
    public List<ProjetDetail> retrieveAllProjetDetail() {
        List<ProjetDetail> projet = projetDetailsService.retreiveAllProjetDetails();
        return projet;
    }
    @Operation(description = "récupérer une projet par id de la base de données")
    @GetMapping("/getProjetDetailNumber/{eqId}")
    public ProjetDetail retrieveProjetDetail(@PathVariable("eqId") Long eqId) {
        ProjetDetail projet = projetDetailsService.retreiveProjetDetailById(eqId);
        return projet;
    }
    @Operation(description = "ajouter une projet dans la base de données")
    @PostMapping("/addProjetDetail/")
    public ProjetDetail AjouterProjetDetail(@RequestBody ProjetDetail projet){
        return projetDetailsService.addProjetDetail(projet);
    }
    @Operation(description = "supprimer une projet de la base de données")
    @DeleteMapping("/remove-projet/{eqId}")
    public void removeProjetDetail(@PathVariable("eqId") Long eqId) {
        projetDetailsService.deleteProjetDetailById(eqId);
    }

    @PatchMapping("/modify-projet")
    public ProjetDetail modifyProjetDetail(@RequestBody ProjetDetail e) {
        ProjetDetail projet = projetDetailsService.updateProjetDetail(e);
        return projet;
    }
}
