package com.kh.whilesample;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;
		
		
		while(isTrue) { //isTrue =true 이기 때문에 사용 
			System.out.println("커피를 주문해. 1.아메리카노 2.카푸치노 3.말차밀크티");
			int choice = sc.nextInt(); // while 안으로 이동
			
			switch (choice) {
				case 1:
					System.out.println("아메리카노 주문");
					isTrue =false; // 아메리카노 주문을 받았으니 while 문을 종료하기 위해서 false를 넣는다.
					break;
				case 2: 
					System.out.println("카푸치노 주문");
					isTrue = false;
					break;
				case 3:
					System.out.println("말차밀크티 주문");
					isTrue =false;
					break;
				default:
					System.out.println("다시 주문해라");
			}
		}
		

	}

}
