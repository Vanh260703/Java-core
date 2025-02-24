package chapter9;

public class Pig implements IAnimal {

	@Override
	public void animalSound() {
		System.out.println("The pig say: wee wee");

	}

	@Override
	public void sleep() {
		System.out.println("Zzz");
	}

}
