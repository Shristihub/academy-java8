package com.shristi.fun;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupDemo {
	public static void main(String[] args) {
		
		Supplier<String> sup = ()->{
			return "Welcome ";
		};
		System.out.println(sup.get());
		
		Supplier<String> sup1 = ()->"Great Day";
		System.out.println(sup1.get());
		
		Supplier<Integer> insup = ()-> 100;
		System.out.println(insup.get());
		
		Supplier<Double> dsup = ()-> Math.pow(10, 2);
		System.out.println(dsup.get());
		
		IntSupplier intsup = ()->20;
		System.out.println(intsup.getAsInt());
		
		
		
		
	}

}
