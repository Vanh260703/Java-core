package vietanh;

import java.util.Scanner;

public class lab02 {
	public static void main(String[] args) {
		System.out.println("Bai 02:");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào cạnh dài: ");
		int a = scanner.nextInt();

		System.out.println("Nhập vào cạnh ngắn: ");
		int b = scanner.nextInt();

		System.out.println("Chu vi của hình chữ nhật = " + (a + b) * 2);
		System.out.println("Diện tích của hình chữ nhật = " + (a * b));
		System.out.println("Cạnh nhỏ nhất của hình chữ nhật: " + Math.min(a, b));
	}
}
