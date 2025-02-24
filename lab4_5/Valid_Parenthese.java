package lab4_5;

import java.util.Scanner;

public class Valid_Parenthese {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào số đầu: ");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Nhập vào số thứ 2: ");
		int b = scanner.nextInt();
		int area = a * b;

		if (a < 0 && b < 0 || area < 0) {
			System.out.println("Chiều dài và rộng phải dương!");
		} else {

			System.out.println("Diện tích: " + area);
		}

		scanner.close();
	}
}
