package chapter6;

import java.util.ArrayList;

public class lab6_2 {
	public static void main(String[] args) {
		Student st1 = new Student("Nguyễn Hương Giang", 1);
		Student st2 = new Student("Nguyễn Anh Việt", 2);
		Student st3 = new Student("Kim Phượng", 3);
		Student st4 = new Student("Phương Anh", 4);
		Student st5 = new Student("Việt Anh", 5);

		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(st1);
		arr.add(st2);
		arr.add(st3);
		arr.add(st4);
		arr.add(st5);

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().startsWith("Nguyễn")) {
				System.out.println("Start with Nguyễn: " + arr.get(i));
			}
		}

		System.out.println(arr.toString());
	}
}
