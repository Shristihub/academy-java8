package com.shristi.training;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterStreams {

	public static void main(String[] args) {
		List<String> courses = Arrays.asList("Java","Spring","Angular","Node","Css","Html","Java","CSS");
		
		// filter, skip,limit, map, distinct, sorted,concat
		// foreach, collect
		
		System.out.println("Using Filter, skip, limit");
		courses.stream()
		       .filter(str->str.length()>3)
		       .sorted()
//		       .limit(3)
		       .skip(3)
//		       .forEach(str->System.out.println(str));
		       .forEach(System.out::println);
		
		Function<String, String> fun = str->str.toUpperCase();
		System.out.println();
		System.out.println("Using Map");
		courses.stream()
				.filter(str->str.contains("g"))
				.map(str->str.toUpperCase())
				.forEach(System.out::println);
		
		System.out.println();
		courses.stream()
//		.filter(str->str.contains("g"))
		
		.map(str->str.length())
		.sorted()
		.forEach(System.out::println);
		
		System.out.println();
		
		courses.stream()
		.map(String::toUpperCase)
		.distinct()
		.forEach(System.out::println);
		
		System.out.println();
		
		List<String> ncourses = courses.stream()
								.filter(str->str.length()>3)
								.sorted()
								.distinct()
								.collect(Collectors.toList());
//	       						.toList(); // Java 16
		
		ncourses.forEach(System.out::println);
		
		System.out.println();
		System.out.println("Using Concat");
		
		Stream.concat(Stream.of("apple","orange"), Stream.of("kiwi","grapes"))
		.forEach(System.out::println);
		
		
	}

}
