package udemy.springframework5guru.springrecipe.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.springframework5guru.springrecipe.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
