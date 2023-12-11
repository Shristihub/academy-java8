package com.shristi.lambex;

public class Rectangle implements Shape{

	@Override
	public void area(int x, int y) {
		System.out.println("Calculating....");
		System.out.println("Area is "+x*y);
	}

}
