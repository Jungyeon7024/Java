package com.kh.mvc.circle.vo;

import java.util.Scanner;

public class CircleVeiw {

		public double getUserInput() {
			Scanner sc = new Scanner(System.in);
			System.out.println("ㅇㅁㅇ");
			return sc.nextDouble();
		}
		public void displayResult(double result) {
			System.out.println("ㅇㅁㅇ "+ result);
		}
}
