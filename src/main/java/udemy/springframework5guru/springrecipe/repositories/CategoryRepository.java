package udemy.springframework5guru.springrecipe.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.springframework5guru.springrecipe.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
