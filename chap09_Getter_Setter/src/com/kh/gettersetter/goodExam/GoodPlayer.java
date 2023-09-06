package com.kh.gettersetter.goodExam;



public class GoodPlayer {
	private String name; //캐릭터이름
	
	
	private int health; //체력
	private int attackPower;// 공격파워
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void ValidName() {
		if(this.name=="") {
			this.name="No name"	;
			//GoodPlayer..out.println("이름을 넣지 않았습니다.");
		}
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void ValidHealth() {
		if(this.health<=0) {
			System.out.println("체력이 0입니다");
		}
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
	public void ValidAttackPower() {
		if(this.attackPower<=0) {
			System.out.println("공격력이 0입니다");
		}
	}
	
	
	public int getAttackPower() {
		return attackPower;
	}
		public void displayinfo() {
			System.out.println("캐릭터 정보 : " + this.name);
			System.out.println("체력 정보 : " + this.health);
			System.out.println("공격 파워 : " + this.attackPower);
		
		
	}

	
			
			
}