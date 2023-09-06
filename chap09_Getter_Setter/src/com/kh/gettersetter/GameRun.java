package com.kh.gettersetter;

import com.kh.gettersetter.goodExam.GoodPlayer;

public class GameRun {

	public static void main(String[] args) {
		// 플레이 생성자 만들기
		GoodPlayer player1 = new GoodPlayer();
	
		player1.setName("공격하는 자");
		player1.ValidName();
		player1.setHealth(-10);
		player1.ValidHealth(-10);
		player1.setAttackPower(20);
		player1.ValidAttackPower();
		
		player1.displayInfo();
		
		Goodplayer player2 = new GoodPlayer();	
		player2.setName("공격받는 자");
		player2.setHealth(80);
		player2.setAttackPower(10);
		
		player2.displayInfo();
		
		System.out.println("attack!! 후");
		
		
		
		player1.attack(player2);
		
	
	}
	
}
