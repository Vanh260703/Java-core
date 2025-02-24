package lab4_5;

import java.util.Scanner;

public class prime_number {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("x = ");

		int x = scanner.nextInt();
		int count = 0;
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println(x + " là số nguyên tố");
		} else {
			System.out.println(x + " không là số nguyên tố");
		}
	}
}
