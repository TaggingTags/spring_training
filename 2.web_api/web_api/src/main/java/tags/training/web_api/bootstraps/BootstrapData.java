package tags.training.web_api.bootstraps;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tags.training.web_api.domain.Author;
import tags.training.web_api.domain.Book;
import tags.training.web_api.domain.Publisher;
import tags.training.web_api.repositories.AuthorRepositorie;
import tags.training.web_api.repositories.BookRepositorie;
import tags.training.web_api.repositories.PublisherRepositorie;

@Component
public class BootstrapData implements CommandLineRunner {

    private  final AuthorRepositorie authorRepositorie;
    private  final BookRepositorie bookRepositorie;
    private  final PublisherRepositorie publisherRepositorie;

    public BootstrapData(AuthorRepositorie authorRepositorie, BookRepositorie bookRepositorie, PublisherRepositorie publisherRepositorie) {
        this.authorRepositorie = authorRepositorie;
        this.bookRepositorie = bookRepositorie;
        this.publisherRepositorie = publisherRepositorie;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author ("Eric", "Evans");
        Book ddd = new Book("Domain Driven Deseign","123123");

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepositorie.save(eric);
        bookRepositorie.save(ddd);

        Author rafa = new Author("Rafael", "Santos");
        Book qi = new Book("Quinto Imperio", "879645312");

        rafa.getBooks().add(qi);
        qi.getAuthors().add(rafa);

        authorRepositorie.save(rafa);
        bookRepositorie.save(qi);

        Publisher pub = new Publisher("pubBooks", "rua antonio", "Lisboa", "Liboa", "2710-999");

        publisherRepositorie.save(pub);

        System.out.println("Started Bootstrap");
        System.out.println("Booc count : " + bookRepositorie.count());
        System.out.println("Publisher count : " + publisherRepositorie.count());


    }
}
