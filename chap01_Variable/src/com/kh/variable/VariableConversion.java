package com.kh.variable;

public class VariableConversion {
	//1. 자동형변환(암시적형변환, 묵시적형변환)
	public static void main(String[] args) {
	int intNum = 100;
	System.out.println(intNum);//intNum 숫자 100을 의미한다.
	long longNum = intNum; //int를 long으로 자동형 변환
	System.out.println(longNum);
	
	float floatNum = 3.14f;
	double doubleNum = floatNum; //float을 double로 자동형변환
	
	// int => long 변경하는 형변한 2가지 만들기
	int intNum2 = 400;
	System.out.println(intNum2);
	long longNum2 = intNum2;
	System.out.println(longNum2);
	
	int intNum3 = -800;
	System.out.println(intNum3);
	long longNum3 = intNum3;
	System.out.println(longNum3);
 
	//short -> int 로 변경하는 형변환 1가지 만들고 출력하기
	short shortNum = 250;
	System.out.println(shortNum);
	int intNum4 = shortNum;
	System.out.println(intNum4);
	//float -> double 로 변경하는 형변환 1가지 만들고 출력하기
	float floatNum2 = 2.69f;
	System.out.println(floatNum2);
	double doubleNum2 = floatNum2;
	System.out.println(doubleNum2);
	
	//2. 명시적 형변환(강제 형변환)
	
	//long -> int
	long largeLong = 123456789012345L;
	System.out.print("largeLong : ");
	System.out.println(largeLong);
	int largeInt = (int) largeLong;
	System.out.print("largeInt : ");
	System.out.println(largeInt); // long을 강제로 int로 강제로 형변환 할 경우는 범위 안에 없으면 데이터 손실이 잃어나 제대로 된 값이 출력이 안된다.
	
	double largeDouble1 = 12345.6789;
	int intPart =(int) largeDouble1;
	System.out.println(intPart); // 실수를 int로 강제 형변환 할 때 (정수 부분만 유지된다) 
	
	//문자와 숫자간의 형변환 2개 출력
	// 문자는 char charBalue = 'Z'; -> int 로 변경
	char charBalue = 'Z';
	int intBalue = charBalue;
	System.out.println(intBalue);
	
	char charCalue = 'D';
	int intCalue = charCalue;
	System.out.println(intCalue);
	
	
	// double -> int로 형변환 출력 1개
	
	double largeDouble2 =5462;
	int intPart4 = (int) largeDouble2;
	System.out.println(intPart4);
	
	
	
	// int -> short 로 형변환 1개
	
	int intNum9 = 7024;
	short shortNum9 = (short) intNum9;
	System.out.println(shortNum9);
	
	
	
	
	
	

	
	
	
	
	
	
	}

}
