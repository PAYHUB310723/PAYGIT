package oops;

public class MethodOverloadingEx {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		//overloaded method
		calculator.sum(1, 1.1f);
		// overloaded constructor
		Calculator calculator1 = new Calculator(1, 1.1f);
	}
}

class Calculator {
	  Calculator() {
		System.err.println("default cons");
	}
	public  Calculator(int num1, int num2) {
		System.err.println(num1 + num2);
	}

	public  Calculator(int num1, int num2, int num3) {
		System.err.println(num1 + num2 + num3);
	}

	// different data types
	public  Calculator(float num1, float num2) {
		System.err.println(num1 + num2);
	}

	// different order
	public  Calculator(float num1, int num2) {
		System.err.println(num1 + num2);
	}

	public  Calculator(int num1, float num2) {
		System.err.println("Calculator(int num1, float num2)");
		System.err.println(num1 + num2);
	}

	// same data type / different number of agrs
	public void sum(int num1, int num2) {
		System.err.println(num1 + num2);
	}

	public void sum(int num1, int num2, int num3) {
		System.err.println(num1 + num2 + num3);
	}

	// different data types
	public void sum(float num1, float num2) {
		System.err.println(num1 + num2);
	}

	// different order
	public void sum(float num1, int num2) {
		System.err.println(num1 + num2);
	}

	public void sum(int num1, float num2) {
		System.err.println("sum(int num1, float num2) ");
		System.err.println(num1 + num2);
	}
}