package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {
		// 숫자입력.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자 입력");
		char inputChar = sc.next().charAt(0);//입력받은 문자 출력.
		
		int intputChar;
		int changeChar = intputChar;
		System.out.println("입력 문자 : "+ inputChar + "유니코드 : "+changeChar);
		

	}

}
