package com.myProject.beerTheStrong.Controller;


import com.myProject.beerTheStrong.Entity.Pasting;
import com.myProject.beerTheStrong.Repository.PastingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin
@RestController
public class PastingController {
    @Autowired
    PastingRepository pastingRepository;
    @GetMapping("pasting")
    public List<Pasting> getAllPasting(){
        return pastingRepository.findAll();
    }
    @GetMapping("pasting/{pastingId}")
    public Pasting getPastingWithId(@PathVariable Long pastingId){
        return pastingRepository.findById(pastingId).get();
    }
    @PostMapping("pasting")
    public Pasting addPasting(@RequestBody Pasting pasting){
        return pastingRepository.save(pasting);
    }

    @PutMapping("pasting/{pastingId}")
    public Pasting updatePasting(@PathVariable Long pastingId, @RequestBody Pasting pasting){
        Pasting pastingToModified = pastingRepository.findById(pastingId).get();
        pastingToModified.setMalts(pasting.getMalts());
        pastingToModified.setWater(pasting.getWater());

        return pastingRepository.save(pastingToModified);
    }

    @DeleteMapping("pasting/{pastingId}")
    public Boolean deletePasting(@PathVariable Long pastingId){
        pastingRepository.deleteById(pastingId);
        return true;
    }
}
