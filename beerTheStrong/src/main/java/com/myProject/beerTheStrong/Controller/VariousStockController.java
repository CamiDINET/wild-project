package com.myProject.beerTheStrong.Controller;


import com.myProject.beerTheStrong.Entity.VariousStock;
import com.myProject.beerTheStrong.Repository.VariousStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin
@RestController
public class VariousStockController {
    @Autowired
    VariousStockRepository variousStockRepository;
    @GetMapping("/variousStock")
    public List<VariousStock> getAllVarious(){
        return variousStockRepository.findAll();
    }

    @GetMapping("variousStock/{variousStockId}")
    public VariousStock getVariousWithId(@PathVariable Long variousStockId){
        return variousStockRepository.findById(variousStockId).get();
    }

    @PostMapping("/variousStock")
    public VariousStock addVarious(@RequestBody VariousStock variousStock){
        return variousStockRepository.save(variousStock);
    }

    @PutMapping("variousStock/{variousStockId}")
    public VariousStock updateVarious(@PathVariable Long variousStockId, @RequestBody VariousStock variousStock){
        VariousStock variousStockToModified = variousStockRepository.findById(variousStockId).get();
        variousStockToModified.setStockQuantity(variousStock.getStockQuantity());
        return variousStockRepository.save(variousStockToModified);
    }

    @DeleteMapping("variousStock/{variousStockId}")
    public Boolean deleteVarious(@PathVariable Long variousStockId){
        variousStockRepository.deleteById(variousStockId);
        return true;
    }
}
