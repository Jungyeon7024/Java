package com.kh.switchsample;

public class SwitchSample {

	public static void main(String[] args) {
		// switch문
		/*
		 특정 변수나 표현식의 값에 따라 다양한 경우를 처리하는 제어 구조
		 switch문은 일련의 case 문과 해당 값을 비교하여 일치하는 경우에 해당하는 코드 블록을 실행
		 각 case문 뒤에는 일치하는 값이나 표현식이 나옴
		 
		 switch (변수 또는 표현식) {
		 	case 값1 :
		 		// 값1에 해당하는 코드 
		 		 break;// 해당 블록의 실행을 중단하는 역할
		 	case 값2 :
		 		// 값2에 해당하는 코드
		 		 break;
		 	default:
		 		// 위 모든 케이스와 일치하지 않을 때 실행되는 코드 
		 }
		 **/
		
		int day = 30;
		switch (day) {
		   case 1:
			   System.out.println("월요일");
			   break;
		   case 2:
			   System.out.println("화요일");
			   break;
		   case 30:
			   System.out.println("수요일");
			   break;
		   default :
			   System.out.println("주말");
		}
		
		// 커피를 주문할게요.
		int choice = 6;
		switch (choice) {
		  case 1:
			  System.out.println("아메리카노");
			  break;
		  case 2:
			  System.out.println("카페라때");
			  break;
		  case 3:
			  System.out.println("아인슈패너");
			  break;
		  case 4: 
			  System.out.println("흑당 버블티");
			  break;
		  default :
			  System.out.println("다시");
		}

	}

}
