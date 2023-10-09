package tyler.springframework.recipeproject.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import tyler.springframework.recipeproject.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);

}
