package com.myProject.beerTheStrong.Repository;

import com.myProject.beerTheStrong.Entity.HopList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HopListRepository extends JpaRepository<HopList, Long> {
}
