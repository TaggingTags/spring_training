package tags.training.web_api.repositories;

import org.springframework.data.repository.CrudRepository;
import tags.training.web_api.domain.Author;

public interface AuthorRepositorie extends CrudRepository<Author,Long> {
}
