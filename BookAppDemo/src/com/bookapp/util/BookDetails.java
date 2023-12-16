package com.bookapp.util;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {
	
	public static List<Book> showBooks(){
		return Arrays.asList(
				new Book(1, "Java in action", "Kathy", "Tech", 2000, LocalDate.of(1995,3, 10)),
				new Book(2, "Spring in action", "Rod", "Tech", 1340, LocalDate.of(2003,1, 30)),
				new Book(3, "The Placebo", "Joe", "Philosophy", 240, LocalDate.of(2012,12, 26)),
				new Book(4, "LeaderShip", "Robin", "Selfhelp", 790, LocalDate.of(1995,8, 18)),
				new Book(5, "5 am club", "Robin", "Selfhelp", 480, LocalDate.of(2010,2, 10)),
				new Book(6, "7 habits", "Steve", "Selfhelp", 1200, LocalDate.of(1995,10, 16))
				);
				
	}

}
