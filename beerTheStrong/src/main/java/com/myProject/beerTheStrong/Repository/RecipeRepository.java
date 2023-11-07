package com.myProject.beerTheStrong.Repository;

import com.myProject.beerTheStrong.Entity.Boiling;
import com.myProject.beerTheStrong.Entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
