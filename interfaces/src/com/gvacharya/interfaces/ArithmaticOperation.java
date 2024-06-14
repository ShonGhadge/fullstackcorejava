package com.gvacharya.interfaces;

public interface ArithmaticOperation {
	
	public static final int count=0;
	
	int operation(int number1, int number2);
	
	public static void display() {
		System.out.println("Hello");
	}
	private int getAge() {
		return 10;
	}
	public default void showMessage() {
		System.out.println(getAge());
	}
}
