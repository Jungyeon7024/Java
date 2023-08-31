package com.kh.practice3;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("번호만 입력 바람// 1.입력 2.수정 3.조회 4.삭제 7.종료");
		int choice = sc.nextInt(); // 번호 입력
		
		/** 1.if문 **/
		if (choice ==1) {
			System.out.println("입력");
		} else if (choice ==2 ) {
			System.out.println("수정");
		} else if (choice ==3) {
			System.out.println("조회");
		} else if (choice ==4) {
			System.out.println("삭제");
		} else if (choice ==7) { // else를 쓸 경우 조건을 넣지 못하기 때문에 else if를 써야함
			System.out.println("종료");
		}
		
		/** 2. switch문 **/
		switch(choice ) {
		case 1:  
			System.out.println("입력");
			break;
		case 2: 
			System.out.println("수정");
			break;
		case 3: 	
			System.out.println("조회");
			break;
		case 4: 	
			System.out.println("삭제");
			break;
		case 7: 	
			System.out.println("종료");
			break;
		default :	
			System.out.println("다시해");
		
			
		}
		
		
	}

}
