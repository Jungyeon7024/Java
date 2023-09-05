package com.kh.gettersetter;

public class GameRun {

	public static void main(String[] args) {
		// 플레이 생성자 만들기
		PlayerCharacter player1 = new PlayerCharacter();
	
		player1.setName("내이름 공격자");
		player1.setHealth(0);
		player1.setAttackPower(20);
		player1.displayInfo();
		

	}

}
