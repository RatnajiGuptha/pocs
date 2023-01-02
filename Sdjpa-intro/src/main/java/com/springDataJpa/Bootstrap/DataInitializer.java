package com.springDataJpa.Bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springDataJpa.Domain.Book;
import com.springDataJpa.Repository.BookRepository;

@Component
public class DataInitializer implements CommandLineRunner {

	private final BookRepository BookRepo;

	public DataInitializer(BookRepository BookRepo) {
		this.BookRepo = BookRepo;
	}

	@Override
	public void run(String... args) throws Exception {

		Book bookDDD = new Book("Domain", "123", "RandomHouse");

		System.out.println("Id: " + bookDDD.getId());

		Book saveDDD = BookRepo.save(bookDDD);
		System.out.println("Id: " + saveDDD.getId());

		Book bookSIA = new Book("Spring in action", "234", "Oriely");

		Book savedSIA = BookRepo.save(bookSIA);

		BookRepo.findAll().forEach(book -> {
			System.out.println("Book Id: " + book.getId());
			System.out.println("Book Title: " + book.getTitle());
		});

	}

}
