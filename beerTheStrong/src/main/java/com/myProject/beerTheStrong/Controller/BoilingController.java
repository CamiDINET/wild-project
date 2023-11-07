package com.myProject.beerTheStrong.Controller;

import com.myProject.beerTheStrong.Entity.Boiling;
import com.myProject.beerTheStrong.Repository.BoilingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class BoilingController {
@Autowired
    BoilingRepository boilingRepository;
    @GetMapping("boiling")
    public List<Boiling> getAllBoiling(){
        return boilingRepository.findAll();
    }
    @GetMapping("boiling/{boilingId}")
    public Boiling getBoilingWithId(@PathVariable Long boilingId){
        return boilingRepository.findById(boilingId).get();
    }
    @PostMapping("boiling")
    public Boiling addBoiling(@RequestBody Boiling boiling){
        return boilingRepository.save(boiling);
    }

    @PutMapping("boiling/{boilingId}")
    public Boiling updateBoiling(@PathVariable Long boilingId, @RequestBody Boiling boiling){
        Boiling boilingToModified = boilingRepository.findById(boilingId).get();
        boilingToModified.setHops(boiling.getHops());
        boilingToModified.setVarious(boiling.getVarious());
        boilingToModified.setWater(boiling.getWater());
        return boilingRepository.save(boilingToModified);
    }

    @DeleteMapping("boiling/{boilingId}")
    public Boolean deleteBoiling(@PathVariable Long boilingId){
        boilingRepository.deleteById(boilingId);
        return true;
    }
}
