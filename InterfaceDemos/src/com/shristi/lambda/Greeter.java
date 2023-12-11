package com.shristi.lambda;

@FunctionalInterface
public interface Greeter {

	void welcomeUser(String username);
}

class User implements Greeter{

	@Override
	public void welcomeUser(String username) {
		System.out.println("Welcome "+username);
	}
	
}
