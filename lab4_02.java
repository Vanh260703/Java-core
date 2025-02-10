package vietanh;

import java.util.Scanner;

public class lab4_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên bất kì: ");
		int a = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.printf("\n %d x %d = %d", a, i, a * i);
		}
	}
}
