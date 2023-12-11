package com.shristi.training;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		String str = null;
//		System.out.println(str.toUpperCase());
		
		
	 Optional<String> optstr =  Optional.ofNullable(str);
//	 System.out.println(optstr.get());
	 
	 optstr.ifPresent(System.out::println);
	 
	 Optional<String> optstr1 = Optional.of("hello");
	 optstr1.ifPresent(System.out::println);
	 
	 if(optstr1.isPresent())
		 System.out.println(optstr1.get().toUpperCase());
	 
	 if(!optstr1.isEmpty())
		 System.out.println(optstr1.get().concat(" java"));
	 
	 optstr.ifPresentOrElse(str1->System.out.println(str1), ()->System.out.println("No data found"));
	 optstr1.ifPresentOrElse(str1->System.out.println(str1), ()->System.out.println("No data found"));
	 
	 
	Optional<String> optcourses = Arrays.asList("java","spring","node")
	          			.stream()
	          			.filter(str1->str1.startsWith("p"))
	          			.findFirst();
	optcourses.ifPresent(System.out::println);
	
	          
	 // orElse, orElseGet,orElseThrow, orElseThrows
	
	System.out.println("OrElse");
	String result=	Arrays.asList("java","spring","node")
			.stream()
			.filter(str1->str1.startsWith("p"))
			.findFirst()
			.orElse("Course not available");
	 
	System.out.println(result);
	System.out.println();
	String data = "welcome";	
	System.out.println("OrElseGet");
	result=	Arrays.asList("java","spring","node")
			.stream()
			.filter(str1->str1.startsWith("p"))
			.findFirst()
	    	.orElseGet(()->{
	    		if(data.startsWith("w"))
	    			return "invalid course".toUpperCase();
	    		else
	    			return "goodbye";
	    	});
	 System.out.println(result);
	 System.out.println();
	 System.out.println("orElseThrow");
//	 Arrays.asList("java","spring","node")
//		.stream()
//		.filter(str1->str1.startsWith("p"))
//		.findFirst()
//		.orElseThrow();
	 
	 System.out.println();
	 System.out.println("orElseThrow");
	 Arrays.asList("java","spring","node")
		.stream()
		.filter(str1->str1.startsWith("p"))
		.findFirst()
		.orElseThrow(()->{
			throw new RuntimeException("no course found");
		});
	 
	 
	 
	}
}
