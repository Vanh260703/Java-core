package vietanh;

import java.util.Scanner;

public class lab04_2 {
	public static void main(String[] args) {
		/*
		 * Cho phương trình ax^2 + bx + c = 0 tìm nghiệm
		 */
		System.out.println("Cho phương trình bậc 2: ax^2 + bx + c = 0");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào a: ");
		int a = scanner.nextInt();

		System.out.println("Nhập vào b: ");
		int b = scanner.nextInt();

		System.out.println("Nhập vào c:");
		int c = scanner.nextInt();
		double x;
		if (a == 0) {
			if (b == 0 && c == 0) {
				System.out.println("Phương trình vô số nghiệm");
			} else if (b == 0 && c != 0) {
				System.out.println("Phương trình vô nghiệm");
			} else {
				x = (double) -c / b;
				System.out.println("Phương trình có một nghiệm: " + x);
			}
		} else {
			double delta = (double) Math.pow(b, 2) - (4 * a * c);
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				x = (double) -b / (2 * a);
				System.out.println("Nghiệm kép: " + x);
			} else {
				double x1, x2;
				x1 = (double) (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (double) (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("Phương trình có 2 nghiệm, x1 = %.3f , x2 = %.3f ", x1, x2);
			}
		}
		scanner.close();
	}
}
