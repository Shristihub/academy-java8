package com.shristi.lambex;

public class LambDemo {

	public static void main(String[] args) {
		Shape shape = new Rectangle();
		ShapeFactory factory = new ShapeFactory();
//		factory.printArea(new Rectangle(), 10, 20);
		factory.printArea(shape, 10, 20);
		
		System.out.println();
		
		// anonymous inner class
		factory.printArea(new Shape() {
			@Override
			public void area(int x, int y) {
				System.out.println("Area calculation");
				System.out.println("Triangle Area "+(0.5*x*y));
			}
			
		}, 10, 20);
		
		System.out.println();
		// using lambda expression
		factory.printArea((int x, int y)->{
			System.out.println("Square Area");
			System.out.println("Area is "+(x*y));
		}, 10, 10);
		
		
	}

}
