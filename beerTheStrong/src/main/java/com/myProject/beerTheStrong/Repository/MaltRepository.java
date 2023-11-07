package com.myProject.beerTheStrong.Repository;

import com.myProject.beerTheStrong.Entity.Malt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaltRepository extends JpaRepository<Malt, Long> {

}
