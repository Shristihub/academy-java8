package com.shristi.def;

public class EmpMain {

	public static void main(String[] args) {
		BonusCalculator calculator = new Employee();
		calculator.calcBonus(1000);
		calculator.policyType();
		
		// call static method using interfacename
		BonusCalculator.call();
		
	}

}
