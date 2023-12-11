package com.shristi.lambda;

public class LambdaDemo {

	public static void main(String[] args) {
		//using lambda - implementation
		Greeter greeter = (String username)->{
			System.out.println("Welcome "+username);
		};
		greeter.welcomeUser("Sri");
		
		greeter = (username)->System.out.println("Hello "+username);
		greeter.welcomeUser("Priya");

	

	}

}
