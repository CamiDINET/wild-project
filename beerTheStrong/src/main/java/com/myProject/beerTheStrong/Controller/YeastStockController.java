package com.myProject.beerTheStrong.Controller;


import com.myProject.beerTheStrong.Entity.YeastStock;
import com.myProject.beerTheStrong.Repository.YeastStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin
@RestController
public class YeastStockController {
    @Autowired
    YeastStockRepository yeastStockRepository;
    @GetMapping("/yeastsStock")
    public List<YeastStock> getAllYeasts(){
        return yeastStockRepository.findAll();
    }

    @GetMapping("yeastsStock/{yeastStockId}")
    public YeastStock getHopWithId(@PathVariable Long yeastStockId){
        return yeastStockRepository.findById(yeastStockId).get();
    }

    @PostMapping("yeastsStock")
    public YeastStock addYeast(@RequestBody YeastStock yeastStock){
        return yeastStockRepository.save(yeastStock);
    }

    @PutMapping("yeastsStock/{hopStockId}")
    public YeastStock updateYeast(@PathVariable Long yeastStockId, @RequestBody YeastStock yeastStock){
        YeastStock yeastStockToModified = yeastStockRepository.findById(yeastStockId).get();
        yeastStockToModified.setStockQuantity(yeastStock.getStockQuantity());
        yeastStockToModified.setType(yeastStock.getType());
        return yeastStockRepository.save(yeastStockToModified);
    }

    @DeleteMapping("hops/{yeastId}")
    public Boolean deleteYeast(@PathVariable Long yeastId){
        yeastStockRepository.deleteById(yeastId);
        return true;
    }
}
