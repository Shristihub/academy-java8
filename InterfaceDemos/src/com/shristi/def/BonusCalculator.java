package com.shristi.def;

public interface BonusCalculator {

	void calcBonus(int amount);
	default void policyType() {
		System.out.println("Policy for bonus");
	}
	
	// static method
	// cannot be overridden
	static void call() {
		System.out.println("same message for all classes");
	}
}
