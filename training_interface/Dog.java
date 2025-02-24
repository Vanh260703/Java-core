package training_interface;

public class Dog implements Animal {

	@Override
	public String toString() {
		return "Dog [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("gâu gâu");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("ăn xương");
	}

}
