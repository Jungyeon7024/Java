package com.kh.pracitce3.UserScanner;
import java.util. Scanner;
public class UserScannerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수 입력받는 스캐너 만들기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5개의 정수를 입력하세요");
		
		//	배열에다가 5개의 정수 입력하는 포문
		int[] numbers = new int[5];
		
									
		for(int i =0; i <5; i++);{
			 System.out.println("정수 : "+  (i) +  " : ");
			 numbers[i] = sc.nextInt();
			
			//ArrayList 경우 colors.get(0);
			//배열은 [] 안에 넣음
			//근데 배열의 자리가 없네? 배열의 자리먼저 만들기
			//바깥에다가 int numbers 배열 만들기
		
		}
		
		
	}

}
