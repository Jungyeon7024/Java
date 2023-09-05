package com.kh.classConstant;

public class Constant {
	public static final int a = 1; // 더 이상 a 값을 바꾸지 못하게 잠굼
	static final int b = 1;
	private final int c =1;
	public static void main(String[] args) {
		// 상수 사용 

		
		
		System.out.println("a의 값 : "+ a);
		System.out.println("b의 값 : "+ b);
		
		a= 2;
		System.out.println("a의 값 : "+ a);

	}

}
