package com.shristi.lambda;

public class AnonyDemo {

	public static void main(String[] args) {
		// class that implements the interface
		Greeter greeter = new User();
		greeter.welcomeUser("Sri");
		
		// using annonymous inner class
		// only the implementation
		Greeter agreeter = new Greeter() {

			@Override
			public void welcomeUser(String username) {
				System.out.println("Hello "+username);
			}
		};
		//calling part
		agreeter.welcomeUser("Priya");
		
		// using anonymous inner class
		Details details = new Details() {

			@Override
			public void printMessage() {
				System.out.println("Great Day");
			}

			@Override
			public String showMessage() {
				return "Goodbye";
			}
			
		};
		
		details.printMessage();
		System.out.println(details.showMessage());
		
		
	}

}
