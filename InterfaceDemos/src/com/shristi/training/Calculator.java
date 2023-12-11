package com.shristi.training;

public interface Calculator {

	void add(int x, int y);
	void product(int x, int y);
	//add new method using default keyword
	
	default void square(int x) {
		System.out.println("Square "+Math.pow(x, 2));
	}

}
