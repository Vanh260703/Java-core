package vietanh;

import java.util.Scanner;

public class lab04_3 {
	public static void main(String[] args) {
		// Tính số tiền điện
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
}
