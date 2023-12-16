package com.bookapp.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService {
	
	@Override
	public List<Book> getAll() {
		List<Book>  books = BookDetails.showBooks();
		return books.stream()
				.sorted((b1,b2)->b1.getTitle().compareTo(b2.getTitle()))
				.collect(Collectors.toList());
//				.toList();
	}

	@Override
	public Book getById(int bookId) throws IdNotFoundException {
		List<Book>  books = BookDetails.showBooks();
//		for (Book book : books) {
//			if(book.getBookId()==bookId) {
//				return book;
//			}
//		}
//		throw new IdNotFoundException("invalid Id");
		
		return books.stream().filter(book->book.getBookId()==bookId)
		             .findFirst()
		             .orElseThrow(()->new IdNotFoundException("invalid Id"));
		
		
	}

	@Override
	public List<Book> getByAuthor(String author) throws BookNotFoundException {
		List<Book>  books = BookDetails.showBooks();
		List<Book>  booksByAuthor =  books.stream()
					  .filter(book->book.getAuthor().equals(author))
					  .sorted((b1,b2)->b1.getTitle().compareTo(b2.getTitle()))
		              .collect(Collectors.toList());
		if(booksByAuthor.isEmpty())
			throw new BookNotFoundException("book with this author not found");
		
		return booksByAuthor;
	}
	@Override
	public List<Book> getByAuthorAndPriceLessThan(String author,double price)  throws BookNotFoundException {
		List<Book>  books = BookDetails.showBooks();
		List<Book>  booksByAuthorPrice = books.stream()
		  .filter(book->book.getAuthor().equals(author) && book.getPrice()<price)
		  .collect(Collectors.toList());
		if(booksByAuthorPrice.isEmpty())
			throw new BookNotFoundException("book with this author  & lesser price not found");
		
		return booksByAuthorPrice;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book>  books = BookDetails.showBooks();
		List<Book> booksByCategory =  books.stream()
			  .filter(book->book.getCategory().equals(category))
//			  .sorted((b1,b2)->{
//				  Double price1 = b1.getPrice();
//				  Double price2 = b2.getPrice();
//				  return price1.compareTo(price2);
//			  }); 
			 .sorted((b1,b2)->((Double)b1.getPrice()).compareTo((Double)(b2.getPrice())))
			 .collect(Collectors.toList());
		 if(booksByCategory.isEmpty())
				throw new BookNotFoundException("book with this category not found");
			
			return booksByCategory; 
			  
	}

	@Override
	public List<Book> getByPublishedYear(int year) throws BookNotFoundException {
		List<Book>  books = BookDetails.showBooks();
		List<Book> booksByYear =  books.stream()
					.filter(book->book.getPublishedDate().getYear()==year)
					.sorted((b1,b2)->b1.getTitle().compareTo(b2.getTitle()))
		             .collect(Collectors.toList());
		if(booksByYear.isEmpty())
			throw new BookNotFoundException("book published in this year not found");
		
		return booksByYear;
		
	}

	@Override
	public List<Book> getByYearsBetween(int startyear, int endyear) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) {
		List<Book>  books = BookDetails.showBooks();
		List<Book>  booksByPrice = books.stream()
		  .filter(book-> book.getPrice()<price)
		  .collect(Collectors.toList());
		if(booksByPrice.isEmpty())
			throw new BookNotFoundException("book with this lesser price not found");
		
		return booksByPrice;
	}

}
