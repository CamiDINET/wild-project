package com.myProject.beerTheStrong.Controller;

import com.myProject.beerTheStrong.Entity.Hop;
import com.myProject.beerTheStrong.Entity.HopStock;
import com.myProject.beerTheStrong.Repository.HopRepository;
import com.myProject.beerTheStrong.Repository.HopStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin
@RestController
public class HopStockController {
    @Autowired
    HopStockRepository hopStockRepository;
    @Autowired
    HopRepository hopRepository;

    @GetMapping("hopsStock")
    public List<HopStock> getAllHops(){
        return hopStockRepository.findAll();
    }
    @GetMapping("hopsStock/{hopStockId}")
    public HopStock getHopInStockWithId(@PathVariable Long hopStockId){
        return hopStockRepository.findById(hopStockId).get();
    }
    @PostMapping("hopsStock/{hopId}")
    public HopStock addHop(@RequestBody HopStock hopStock, @PathVariable Long hopId){
    Hop hopToSearch = hopRepository.findById(hopId).get();
    hopStock.setHop(hopToSearch);
        return hopStockRepository.save(hopStock);
    }
    @PutMapping("hopsStock/{hopStockId}")
    public HopStock updateHop(@PathVariable Long hopStockId, @RequestBody HopStock hopStock){
        HopStock hopStockToModified = hopStockRepository.findById(hopStockId).get();
        hopStockToModified.setCountry(hopStock.getCountry());
        hopStockToModified.setAlphaAcid(hopStock.getAlphaAcid());
        hopStockToModified.setHop(hopStock.getHop());
        hopStockToModified.setStockQuantity(hopStock.getStockQuantity());
        return hopStockRepository.save(hopStockToModified);
    }
    @DeleteMapping("hopsStock/{hopStockId}")
    public Boolean deleteHop(@PathVariable Long hopStockId){
        hopStockRepository.deleteById(hopStockId);
        return true;
    }
}
