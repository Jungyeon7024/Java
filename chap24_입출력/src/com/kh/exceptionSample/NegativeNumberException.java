package com.kh.exceptionSample;

import java.util.Scanner;

public class NegativeNumberException {
	public static int getNumber()	{//사용자로부터 숫자를 입력 받는 메서드
		//여기에 음수를 넣으면 예외 발생
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해");
		int number = sc.nextInt();
		return number ;
		
	}
	
}
