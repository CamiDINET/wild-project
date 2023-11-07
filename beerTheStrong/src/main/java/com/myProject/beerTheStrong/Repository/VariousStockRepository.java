package com.myProject.beerTheStrong.Repository;

import com.myProject.beerTheStrong.Entity.VariousStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VariousStockRepository extends JpaRepository<VariousStock, Long> {
}
