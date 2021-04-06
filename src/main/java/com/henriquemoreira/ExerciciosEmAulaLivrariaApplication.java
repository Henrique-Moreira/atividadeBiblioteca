package com.henriquemoreira;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.henriquemoreira.domain.Book;
import com.henriquemoreira.domain.Library;
import com.henriquemoreira.repository.BookRepository;
import com.henriquemoreira.repository.LibraryRepository;

@SpringBootApplication
public class ExerciciosEmAulaLivrariaApplication implements CommandLineRunner{
	
	@Autowired
	LibraryRepository libraryRepo;
	
	@Autowired
	BookRepository bookRepo;


	public static void main(String[] args) {
		SpringApplication.run(ExerciciosEmAulaLivrariaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
	
	Library lib1 = new Library(null, "Livraria da esquina");
	
	Book book1 = new Book(null, "Narnia", lib1);
	Book book2 = new Book(null, "Harry Potter", lib1);
	
	libraryRepo.save(lib1);
	
	bookRepo.save(book1);
	bookRepo.save(book2);
	
	}

}
