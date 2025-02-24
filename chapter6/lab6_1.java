package chapter6;

import java.util.Scanner;

public class lab6_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào username: ");
		String username = scanner.nextLine();

		System.out.println("Nhập vào password: ");
		String password = scanner.nextLine();

		if (password.length() < 6) {
			System.out.println("Mật khẩu không hợp lệ. Vui lòng nhập lại!");
		} else {
			System.out.println("Tên tài khoản: " + username);
			System.out.println("mật khẩu: " + password);
		}
		scanner.close();
	}
}
