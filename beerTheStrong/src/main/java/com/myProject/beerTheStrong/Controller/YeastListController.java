package com.myProject.beerTheStrong.Controller;

import com.myProject.beerTheStrong.Entity.YeastList;
import com.myProject.beerTheStrong.Repository.YeastListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin
@RestController
public class YeastListController {
    @Autowired
    YeastListRepository yeastListRepository;
    @GetMapping("yeastsList")
    public List<YeastList> getAllYeastsList(){
        return yeastListRepository.findAll();
    }
    @GetMapping("yeastsList/{maltListId}")
    public YeastList getYeastWithId(@PathVariable Long yeastListId){
        return yeastListRepository.findById(yeastListId).get();
    }

    @PostMapping("yeastsList")
    public YeastList addYeastList(@RequestBody YeastList yeastList){
        return yeastListRepository.save(yeastList);
    }

    @PutMapping("yeastsList/{yeastListId}")
    public YeastList updateYeastList(@PathVariable Long yeastListId, @RequestBody YeastList yeastList){
        YeastList yeastListToModified = yeastListRepository.findById(yeastList.getId()).get();
        yeastListToModified.setQuantity(yeastList.getQuantity());
        yeastListToModified.setYeast(yeastList.getYeast());
        yeastListToModified.setWhenAdd(yeastList.getWhenAdd());
        return yeastListRepository.save(yeastListToModified);
    }

    @DeleteMapping("yeastsList/{yeastId}")
    public Boolean deleteYeastList(@PathVariable Long yeastListId){
        yeastListRepository.deleteById(yeastListId);
        return true;
    }
}
