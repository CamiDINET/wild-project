package com.myProject.beerTheStrong.Controller;

import com.myProject.beerTheStrong.Entity.Hop;
import com.myProject.beerTheStrong.Entity.Malt;
import com.myProject.beerTheStrong.Entity.MaltStock;
import com.myProject.beerTheStrong.Repository.MaltRepository;
import com.myProject.beerTheStrong.Repository.MaltStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin
@RestController
public class MaltStockController {
    @Autowired
    MaltStockRepository maltStockRepository;
    @Autowired
    MaltRepository maltRepository;
    @GetMapping("maltsStock")
    public List<MaltStock> getAllMalts(){
        return maltStockRepository.findAll();
    }
    @GetMapping("maltsStock/{maltStockId}")
    public MaltStock getMaltWithId(@PathVariable Long maltId){

        return maltStockRepository.findById(maltId).get();
    }
    @PostMapping("maltsStock/{maltId}")
    public MaltStock addMalt(@RequestBody MaltStock maltStock, @PathVariable Long maltId){
        Malt maltToSearch = maltRepository.findById(maltId).get();
        maltStock.setMalt(maltToSearch);
        return maltStockRepository.save(maltStock);
    }
    @PutMapping("maltsStock/{maltStockId}")
    public MaltStock updateMalt(@PathVariable Long maltStockId, @RequestBody MaltStock maltStock){
        MaltStock maltStockToModified = maltStockRepository.findById(maltStockId).get();
        maltStockToModified.setMalt(maltStock.getMalt());
        maltStockToModified.setEbc(maltStock.getEbc());
        maltStockToModified.setStockQuantity(maltStock.getStockQuantity());
        return maltStockRepository.save(maltStockToModified);
    }
    @DeleteMapping("maltsStock/{maltStockId}")
    public Boolean deleteMalt(@PathVariable Long maltStockId){
        maltStockRepository.deleteById(maltStockId);
        return true;
    }
}
