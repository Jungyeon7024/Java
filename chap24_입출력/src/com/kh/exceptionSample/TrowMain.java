package com.kh.exceptionSample;

import java.util.Scanner;

/*
throw
	예외를 발생시키는 키워드
	프로그램 실행 중 예기치 않은 상황이 발생됐을 때 사용
	예외를 방ㄹ생시키면 예외 처리가 시작되고
	프로그램은 해당 예외를 적절히 처리하거나 상위 호출 스택 에외를 전파한다.
	
	user 숫자를 입력해야함.
	양수만 입력해야하는데 음수를 입력함 > 음수인 경우 예외를 발생시키는 간단한 예제
*/
public class TrowMain {

	public static void main(String[] args) {
		try {
			int number = getNumber();
			if(number <0) {
				throw new NegativeNumberException("음수는 허용하지 않는다"	);
			}
			System.out.println("입력한 숫자 :" + number);
		} catch(NegativeNumberException e) {
			System.out.println("비상!"+ e.getMessage);
			
		}
		
		
		

	}
	
	public static int getNumber()	{//사용자로부터 숫자를 입력 받는 메서드
		//여기에 음수를 넣으면 예외 발생
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해");
		int number = sc.nextInt();
		return number ;
		
	}
}


public class NegativeNumberException extends Exception {
	//NegativeNumberException 사용자 정의 예외 클래스 
	public NegativeNumberException(String msg) {
		super(msg);
	}
	
	
}
