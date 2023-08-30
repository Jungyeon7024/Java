package com.kh.ifsample;

public class IfElseIfSample {

	public static void main(String[] args) {
		// if-else if-else
		/*
		 여러 개의 조건을 연속적으로 평가 그 중 첫 번째 참인 조건에 해당하는 코드 블록을 실행하는 구조
		 만약 if나 else if 의 조건도 참이 아니라면 마지막 else 블록 실행
		 
		 if(조건1) { 
		  //조건1이 참일 때 실행되는 코드
		  } else if(조건2) {
		   // 조건2가 참일 때 실행되는 코드
		    } else {
		    //위의 모든 조건이 거짓일 때 실행되는 코드
		     }
		 
		 
		 * */
		int age = 20;
		if (age == 20) {
			System.out.println("해외여행을 갈거야!");
		} else if (age >= 20) {
			System.out.println("세계여행 갈거야!");
		} else { 
			System.out.println("세계여행 갈거야!");
		}

	
	// int score=85;
	/* 만약에 90점이 넘으면 A 
	        90점 미만이면 B
	        90점 이면 B+
	 * */
	 
	  //*
		int score = 85;
		if (score>90) {
			System.out.println("A");
		 } else if (score==90) {
			 System.out.println("B+");
		 } else  {
			 System.out.println("B");
		 }
	 
		 int hour=15; 
		 if (hour>12){
			 System.out.println("좋은아침입니다!"); 
		 } else if (hour<18) {
			 System.out.println("열심히코딩합시다!");
		 } else { 
			 System.out.println("수고하셨습니다!");
		 }
	
		 //날씨체크
		 int temp=28;
		 if(temp>30) {
			 System.out.println("더운 날씨입니다.");
		 } else if (temp >20) { 
			 System.out.println("적당한 날씨입니다");
		 } else { 
			 System.out.println("쌀쌀한 날씨입니다.");
		 }
		 
		 
	    int number = -5;
	    if(number>0){
	    	System.out.println("양수입니다!");
	    } else if (number <0 ) {
	    	System.out.println("음수입니다!");
	    } else {
	    	System.out.println("0입니다.");
	    }

	
		int myAge= 15;
		if(myAge>=14 && myAge <=20) { //14~20
			System.out.println("청소년");
		} else if(myAge>20) { //21살 이상
			System.out.println("성인");
		}else {
			System.out.println("어린이");
		}

		int month=11;
		if (month ==1 || month==2 || month ==12) {
			System.out.println("겨울");
		} else if (month>=3 && month <= 5) { //3월 ~ 5월
			System.out.println("봄");
		} else if (month >=6 && month <=8) { // 6월~ 8월
			System.out.println("여름");
		} else	{ //9월 ~ 11월 
			System.out.println("가을");
		}
	}
	
}
// 줄 맞추기  안맞춰서 써 내려가다보면 괄호 더 쓰다가 처음부터 다시 찾아야하니깐 줄 제대로 맞춰가면서 쓰자 

	 
	 
	 
