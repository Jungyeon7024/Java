package com.kh.practice4.func;

import java.util.Scanner;

public class practice_0904 {

	public static void main(String[] args) {
		
		
		
		// 만약에, 입력한 수가 2보다 작은 경우 "잘못 입력하셨습니다."를 출력하세요
		
		
		//1. 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		Scanner sc = new Scanner(System.in); // 입력받기 위해 불러오는 메소드
		System.out.println("숫자를 입력해주세요"); // 출력 메소드
		int num = sc.nextInt();
		int count = sc.nextInt();
		//2. 단(=만약에), 입력한 수가 2보다 작은 경우 "잘못 입력하셨습니다."를 출력하세요.
		if(num<2) { // 만약에 입력한 수가 2보다 작을 경우
			System.out.println("잘못 입력하셨습니다.");
		} else { // 만약에 입력한 수가 2보다 클 경우
		/* 3.
		  	'소수'는 n을 1부터 n까지 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다
		 	ex) 2, 3, 5, 7, 11 _
		 	ex.
		 	숫자 : 5 숫자 9 숫자 : 0
		 	
		 */
		//4. 소수입니다. 소수가 아닙니다. 잘못 입력하셨습니다.
			//소수인지 아닌지 판별파는 boolean
			boolean checkNum = true; // 소수 여부를 판단하기 위한 boolean 변수를 checkNum 초기화 처음에는 소수 가정
			for(int i =2; i<=num; i++) { // 2부터 입력받은 숫자 num까지의 반복문 소수를 찾는 역할
				//for 문을 활용해서 나타낸 출력
				for(int a = 2 ; a*a<=1 ; a++  ) { // 입력받은 숫자가 아닌 현재 숫자 i가 소수인지 판단하기 위한 반복문
					/*
					 	i - 1을 해야할 경우 a * a를 대신 넣어라
					 	숫자 i가 소수인지 확인하려면 2부터 i -1까지 모든 숫자로 i를 나누는 방법
					 	a*a 사용하는 원리:
					  	만약에 어떤 숫자 a로 나누어 떨어진다면 i가 a의 배수라면 i/a 역시 i의 약수 중하나
					  	이때 i를 a보다 큰 숫자로 나눠 봤을 때는 이미 a로 떨어지지 않기 때문에 i/a와 i/a보다 큰 숫자로 나누어 떨어지지 않는다.
					  	a가 i의  약수라면 i/a 역시 i의 약수이고, a는 i/a 서로 다른 숫자가 됨
					  	i가 소수인지 판별하기 위해 2부터 i- 1  까지 모든 숫자 대신 2부터 i까지의 숫자로만 나눠봐도 소수 여부를 알수 있다.
					  	a*a를 사용하는 것은 소수 판별 알고리즘 최적화 하기 위해 사용되는 방법 
					  	sqrt(i) : i의 제곱근을 나타내는 함수
					  	sqrt(16) : 결과가 4 가 나타내는 함수
					  	소수판별 sqrt(i) 소수를 판별할 때 소수인지 확인하기 위해 2부터 sqrt(i)를 이용해 간단하게 할 수 있다. 
					
					 */
					if(i % a ==0){ // 2%2 = 0
						//만약에 소수가 아닐경우 
						checkNum =false;
						count++;
						break;
						
					}
					if(checkNum) {
						System.out.println(i); // 출력 메소드 작성
					}
					 checkNum =true;
				}
				System.out.println("소수의 총 갯수 : " + (num - count)); // 모든 숫자 검서가 끝난 후. 소수가 아닌 개수
			}
		}
		
		
		
	
		
		
		
		

	}

}
