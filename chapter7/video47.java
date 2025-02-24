package chapter7;

class Animal {
	void eat() {
		System.out.println("animal is eating");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("Dog is eating");
	}
}

class BabyDog1 extends Dog {

}

public class video47 {
	public static void main(String[] args) {
		Animal a = new BabyDog1();
		a.eat();
	}

}
