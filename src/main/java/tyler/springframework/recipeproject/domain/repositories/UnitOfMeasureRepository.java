package tyler.springframework.recipeproject.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import tyler.springframework.recipeproject.domain.Category;
import tyler.springframework.recipeproject.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);

}
