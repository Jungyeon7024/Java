package com.kh.arraysample;

public class Array02 {

	public static void main(String[] args) {
		// 1. 배열의 길이를 선언
		// 1~ 10 까지의 반복문을 이용해서
		//순서대로 배열 인덱스에 넣은 후 그 값을 출력
		
	/*
		int[]	num = new int[11]; // 길이가 3인 배열 선언
		
		
		for (int i = 10; i < num.length ; i--) {
			num[i]	= i - 1;
			
			 System.out.println(i);
			
		
		
			
		} */
		
		int[] num = new int[10];
		
		int value = 10;
		
		for( int i =0; i < num.length; i++ ) {
			
			num[i] = value--;
			System.out.println("num[" + i + " ]" + num[i]);
		}
		
		// 2. 길이가 5인 String 배열 선언
		// " 사과 " " 귤 " "복숭아" "참외" 로 초기화 한 후
		// 배열 인덱스를 활용해서 귤을 출력하기
		
		
		/*String[] stringArray = new String[5];
		
		String[] nameArray = {"사과","귤","포도","복숭아","참외"};
		
		stringArray[0] = "사과";
		System.out.println("stringArray: " + stringArray[0]);
		stringArray[1] = "귤";
		System.out.println("stringArray: " + stringArray[1]);
		stringArray[2] = "포도";
		System.out.println("stringArray: " + stringArray[2]);
		stringArray[3] = "복숭아";
		System.out.println("stringArray: " + stringArray[3]);
		stringArray[4] = "참외";
		System.out.println("stringArray: " + stringArray[4]);
												
		*/
		
		String[] fruit = {"사과",	"귤", "포도", "복숭아", "참외"}; 
		
		System.out.println(fruit[1]);	
		
	}

}
