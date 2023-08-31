package com.kh.whilesample;

public class While03 {

	public static void main(String[] args) {
		// 반복적으로 출력 
		int i =1;
		while(i <=10) { // 숫자가 5가 될때 출력을 멈추고 싶어 , I가 5보다 같거나 작을때 출력.
			System.out.println(i); //위 부등호가 참일 경우 출력
			i= ++ i ; // -> 무한 루프 끝내게 만들기.
		}
		
		/*
		 * i ++ 일때 i가 1인 값을 먼저 대입했기 때문에
		 * ++가 작동하지 않음
		 * 무할루프 발생
		 * ++i 일때 i에 +1을 먼저 대입 1~10까지 출력 가능
		 * 무한루프가 발생하지않음.
		 * 
		 * */
		
	}

}
