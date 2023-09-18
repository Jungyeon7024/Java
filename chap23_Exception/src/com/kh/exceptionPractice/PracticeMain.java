package com.kh.exceptionPractice;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		pm.NumFormatException();

	}
	public void ArithException() {
		// int dividend / divisor 나누었을 때 예외처리 
		int dividend = 100;
		int divisor = 0;
		try {
			int result = dividend/divisor; //0으로 나누는 시도
			System.out.println(result);
		} catch(ArithmeticException aa) {
			System.out.println(aa.getMessage());
		}
		
	}

	public void NPException() {
		String text = "Hello World";
		String subText = null;
		//int length = text.length(); //Hello world 길이 얻기
		
		try {
			//indexOf subText 에 있는 null 값을 포함한 문자열 검색
			int length = text.indexOf(subText);
			System.out.println(length);
		} catch(NullPointerException n) {
			System.out.println("NullPointerException 에러 발생 :"+n.getMessage());
			
		}
	}
	public void NumFormatException() {
		try {
			String text = "123.45";
			int number = Integer.parseInt(text);
			//부적절한 형식의 문자열을 정수로 변환
			System.out.println(number);
		}catch(NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
		}
		
	}

}
