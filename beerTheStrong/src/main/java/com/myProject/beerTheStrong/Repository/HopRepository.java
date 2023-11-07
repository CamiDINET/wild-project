package com.myProject.beerTheStrong.Repository;

import com.myProject.beerTheStrong.Entity.Hop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HopRepository extends JpaRepository<Hop, Long> {
}
