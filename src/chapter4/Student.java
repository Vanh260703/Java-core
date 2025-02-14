package chapter4;

public class Student {

	private String name;
	private int age;
	private String address;

	public Student() {

	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	public String getName() {
//		return this.name;
//	}
//
//	public int getAge() {
//		return this.age;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}

	// class attribute

	public String getName() { // getter
		return name;
	}

	public void setName(String name) { // setter
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// class method
	public void learnJava() {
		System.out.println("Learn Java with Youtube");

	}
}
