package com.shristi.fun;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredDemo {

	public static void main(String[] args) {
		
		Predicate<String> pred = (str)->{
			if(str.length()>5)
				return true;
			else
				return false;
		};
		System.out.println(pred.test("welcome"));
		
		Predicate<String> pred1 = str->str.length()>5;
		System.out.println(pred1.test("hello"));
		
		
		Predicate<Integer> predin = num->num>100;
		System.out.println(predin.test(200));
		
		
		BiPredicate<String, Integer> bipred = (str,num)->str.length()>num;
		System.out.println(bipred.test("hello",3));
		
		
		bipred = (str,num)->str.charAt(num)=='e';
		System.out.println(bipred.test("hello",3));
		
		
		IntPredicate inpred = num->num*num==100;
		System.out.println(inpred.test(10));
		
		DoublePredicate dpred = num->Math.random()<num;
		System.out.println(dpred.test(1));
//		LongPredicate
		
		
	}
}
