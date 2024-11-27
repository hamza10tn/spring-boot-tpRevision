package com.example.gestionprojethamzaayari.restcontrollers;

import com.example.gestionprojethamzaayari.entities.Equipe;
import com.example.gestionprojethamzaayari.services.IEquipeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
//@RequestMapping("/Equipe")
@Tag(name = "Gestion equipe")
public class EquipeRestController {

    private IEquipeService equipeService;

    @Operation(description = "récupérer toutes les equipes de la base de données")
    @GetMapping("/getEquipe")
    public List<Equipe> retrieveAllEquipe() {
        List<Equipe> equipe = equipeService.retreiveAllEquipes();
        return equipe;
    }
    @Operation(description = "récupérer une equipe par id de la base de données")
    @GetMapping("/getEquipeNumber/{eqId}")
    public Equipe retrieveEquipe(@PathVariable("eqId") Long eqId) {
        Equipe equipe = equipeService.retreiveEquipeById(eqId);
        return equipe;
    }
    @Operation(description = "ajouter une equipe dans la base de données")
    @PostMapping("/addEquipe")
    public Equipe AjouterEquipe(@RequestBody Equipe equipe){
        return equipeService.addEquipe(equipe);
    }
    @Operation(description = "supprimer une equipe de la base de données")
    @DeleteMapping("/remove-equipe/{eqId}")
    public void removeEquipe(@PathVariable("eqId") Long eqId) {
        equipeService.deleteEquipeById(eqId);
    }

    @PatchMapping("/modify-equipe")
    public Equipe modifyequipe(@RequestBody Equipe e) {
        Equipe equipe = equipeService.updateEquipe(e);
        return equipe;
    }


}
