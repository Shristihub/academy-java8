package com.shristi.lambda;

public class LambdaMain {

	public static void main(String[] args) {

		LamCalculator adder = (int x, int y)->{
			return x+y;
		};
		System.out.println("Sum "+adder.calculate(10, 20));
		
		LamCalculator lam = (x,y)->x*y;
		System.out.println("product "+lam.calculate(2, 2));
		
		lam = (x,y)->x-y;
		System.out.println("Diff "+lam.calculate(20, 12));
		
		lam = (x,y)->x/y;
		System.out.println("Div "+lam.calculate(10, 2));
		
	}

}
