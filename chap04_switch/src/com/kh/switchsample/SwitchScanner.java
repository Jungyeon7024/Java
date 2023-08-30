package com.kh.switchsample;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("과일을 선택해주세요.");
		//int fruit = 3;
		int fruit = sc.nextInt();
		
		switch (fruit) {
		case 1: 
			System.out.println("사과");
			break;
		case 2:
			System.out.println("포도");
			break;
		default:
			System.out.println("다시");
		}*/
		
		//scanner 를 이용해 과자를 선택하는 switch 하나 만들기
		
		System.out.println("뭐 먹을래");
		int snack =sc.nextInt();
		
		
		switch (snack ) {
		case 1:
			System.out.println("새우깡");
			break;
		case 2: 
			System.out.println("다이제");
			break;
		default :
			System.out.println("먹지마");
		}
		
		
		
		
		
		/*
		
		System.out.println("뭘로 주문하실래요?");
		System.out.println("1.아메리카노");
		System.out.println("2.아이스티");
		System.out.println("3.아인슈패너");
		int choice =sc.nextInt();
		
		switch (choice){
		case 1:
			System.out.println("아메리카노");
			break;
		case 2:
			System.out.println("아이스티");
			break;
		case 3:
			System.out.println("아인슈패너");
			break;
		case 4: 
			System.out.println("다시");
		}
		*/
	} 

}



//import java.util.Scanner; 스캐너 할때 꼭 써라.