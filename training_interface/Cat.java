package training_interface;

public class Cat implements Animal {

	@Override
	public String toString() {
		return "Cat [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("meo meo");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("ăn cá");
	}

}
