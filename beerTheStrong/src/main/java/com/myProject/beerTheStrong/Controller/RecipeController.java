package com.myProject.beerTheStrong.Controller;


import com.myProject.beerTheStrong.Entity.Recipe;
import com.myProject.beerTheStrong.Repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin
@RestController
public class RecipeController {
    @Autowired
    RecipeRepository recipeRepository;
    @GetMapping("/recipes")
    public List<Recipe> getAllRecipes(){
        return recipeRepository.findAll();

    }
    @GetMapping("recipes/{recipeId}")
    public Recipe getRecipeWithId(@PathVariable Long recipeId){
        return recipeRepository.findById(recipeId).get();
    }
    @PostMapping("recipe")
    public Recipe addRecipe(@RequestBody Recipe recipe){
        return recipeRepository.save(recipe);
    }

    @PutMapping("recipe/{recipeId}")
    public Recipe updateRecipe(@PathVariable Long recipeId, @RequestBody Recipe recipe){
        Recipe recipeToModified = recipeRepository.findById(recipeId).get();
        recipeToModified.setAlcohol(recipe.getAlcohol());
        recipeToModified.setBoiling(recipe.getBoiling());
        recipeToModified.setEbc(recipe.getEbc());
        recipeToModified.setDate(recipe.getDate());
        recipeToModified.setFermentation(recipe.getFermentation());
        recipeToModified.setIbu(recipe.getIbu());
        recipeToModified.setName(recipe.getName());
        recipeToModified.setFinalDegreeBrix(recipe.getFinalDegreeBrix());
        recipeToModified.setFinalDensity(recipe.getFinalDensity());
        recipeToModified.setInitialDegreeBrix(recipe.getInitialDegreeBrix());
        recipeToModified.setInitialDensity(recipe.getInitialDensity());
        recipeToModified.setLiter(recipe.getLiter());
        recipeToModified.setPasting(recipe.getPasting());
        return recipeRepository.save(recipeToModified);
    }

    @DeleteMapping("recipe/{recipeId}")
    public Boolean deleteRecipe(@PathVariable Long recipeId){
        recipeRepository.deleteById(recipeId);
        return true;
    }
}
