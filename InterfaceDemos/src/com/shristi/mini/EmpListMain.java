package com.shristi.mini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EmpListMain {
	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(
				new Employee("Arav", 1, "Bangalore", 2000),
				new Employee("Athira", 2, "Chennai", 3000), 
				new Employee("Roy", 3, "Bangalore", 4000),
				new Employee("Pranav", 4, "Chennai", 5000));
		
		System.out.println("Using consumer");
		
		Consumer<List<Employee>> empcon = (emplist)->{
			for (Employee employee : employeeList) {
				System.out.println(employee.getEmpName().toUpperCase());
			}
		};
		empcon.accept(employeeList);
		System.out.println();
		System.out.println("Using biconsumer");
		BiConsumer<List<Employee>,String> biempcon = (emplist,city)->{
			for (Employee employee : employeeList) {
				if(employee.getCity().equals(city))
					System.out.println(employee.getEmpName().toUpperCase());
			}
		};
		biempcon.accept(employeeList, "Bangalore");
		
		
		System.out.println();
		System.out.println("Using function");
		BiFunction<List<Employee>,String,List<Employee>> funemp = (emplist,city)->{
			List<Employee> employeesByCity = new ArrayList<>();
			for (Employee employee : employeeList) {
				if(employee.getCity().equals(city))
					employeesByCity.add(employee);
			}
			return employeesByCity;
		};
		
		System.out.println(funemp.apply(employeeList, "Chennai"));
		
		
		System.out.println();
		System.out.println("Using bifunction");
		BiFunction<List<Employee>,String,List<String>> bifunemp = (emplist,city)->{
			List<String> employeeNames = new ArrayList<>();
			
			for (Employee employee : employeeList) {
				if(employee.getCity().equals(city))
					employeeNames.add(employee.getEmpName().toUpperCase());
			}
			return employeeNames;
		};
		
		System.out.println(bifunemp.apply(employeeList, "Bangalore"));
		
		System.out.println();
		System.out.println("Using Supplier");
		Supplier<List<Employee>>  sup = ()->employeeList;
		System.out.println(sup.get());
		
		System.out.println();
		System.out.println("Using Predicate");
		BiPredicate<List<Employee>, Double> bipred = (empList,salary)->{
			for (Employee employee : empList) {
				if(employee.getSalary()>salary)
					System.out.println(" You are selected for bonus "+employee.getEmpName());
			}
			return true;
		};
		
		System.out.println(bipred.test(employeeList, 2000.0));
	}
}
