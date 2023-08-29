package com.kh.practice_func;

import java.util.Scanner;

public class VariablePractice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로의 길이는?");
		double width,height;
		System.out.print("세로의 길이는?");
		
		width = sc.nextDouble();
		height = sc.nextDouble();
		
		System.out.println("가로 : "+ width + "세로" + height);
		
	}

}
