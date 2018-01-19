package com.assignmentsjavaoopadvance;

public class Calculator1Test {

	public static void main(String[] args) {
		Calculator1 calculator = new Calculator1();
		
		calculator.setOperandOne(10.5);
		calculator.setOperation("+");
		calculator.setOperandTwo(5.2);
		System.out.println(calculator.performOperation().getResults());
		
	}
}
