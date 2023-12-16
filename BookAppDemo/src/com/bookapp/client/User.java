package com.bookapp.client;

import java.time.LocalDate;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class User {

	public static void main(String[] args) {
		
		
		IBookService bookService = new BookServiceImpl();
		
		System.out.println("Get all books");
		bookService.getAll().forEach(System.out::println);
		
		System.out.println("Get books by author");
		bookService.getByAuthor("Kathy").forEach(System.out::println);
		
		System.out.println("Get books by category");
		bookService.getByCategory("Tech").forEach(System.out::println);
		
		System.out.println("Get books by Year");
		LocalDate date = LocalDate.now();
		bookService.getByPublishedYear(date.getYear()).forEach(System.out::println);
		
		System.out.println("Get books by author and price");
		bookService.getByAuthorAndPriceLessThan("Robin",500).forEach(System.out::println);
		
		
		System.out.println("Get book by Id");
		Book  book = bookService.getById(111);
		System.out.println(book);
		
		
		
		
		
		
	}
}
