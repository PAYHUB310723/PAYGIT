package com.demo.oops;

public class StaticEx {
public static void main(String[] args) {
	Test testInstance = new Test();
	testInstance.instanceMethod();
	Test.staticMethod();
	System.out.println("***********");
	testInstance.staticMethod();
}
}

class Test {
	public void instanceMethod() {
		System.err.println("Instance");
	}
	public static void staticMethod() {
		System.out.println("Static");
	}
}