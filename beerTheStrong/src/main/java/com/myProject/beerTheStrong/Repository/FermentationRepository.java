package com.myProject.beerTheStrong.Repository;

import com.myProject.beerTheStrong.Entity.Boiling;
import com.myProject.beerTheStrong.Entity.Fermentation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FermentationRepository extends JpaRepository<Fermentation, Long> {
}
