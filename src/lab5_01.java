package vietanh;

import java.util.Scanner;

public class lab5_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên: ");
		int a = scanner.nextInt();
		int count = 0;
		for (int i = 2; i <= a - 1; i++) {
			if (a % i == 0) {
				System.out.printf("\n Ước số của %d là: %d", a, i);
				count++;
			}
		}
		if (count == 0) {
			System.out.printf("\n %d là số nguyên tố", a);
		} else {
			System.out.printf("\n %d không phải là số nguyên tố", a);
		}
		scanner.close();
	}
}
