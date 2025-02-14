package chapter4;

public class video26 {
	public static void main(String[] args) {
		System.out.println("run video 26:");
		Student st1 = new Student(); // constructor

		Student st2 = new Student("viet anh", 22);
		st2.setAge(23); // gán giá trị
		System.out.println(st2.getName() + " and age = " + st2.getAge());
	}
}
