package com.kh.overloadingEx;

public class OverSample {

	public int sum(int a, int b) {
		return a+b;
	}
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	public double sum(double a, double b) {
		return a+b;
	}
	public double sum(double a, double b, double c) {
		return a+b+c;
	}
	public double sum(double a, int b) {
		return a+b;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverSample objs = new OverSample();
		
		System.out.println("두 정수의 합: " +objs.sum(10, 20));
		System.out.println("세 정수의 합: " +objs.sum(10, 20,30));
		System.out.println("두 실수와 정수의 합: " +objs.sum(10.5,19));
		System.out.println("두 실수의 합: " +objs.sum(12.5,13.5));
		System.out.println("세 실수의 합: " +objs.sum(10.5,10.5,10.5));
		
		
		
		
		
	}

}
