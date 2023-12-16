package com.bookapp.service;

import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;

public interface IBookService {

	List<Book> getAll();
	Book getById(int bookId) throws IdNotFoundException;
	List<Book> getByAuthor(String author) throws BookNotFoundException;
	List<Book> getByAuthorAndPriceLessThan(String author,double price) throws BookNotFoundException;
	List<Book> getByCategory(String category) throws BookNotFoundException;
	List<Book> getByPublishedYear(int year) throws BookNotFoundException;
	List<Book> getByPriceLessThan(double price) throws BookNotFoundException;
	
	List<Book> getByYearsBetween(int startyear, int endyear) throws BookNotFoundException;
}
