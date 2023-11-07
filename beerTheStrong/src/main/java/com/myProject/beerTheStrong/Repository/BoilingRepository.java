package com.myProject.beerTheStrong.Repository;

import com.myProject.beerTheStrong.Entity.Boiling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoilingRepository extends JpaRepository<Boiling, Long> {
}
