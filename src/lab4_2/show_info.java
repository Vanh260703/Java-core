package lab4_2;

import java.util.Scanner;

public class show_info {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập tên:");
		String name = scanner.nextLine();

		System.out.println("Nhập tuổi: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Nhập địa chỉ: ");
		String address = scanner.nextLine();

		System.out.println("Nhập mã sinh viên:");
		String studentID = scanner.nextLine();

		System.out.println("Nhập điểm trung bình: ");
		double gpa = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Nhập ngành học: ");
		String major = scanner.nextLine();

		Student student = new Student(name, age, address, studentID, gpa, major);
		System.out.println("-- Thông tin sinh viên -- ");
		student.displayInfo();

		scanner.close();
	}
}
