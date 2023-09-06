package com.kh.gettersetter;

public class PlayerCharacter {
	private String name; //캐릭터이름
	private int health; //체력
	private int attackPower;// 공격파워
	/*
	 getter
	  	데이터 복사본을 던져주기 때문에 원래 객체의 데이터는 손상시키지 않음
	  	원본 데이터는 안전함
	 setter
	  	외부에서 메소드를 통해 데이터에 접근을 하게 된다면
	  	메소드는 매개값(=매개변수)을 검증해서 유효한 값만 데이터로 저장할 수있음
	 * */
	
	
	
	
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getAttackPower() {
		return attackPower;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHealth(int health) {
		//만약에 체력이 0이라면 죽이고 체력이 1이상이면 살리자
		if(health>=1) {
			this.health = health;
		}else {
			System.out.println("체력이 없다.");
		}
		
	}
	//0미만의 값을 넣어도 0이하의 값이 출력되지 않음
	public void setAttackPower(int attackPower) {
		//만약에 파워가 0보다 클경우
		if(attackPower>=1) {
			this.attackPower = attackPower;
		} else {
			this.attackPower= 0;
			System.out.println("power가 부족합니다");
		}
		
	}
	
	
	public void displayInfo(){
		System.out.println("캐릭터 정보 : "+ name);
		System.out.println("체 력 정보 : "+ health);
		System.out.println("공격 파워	 : "+ attackPower);		
	}
	
	//캐릭터 공격하는 출력 메서드
	public void attack(PlayerCharacter target) {
		System.out.println(name+"가 공격했습니다" +target.getName()+"한테"+attackPower+"데미지를");
		System.out.println("공격했습니다" );

		
	}
	//다른 캐릭터로부터 공격 받았을 때 메서드
	public void takeDamage(int damage) {
		System.out.println("공격 받았습니다");
	}
	
}
