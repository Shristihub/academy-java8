package com.shristi.fun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunDemo {

	public static void main(String[] args) {
		Function<String, String> fun1 = str->{
			return str.toUpperCase();
		};
		System.out.println(fun1.apply("priya"));
		
		fun1 = str->str.toUpperCase();
		System.out.println(fun1.apply("welcome"));
		
		Function<String, Integer> fun2 = str->str.length();
		System.out.println(fun2.apply("Sri"));
		
		Function<List<String>, String> funlist = usernames->{
			for (String username : usernames) {
				if(username.equals("Rahull")) {
					return "Welcome "+username.toUpperCase();
				}
			}
				return "Wrong username";
			
		};
		System.out.println(funlist.apply(Arrays.asList("Jagan","Keerthi","Chitra","Rahul")));
		
		
		
		BiFunction<String,Integer,String> bifun = (username,num)->{
			if(username.length()>num) {
				return "Name is accepted";
			}else
				return "not accepted";
		};
		System.out.println(bifun.apply("Henry", 3));
		
		
		// get the list of names starting with S
		BiFunction<List<String>,String,List<String>> bifunlist = (usernames,letter)->{
			List<String> usernamesWithS = new ArrayList<>();
			for (String username:usernames) {
				if(username.startsWith(letter))
					usernamesWithS.add(username);
			}
				
				return usernamesWithS;
		};
		System.out.println(bifunlist.apply(Arrays.asList("Sri","Rahul","Shraddha","Roni"), "S"));
		
	}
}
