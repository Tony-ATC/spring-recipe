package udemy.springframework5guru.springrecipe.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.springframework5guru.springrecipe.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
