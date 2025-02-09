package vietanh;

import java.util.Scanner;

public class lab04 {
	public static void main(String[] args) {
		// Bai 1: cho phuong trinh ax + b = 0
		// => tim nghiem cua phuong trinh
		System.out.println("Cho phương trình: ax + b = 0");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào a:");
		int a = scanner.nextInt();

		System.out.println("Nhập vào b:");
		int b = scanner.nextInt();
		double x;
		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			x = (double) (-b) / a;
			System.out.println("Ngiệm của phương trình: " + x);
		}

	}
}
