package com.shristi.def;

public class Employee implements AllowanceCalculator, BonusCalculator {

	@Override
	public void calcBonus(int amount) {
		System.out.println("Bonus "+(amount*5));
	}

	@Override
	public void calcAllowance(int amount) {
		System.out.println("Allowance "+(amount*2));
	}

	@Override
	public void policyType() {
		System.out.println("Policy for employee");
		AllowanceCalculator.super.policyType();
		BonusCalculator.super.policyType();
	}

}
