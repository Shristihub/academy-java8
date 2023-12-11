package com.shristi.training;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CreateStreams {

	public static void main(String[] args) {
	
//		Consumer<String> con = str->System.out.println(str.toUpperCase());
		List<String> courses = Arrays.asList("Java","Spring","Angular","Node","Css","Html");
		// convert to stream
		courses.stream()
//				.sorted() // intermediate
				.forEach(str->System.out.println(str.toUpperCase())); // terminal
		

	}

}
