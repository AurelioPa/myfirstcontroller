package it.ntt.myfirstcontroller.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.ntt.myfirstcontroller.model.Author;
import it.ntt.myfirstcontroller.model.Book;
import it.ntt.myfirstcontroller.repository.AuthorRepository;
import it.ntt.myfirstcontroller.repository.BookRepository;

@Component
public class DataBootstrap implements CommandLineRunner{

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DataBootstrap(AuthorRepository authorRepository, BookRepository bookRepository){
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Author aurelio = new Author();
        aurelio.setName("Aurelio");
        aurelio.setSurname("Paolillo");
        
        Book book1 = new Book();
        book1.setTitle("SuperBOOK");
        book1.setIsbn("IS555X");

        book1.setAuthor(aurelio);

        authorRepository.save(aurelio);
        bookRepository.save(book1);
    }
    
}
