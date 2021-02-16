package tags.training.web_api.repositories;

import org.springframework.data.repository.CrudRepository;
import tags.training.web_api.domain.Book;

public interface BookRepositorie extends CrudRepository<Book,Long> {
}
