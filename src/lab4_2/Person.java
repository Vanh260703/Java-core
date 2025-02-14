package lab4_2;

public class Person {
	protected String name;
	protected int age;
	protected String address;

	public Person() {

	}

	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void displayInfo() {
		System.out.println("Tên: " + name);
		System.out.println("Tuổi: " + age);
		System.out.println("Dịa chỉ: " + address);
	}
}
