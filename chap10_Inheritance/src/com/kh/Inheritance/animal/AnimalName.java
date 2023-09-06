package com.kh.Inheritance.animal;

public class AnimalName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog("댕댕이");
		myDog.info();
		myDog.speak();
		
		Cat myCat = new Cat("고야미");
		myCat.run();
		myCat.eat();
		
		Monkey myMonkey = new Monkey("원숭이");
		
		Lion myLion = new Lion("사자");
		myMonkey.eat();
		myLion.eat();
		
		
	}

}
