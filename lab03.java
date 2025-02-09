package vietanh;

import java.util.Scanner;

public class lab03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào cạnh a của khối lập phương: ");
		int a = scanner.nextInt();

		System.out.println("Thể tích của khối lập phương = " + Math.pow(a, 3));

		scanner.close();

	}
}
