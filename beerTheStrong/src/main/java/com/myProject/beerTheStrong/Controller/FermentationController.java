package com.myProject.beerTheStrong.Controller;

import com.myProject.beerTheStrong.Entity.Fermentation;
import com.myProject.beerTheStrong.Repository.FermentationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin
@RestController
public class FermentationController {
    @Autowired
    FermentationRepository fermentationRepository;
    @GetMapping("fermentation")
    public List<Fermentation> getAllFermentation(){
        return fermentationRepository.findAll();
    }
    @GetMapping("fermentation/{fermentationId}")
    public Fermentation getFermentationWithId(@PathVariable Long fermentationId){
        return fermentationRepository.findById(fermentationId).get();
    }
    @PostMapping("fermentation")
    public Fermentation addFermentation(@RequestBody Fermentation fermentation){
        return fermentationRepository.save(fermentation);
    }

    @PutMapping("fermentation/{fermentationId}")
    public Fermentation updateFermentation(@PathVariable Long fermentationId, @RequestBody Fermentation fermentation){
        Fermentation fermentationToModified = fermentationRepository.findById(fermentationId).get();
        fermentationToModified.setHops(fermentation.getHops());
        fermentationToModified.setDurationFermentation(fermentation.getDurationFermentation());
        fermentationToModified.setTemperatureFermentation(fermentation.getTemperatureFermentation());
        fermentationToModified.setYeasts(fermentation.getYeasts());
        fermentationToModified.setDurationGuard(fermentation.getDurationGuard());
        return fermentationRepository.save(fermentationToModified);
    }

    @DeleteMapping("fermentation/{fermentationId}")
    public Boolean deleteFermentation(@PathVariable Long fermentationId){
        fermentationRepository.deleteById(fermentationId);
        return true;
    }
}
