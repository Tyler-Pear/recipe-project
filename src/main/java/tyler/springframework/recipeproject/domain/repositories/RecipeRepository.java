package tyler.springframework.recipeproject.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import tyler.springframework.recipeproject.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {



}
