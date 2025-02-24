package lab4_5;

import java.util.Scanner;

public class lab10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("a:");
		int a = scanner.nextInt();
		scanner.nextLine();

		System.out.println("b:");
		int b = scanner.nextInt();
		scanner.nextLine();

		System.out.println("c:");
		int c = scanner.nextInt();
		scanner.nextLine();

		int min = 0;

		if (a < b) {
			min = a;
			if (min > c) {
				System.out.println(c);
			} else {
				System.out.println(min);
			}
		} else {
			min = b;
			if (min > c) {
				System.out.println(c);
			} else {
				System.out.println(min);
			}
		}

	}
}
