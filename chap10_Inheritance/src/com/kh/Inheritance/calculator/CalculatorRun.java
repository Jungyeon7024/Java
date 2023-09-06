package com.kh.Inheritance.calculator;

import java.util.Scanner;

public class CalculatorRun extends Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		int num1 = sc.nextInt();
		System.out.println("");
		int num2 = sc.nextInt();
		
		
		
		
		Calculator cal = new  Calculator();
		int result1 =  cal.add(10,5);
		int result2 = cal.substruct(10,5);
		int result3 = cal.multiply(10,5);
		int result4 = cal.divide(10,5);
		
		System.out.println("Add : "+result1);
		System.out.println("substruc: "+result2);
		System.out.println("multipld : "+result3);
		System.out.println("dividd : "+result4);
		
	}

}
