package com.shristi.training;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreams {

	public static void main(String[] args) {
		
		IntStream instream = Arrays.stream(new int[] {10,20,30,40});
		int sum = instream.sum();
		System.out.println(sum);
		
		OptionalDouble opt =  Arrays.stream(new int[] {10,20,30,40})
								.filter(num->num>40)				
								.average();
//		System.out.println(opt.getAsDouble());
		opt.ifPresent(System.out::println);
		
		
		int sum1 = IntStream.range(100,111).sum();
		System.out.println(sum1);
		
		long result = LongStream.of(200,300,400,500).reduce((x,y)->x*y).getAsLong();
		System.out.println(result);

	}

}
