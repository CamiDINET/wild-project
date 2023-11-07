package com.myProject.beerTheStrong.Controller;

import com.myProject.beerTheStrong.Entity.Hop;
import com.myProject.beerTheStrong.Entity.Malt;
import com.myProject.beerTheStrong.Repository.MaltRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class MaltController {

   @Autowired
    MaltRepository maltRepository;

    @GetMapping("malts")
    public List<Malt> getAllMalts(){
        return maltRepository.findAll();
    }
    @GetMapping("malts/{maltId}")
    public Malt getMaltWithId(@PathVariable Long maltId){
        return maltRepository.findById(maltId).get();
    }
    @PostMapping("malts")
    public Malt addMalt(@RequestBody Malt malt){
        return maltRepository.save(malt);
    }
    @PutMapping("malts/{maltId}")
    public Malt updateMalt(@PathVariable Long maltId, @RequestBody Malt malt){
        Malt maltToModified = maltRepository.findById(maltId).get();
        maltToModified.setName(malt.getName());
        maltToModified.setDescription(malt.getDescription());
        maltToModified.setStyle(malt.getStyle());
        maltToModified.setMaxUse(malt.getMaxUse());
        return maltRepository.save(maltToModified);
    }
    @DeleteMapping("malts/{maltId}")
    public Boolean deleteMalt(@PathVariable Long maltId){
        maltRepository.deleteById(maltId);
        return true;
    }



}
