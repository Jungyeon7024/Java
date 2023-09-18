package com.kh.randomMain;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 Random : 난수를 생성하기 위해 사용하는 클래스
 난수 	: 무작위로 만들어진 수
 */
public class RandomMain {

	public static

}
		public void Lotto() {
		Random rd = new Random();
		//1 - 45 난수 생성
		List <Integer> lottoNum =new ArrayList<>();
		int six =6;
		while(lottoNum.size() <six {
			
			int ranNumber = rd.nextInt(45);
		}
		
		System.out.println("당첨 번호");
	}
		public void RanomExam() {
		
		// 로또 번호 생성기
		Random rd =  new Random(); // 랜덤 객체 생성
		
		//1. 정수 범위 내에서 랜덤인 나수를 만들어야 한다.
		int ranInt = rd.nextInt(100); // 0-99 사이에서 한개  
		System.out.println(ranInt);
		
		//2. 실수 범위 내에서 랜덤 인 숫자 나누기
		double ranD = rd.nextDouble();//
		
		//3. 불리 한 랜덤 생성
		boolean ranB = rd.nextBoolean();
		System.out.println(ranD);
		
	}

		}

