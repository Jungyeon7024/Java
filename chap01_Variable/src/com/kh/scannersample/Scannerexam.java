package com.kh.scannersample;

import java.util.Scanner;

public class Scannerexam {
	//정수 두개를 입력받아, 두 수의 합, 차, 곱, 나누기 한 몫과 나머지 출력.
	public static void main(String[] args) {
		int inum1 = 30;
		int inum2 = 3;
		
		System.out.println(inum1 - inum2);
		
		Scanner sc = new Scanner(System.in);
		
		int inum4, inum5;
		System.out.println("정수를 입력하세요 :")
		inum4 = sc.nextInt();
		inum5 = sc.nextInt();
		System.out.println(inum4 - inum5);
		System.out.println(inum4 + inum5);
		System.out.println(inum4 * inum5);
		System.out.println(inum4 / inum5);

		
		
	
		
		
		
		
		
	}

}
