package com.myProject.beerTheStrong.Repository;

import com.myProject.beerTheStrong.Entity.Boiling;
import com.myProject.beerTheStrong.Entity.YeastList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YeastListRepository extends JpaRepository<YeastList, Long> {
}
