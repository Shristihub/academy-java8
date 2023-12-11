package com.shristi.lambex;

public class ShapeFactory {

	void printArea(Shape shape, int x, int y) {
		System.out.println("Printing Area");
		shape.area(x, y);
		System.out.println("Completed");
		
	}
}
