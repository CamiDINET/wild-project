package com.myProject.beerTheStrong.Controller;

import com.myProject.beerTheStrong.Entity.Hop;
import com.myProject.beerTheStrong.Entity.HopStock;
import com.myProject.beerTheStrong.Repository.HopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class HopController {
    @Autowired
    HopRepository hopRepository;

    @GetMapping("hops")
    public List<Hop> getAllHops(){
        return hopRepository.findAll();
    }
    @GetMapping("hops/{hopId}")
    public Hop getHopWithId(@PathVariable Long hopId){
        return hopRepository.findById(hopId).get();
    }
    @PostMapping("hops")
    public Hop addHop(@RequestBody Hop hop){
        return hopRepository.save(hop);
    }
    @PutMapping("hops/{hopId}")
    public Hop updateHop(@PathVariable Long hopId, @RequestBody Hop hop){
        Hop hopToModified = hopRepository.findById(hopId).get();
        hopToModified.setName(hop.getName());
        hopToModified.setCharacterDescription(hop.getCharacterDescription());
        hopToModified.setType(hop.getType());
        hopToModified.setStyle(hop.getStyle());
        return hopRepository.save(hopToModified);
    }
    @DeleteMapping("hops/{hopId}")
    public Boolean deleteHop(@PathVariable Long hopId){
        hopRepository.deleteById(hopId);
        return true;
    }




}
