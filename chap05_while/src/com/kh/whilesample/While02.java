package com.kh.whilesample;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**Scanner sc = new Scanner(System.in);
		
		boolean ischoice = false;
		
		
		while (!ischoice) { // !를 사용하여 true로 표기
			System.out.println("계절을 선택해주세요");
			
			int month = sc.nextInt();
			
			switch(month) {
			case 12: case 1: case 2:
				System.out.println("겨울");
				System.out.println("추우니깐 집에서 나가지 말아야지");
				ischoice = true; // 위 ! 느낌표가 있을 경우 참은 거짓으로 변경되고, 거짓은 참으로 변경되기 때문에 변경해 while문을 종료해준다.
				break; //break는 case문에서 실행하고자 하는게 종료된 후 한번 만 사용한다.
			case 3: case 4: case 5:
				System.out.println("봄");
				ischoice = true;
				break;
			case 6: case 7: case 8:
				System.out.println("여름");
				ischoice = true;
				break;
			case 9: case 10: case 11:
				System.out.println("가울");
				ischoice = true;
			default:
				System.out.println("다시 적어");
				
			}
			
		}
			/*
			 * 나이를 입력받아 성인(19~20) 청소년(14~18) 어린이(10~13)로 분류하고 출력하기
			 * while switch case 이용해서 출력하기 이외 나이는 다시 입력
			 * 놀이공원 입장 나이는 9살 이상부터
			 * 
			 * 
			 * 
			 * 
			 * */
		Scanner sc = new Scanner(System.in);
		
		boolean ischoice = false;
		
		while (!ischoice) {
			System.out.println("티켓을 구매하려면 나이를 입력하세요");
			
			int age = sc.nextInt();
			
			switch(age) {
			case 19: case 20:
				System.out.println("삐빅 성인 구매가능");
				ischoice = true;
				break;
			case 14: case 15: case 16: case 17: case 18:
				ischoice = true;
				System.out.println("삐빅 청소년 구매가능");
				break;
			case 13: case 12: case 11: case 10:
				ischoice = true;
				System.out.println("삐빅 어린이 구매가능");
				break;
			default:
				System.out.println("삐빅 나이먹고 다시오세요");
				
			}
			
		}
	
	
	
	
	}
	
	
	
	
	
		
}
