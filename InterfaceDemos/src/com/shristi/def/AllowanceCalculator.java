package com.shristi.def;

public interface AllowanceCalculator {

	void calcAllowance(int amount);
	default void policyType() {
		System.out.println("Policy for allowance");
	}
}
