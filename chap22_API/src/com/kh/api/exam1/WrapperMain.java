package com.kh.api.exam1;

public class WrapperMain {
/*
 Wrapper 기본 데이터 유형을 객체로 래핑(wrap)
 		객체로 작업할 때 유용
 		클래스로는 Integer, Double, Boolean등이 있음
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num =40;
		System.out.println("정수값 : "+ num);
		
		int intValue = num.intValue();
		System.out.println("기본 데이터 유형 값 :"+ intValue);
		
		Double pi = 3.14159265359;
		
		double radius = 5.0;
		double area = pi * Math.pow(radius, 2);
		System.out.println("원의 넓이 :" + area);

		
		String numStr ="3.14";
		Double parsedDouble = Double.parseDouble(numStr);
		System.out.println("문자열을 실수로 변환한 값 :" + parsedDouble);
		
		Boolean isJavaFun = true;
		
		if(isJavaFun) {
			System.out.println("자바는 재밌습니다.");
			else {
				System.out.println("자바는 재미없습니다.");
			}
			
			String boolStr = "true"	;
			Boolean parseBool = Boolean.parseBoolean((boolStr);
			System.out.println();
				
		}
	}

}
