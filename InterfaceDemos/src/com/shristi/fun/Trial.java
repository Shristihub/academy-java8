package com.shristi.fun;

import java.util.function.Consumer;

public class Trial {

	public static void main(String[] args) {
	 // implementation
		Consumer<String> con = str->{
			System.out.println(str.toUpperCase());
		};
		//call
		con.accept("sri");
		
		con = str->System.out.println(str.toLowerCase());
		con.accept("PRIYA");
		
		Consumer<Integer> con1 = num->System.out.println(num*num);
		con1.accept(10);
		
	}
}
