package com.myProject.beerTheStrong.Controller;

import com.myProject.beerTheStrong.Entity.MaltList;
import com.myProject.beerTheStrong.Repository.MaltListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin
@RestController
public class MaltListController {
    @Autowired
    MaltListRepository maltListRepository;
    @GetMapping("maltsList")
    public List<MaltList> getAllMaltsList(){
        return maltListRepository.findAll();
    }
    @GetMapping("maltsList/{maltListId}")
    public MaltList getMaltWithId(@PathVariable Long maltListId){
        return maltListRepository.findById(maltListId).get();
    }

    @PostMapping("maltsList")
    public MaltList addMaltList(@RequestBody MaltList maltList){
        return maltListRepository.save(maltList);
    }

    @PutMapping("maltsList/{maltListId}")
    public MaltList updateMaltList(@PathVariable Long maltListId, @RequestBody MaltList maltList){
        MaltList maltListToModified = maltListRepository.findById(maltList.getId()).get();
        maltListToModified.setQuantity(maltList.getQuantity());
        maltListToModified.setMalt(maltList.getMalt());
        return maltListRepository.save(maltListToModified);
    }

    @DeleteMapping("maltsList/{maltId}")
    public Boolean deleteMaltList(@PathVariable Long maltListId){
        maltListRepository.deleteById(maltListId);
        return true;
    }
}
