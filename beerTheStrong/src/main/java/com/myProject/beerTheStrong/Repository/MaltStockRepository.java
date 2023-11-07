package com.myProject.beerTheStrong.Repository;

import com.myProject.beerTheStrong.Entity.MaltStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaltStockRepository extends JpaRepository<MaltStock, Long> {
}
