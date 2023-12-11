package com.shristi.fun;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConDemo {
	public static void main(String[] args) {
	
		// implementation
		Consumer<String> con = (String str)-> System.out.println(str.toUpperCase());
		con.accept("sri");
		Consumer<Integer> conin = num-> System.out.println("Square "+(num*num));
		conin.accept(10);
		
		BiConsumer<String, String> bicon = (username,city)->{
			System.out.println("Welcome "+username + " to "+city);
		};
		bicon.accept("Sri", "Bangalore");
		
		BiConsumer<Integer, Integer> intcon = (num1, num2)->System.out.println("Sum "+(num1+num2));
		intcon.accept(10, 20);
		
		
		BiConsumer<List<String>, String> listcon = (usernames, user)->{
			boolean flag=true;
			for (String username : usernames) {
				if(username.equals(user)) {
					System.out.println("Welcome "+username.toUpperCase());
					flag=false;
				}
			}
			if(flag){
				System.out.println("Wrong username");
			}
			
		};
		
		listcon.accept(Arrays.asList("Jagan","Keerthi","Chitra","Rahul"), "Rahul");
		
	}

}
