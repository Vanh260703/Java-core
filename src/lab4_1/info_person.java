package lab4_1;

import java.util.Scanner;

public class info_person {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập tên: ");
		String name = scanner.nextLine();

		System.out.println("Nhập tuổi: ");
		int age = scanner.nextInt();
		scanner.nextLine(); // đọc ký tự xuống dòng
		System.out.println("Nhập địa chỉ: ");
		String address = scanner.nextLine();
		System.out.println("Nhập mã nhân viên: ");
		String employeeID = scanner.nextLine();

		System.out.println("Nhập lương: ");
		double salary = scanner.nextDouble();
		scanner.nextLine(); // đọc ký tự xuống dòng
		System.out.println("Nhập chức vụ: ");
		String position = scanner.nextLine();

		// Tạo đối tượng Employee
		Employee employee = new Employee(name, age, address, employeeID, salary, position);
		System.out.println("--Thông tin nhân viên--");
		employee.displayInfo();

		scanner.close();
	}
}
