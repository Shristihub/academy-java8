package com.shristi.mini;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EmpMain {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Arav",1,"Bangalore",2000);
		
		System.out.println("Using Consumer");
		Consumer<Employee> conemp = emp->System.out.println(emp);
		conemp.accept(employee);
		
	
		System.out.println("Using Predicate");
		Predicate<Employee> preemp = emp->emp.getEmpId()<10;
		System.out.println(preemp.test(employee));
		System.out.println("Using BiPredicate");
		BiPredicate<Employee,Integer> biemp = (emp,id)->emp.getEmpId()<id;
		System.out.println(biemp.test(employee,10));
		System.out.println();
		BiPredicate<Employee,String> bipemp = (emp,city)->emp.getCity().equals(city);
		System.out.println(bipemp.test(employee,"Bangalore"));
		
		
		System.out.println("Using Function");
		Function<Employee, String> funemp = emp->emp.getEmpName();
		System.out.println(funemp.apply(employee));
		
		System.out.println("Using BiFunction");
		BiFunction<Employee,String,String> bifunemp = (emp,city)->{
			if(emp.getCity().equals(city))
				return "Welcome "+emp.getEmpName();
			else
				return "Sorry.. not eligible";
		};
		System.out.println(bifunemp.apply(employee, "Bangalore"));
		
		System.out.println("Using Supplier");
		Supplier<Employee> sup = ()-> new Employee("Jo",2,"Bangalore",5000);
		System.out.println(sup.get());
		
		
	}
}
