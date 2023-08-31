package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수");
		double kor = sc.nextDouble();
		System.out.println("영어점수");
		double eng = sc.nextDouble();
		System.out.println("수학점수");
		double math = sc.nextDouble();
		
		
		int averageScore = (int) (kor + eng + math);
		int totalScore = (averageScore / 3);
		System.out.println("국어점수="+kor+"영어점수"+eng+"수학점수"+math+"총점"+averageScore+"평균"+totalScore);
		
		
				
		
	}

}
