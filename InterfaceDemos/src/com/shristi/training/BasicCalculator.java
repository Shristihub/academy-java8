package com.shristi.training;

public class BasicCalculator implements Calculator{

	@Override
	public void add(int x, int y) {
		System.out.println("Sum "+(x+y));
	}

	@Override
	public void product(int x, int y) {
		System.out.println("Product "+(x*y));
		
	}

	@Override
	public void square(int x) {
		System.out.println("Square of two numbers "+(x*x));
		Calculator.super.square(x);
	}
	

}
