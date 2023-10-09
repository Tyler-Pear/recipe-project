package tyler.springframework.recipeproject.services;

import tyler.springframework.recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

}
