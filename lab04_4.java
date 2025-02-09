package vietanh;

import java.util.Scanner;

public class lab04_4 {
	public static void ptrbac1() {
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
		scanner.close();
	}

	public static void ptrbac2() {
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

	public static void tinhTienDien() {
		System.out.println("Nhập vào số điện: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int price;
		if (a <= 100) {
			price = a * 1000;
			System.out.println("Số tiền điện phải trả: " + price);
		} else {
			price = 100 * 1000 + (a - 100) * 1500;
			System.out.println("Số tiền điện phải trả: " + price);
		}
		scanner.close();
	}

	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");
		Scanner scanner = new Scanner(System.in);
		int select = scanner.nextInt();
		switch (select) {
		case 1:
			ptrbac1();
			break;
		case 2:
			ptrbac2();
			break;
		case 3:
			tinhTienDien();
			break;
		case 4:
			System.out.println("Kết thúc");
			System.exit(0);
			break;
		default:
			System.out.println("Lựa chọn của bạn không hợp lệ. Vui lòng chọn lại(1-5");
		}
	}
}
