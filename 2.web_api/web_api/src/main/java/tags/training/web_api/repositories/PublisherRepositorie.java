package tags.training.web_api.repositories;

import org.springframework.data.repository.CrudRepository;
import tags.training.web_api.domain.Publisher;

public interface PublisherRepositorie extends CrudRepository<Publisher,Long> {
}
