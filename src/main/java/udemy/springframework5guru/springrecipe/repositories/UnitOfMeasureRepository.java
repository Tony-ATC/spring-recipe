package udemy.springframework5guru.springrecipe.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.springframework5guru.springrecipe.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
