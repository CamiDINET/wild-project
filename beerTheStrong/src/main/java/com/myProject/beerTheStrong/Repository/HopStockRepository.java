package com.myProject.beerTheStrong.Repository;

import com.myProject.beerTheStrong.Entity.HopStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HopStockRepository extends JpaRepository<HopStock, Long> {
}
