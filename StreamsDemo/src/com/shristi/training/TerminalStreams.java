package com.shristi.training;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class TerminalStreams {
	public static void main(String[] args) {
		List<String> courses = Arrays.asList("Java","Spring","Angular","Node","Css","Html","Java","CSS");
	   // foreach,collect, iterator, findFirst, orElse, orElseGet, reduce
		
		System.out.println("Using iterator");
		Iterator<String> itr =  courses.stream()
					.filter(str->str.length()>4)
					.iterator();
		
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		System.out.println();
		System.out.println("Using findFirst");
		Optional<String> optstring =   courses.stream()
						.filter(str->str.length()>3)
						.sorted()
						.findFirst();
		System.out.println(optstring.get());
		
		System.out.println("Using get directly");
		String result = courses.stream()
		.filter(str->str.length()>3)
		.sorted()
		.findFirst()
		.get();
		System.out.println(result);
		
		System.out.println();
		System.out.println("Using orElse");
		String result1 = courses.stream()
		.filter(str->str.length()>30)
		.sorted()
		.findFirst()
		.orElse("No value present");
		System.out.println(result1);
		
		System.out.println();
		System.out.println("Using orElseGet");
		String result2 = courses.stream()
		.filter(str->str.length()>30)
		.findFirst()
		.orElseGet(()->"Invalid Data".toUpperCase());
		System.out.println(result2);
		
		
		System.out.println();
		System.out.println("Using orElseThrow");
		String result3 = courses.stream()
		.filter(str->str.length()>3)
		.findFirst()
		.orElseThrow();
		System.out.println(result3);
		

		System.out.println();
		System.out.println("Using orElseThrow with params");
		String result4 = courses.stream()
		.filter(str->str.length()>3)
		.findFirst()
		.orElseThrow(()-> new RuntimeException("no data present"));
		System.out.println(result4);
		
		
		System.out.println();
		System.out.println("Using reduce");
		int sum = Arrays.stream(new int[] {10,20,30,40}).reduce((x,y)->x+y).getAsInt();
		System.out.println(sum);
		
		System.out.println();
		System.out.println("Using reduce with identity");
		sum = Arrays.stream(new int[] {10,20,30,40}).reduce(100,(x,y)->x+y);
		System.out.println(sum);
	}
	
		
	
	
}
