package com.kh.Inheritance.calculator;

import java.util.Scanner;

public class CalculatorRun extends Calculator {

	public static void main(String[] args) {
		
		CalculatorForMod cal = new CalculatorForMod();
		System.out.println("sum = "+ cal.add());
		System.out.println("mu1=" +cal.multiply());
		System.out.println("mod");
		
	}

}
