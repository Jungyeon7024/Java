package com.kh.practice;

import java.util.ArrayList;
import java.util.List;




public class UserMain {

	public static void main(String[] args) {
	
			List<User> user = new ArrayList<>();
			user.add(new User("ㅇㅁㅇ",20));
			user.add(new User("ㅇㅅㅇ",21));
			user.add(new User("ㅇㅈㅇ",22));
			
			//나이를 기준으로 정렬
			//Collections.short(user);
			
			for(User users : user) {
				System.out.println(user);
			}

	}

}
