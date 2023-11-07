package com.myProject.beerTheStrong.Repository;

import com.myProject.beerTheStrong.Entity.Various;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VariousRepository extends JpaRepository<Various, Long> {
}
