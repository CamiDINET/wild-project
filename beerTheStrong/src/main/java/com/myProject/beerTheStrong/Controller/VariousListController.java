package com.myProject.beerTheStrong.Controller;

import com.myProject.beerTheStrong.Entity.VariousList;
import com.myProject.beerTheStrong.Repository.VariousListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin
@RestController
public class VariousListController {
    @Autowired
    VariousListRepository variousListRepository;
    @GetMapping("variousList")
    public List<VariousList> getAllVariousList(){
        return variousListRepository.findAll();
    }
    @GetMapping("variousList/{variousListId}")
    public VariousList getVariousWithId(@PathVariable Long variousListId){
        return variousListRepository.findById(variousListId).get();
    }

    @PostMapping("variousList")
    public VariousList addVariousList(@RequestBody VariousList variousList){
        return variousListRepository.save(variousList);
    }

    @PutMapping("variousList/{variousListId}")
    public VariousList updateVariousList(@PathVariable Long variousListId, @RequestBody VariousList variousList){
        VariousList variousListToModified = variousListRepository.findById(variousList.getId()).get();
        variousListToModified.setQuantity(variousList.getQuantity());
        variousListToModified.setVarious(variousList.getVarious());
        variousListToModified.setWhenAdd(variousList.getWhenAdd());
        return variousListRepository.save(variousListToModified);
    }

    @DeleteMapping("variousList/{variousId}")
    public Boolean deleteVariousList(@PathVariable Long variousListId){
        variousListRepository.deleteById(variousListId);
        return true;
    }

}
