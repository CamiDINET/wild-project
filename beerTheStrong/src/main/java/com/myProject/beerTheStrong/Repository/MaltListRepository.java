package com.myProject.beerTheStrong.Repository;

import com.myProject.beerTheStrong.Entity.MaltList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaltListRepository extends JpaRepository<MaltList, Long> {
}
