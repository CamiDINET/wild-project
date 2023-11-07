package com.myProject.beerTheStrong.Repository;

import com.myProject.beerTheStrong.Entity.Yeast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YeastRepository extends JpaRepository<Yeast, Long> {
}
