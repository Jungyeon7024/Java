package com.kh.Inheritance.animal;

public class Monkey extends Animal {
		public Monkey(String name) {
			super (name);
		}
		
		//animal에 적혀있는 eat을 고양이안에서만 다시 저으이를 내린다.
		public void eat() {
		System.out.println(getName()+ " 밥줘");
		}

}
