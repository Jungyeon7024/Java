package com.kh.scannersample;
import java.util.*;

public class Scannersample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해 주세요.");
		int age = sc.nextInt();//정수만 받는 next
		System.out.println("내 나이는 " + age + "입니다.");
		
		String name; 
		int phoneNumber; 
		System.out.print("당신의 이름을 입력하세요. : ");
		System.out.print("당신의 번호를 입력하세요. : ");
		
		name = sc.next();
		phoneNumber = sc.nextInt(); // - 넣지않기 
		System.out.print("당신의 이름은" + name + "입니다.");
		System.out.println("당신의 전화번호는" + phoneNumber + "입니다.");
		
		//내 취미와 내가 좋아하는 음식과 내 주소 출력하기.
		
		String hobby, food, address;
		
		System.out.print("취미 생활이 뭔가요? : ");
		System.out.print("좋아하는 음식이 뭔가요? : ");
		System.out.print("어디 사세요? : " );
		
		hobby = sc.next();
		food = sc.next();
		address = sc.next();
		System.out.print("저의 취미는" + hobby + "입니다. ");
		System.out.print("제가 좋아하는 음식은" + food + "입니다.");
		System.out.print("제가 사는 곳은" + address + "입니다. ");
		
		String name1,name2;
		name1 = sc.next(); // 공백을 받지않는다.
		
		
		
	}

}
//int라 0이 생략, String을 이용하면 0이 표시되는데 그 이유는 문자로 읽어내기 때문이다.