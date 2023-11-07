package com.myProject.beerTheStrong.Controller;

import com.myProject.beerTheStrong.Entity.HopList;
import com.myProject.beerTheStrong.Repository.HopListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class HopListController {
    @Autowired
    HopListRepository hopListRepository;
    @GetMapping("hopsList")
    public List<HopList> getAllHopsList(){
        return hopListRepository.findAll();
    }
    @GetMapping("hopsList/{hopListId}")
    public HopList getHopWithId(@PathVariable Long hopListId){
        return hopListRepository.findById(hopListId).get();
    }

    @PostMapping("hopsList")
    public HopList addHopList(@RequestBody HopList hopList){
        return hopListRepository.save(hopList);
    }

    @PutMapping("hopsList/{hopListId}")
    public HopList updateHopList(@PathVariable Long hopListId, @RequestBody HopList hopList){
        HopList hopListToModified = hopListRepository.findById(hopList.getId()).get();
        hopListToModified.setQuantity(hopList.getQuantity());
        hopListToModified.setHop(hopList.getHop());
        hopListToModified.setWhenAdd(hopList.getWhenAdd());
        return hopListRepository.save(hopListToModified);
    }

    @DeleteMapping("hopsList/{hopId}")
    public Boolean deleteHopList(@PathVariable Long hopListId){
        hopListRepository.deleteById(hopListId);
        return true;
    }
}
