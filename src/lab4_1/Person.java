package lab4_1;

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

//	public static String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}

	public void displayInfo() {
		System.out.println("name: " + name);
		System.out.println("age:" + age);
		System.out.println("address: " + address);
	}

}
