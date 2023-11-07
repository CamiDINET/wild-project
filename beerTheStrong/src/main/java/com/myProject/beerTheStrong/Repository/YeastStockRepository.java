package com.myProject.beerTheStrong.Repository;

import com.myProject.beerTheStrong.Entity.YeastStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YeastStockRepository extends JpaRepository<YeastStock, Long> {

}
