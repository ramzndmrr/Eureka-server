package com.kitaplik.bookservice;
import com.kitaplik.bookservice.model.Book;
import com.kitaplik.bookservice.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class BookServiceApplication implements CommandLineRunner{
	private final BookRepository bookRepository;

	public BookServiceApplication(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book2 = new Book("Hayvan Çiftliği",1999,"Robert Jordan","denene 123","demir yayın");
		Book book3 = new Book("Martin Eden",2020,"Robert Jordan","denene 123","demir yayın");
		bookRepository.save(book2);
		System.out.println(book2);
		System.out.println(book3);
	}
}
