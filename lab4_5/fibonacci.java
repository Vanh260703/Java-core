package lab4_5;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập:");
		int n = scanner.nextInt();

		double sqrt5 = Math.sqrt(5);
		double a = (1 + sqrt5) / 2;
		double b = (1 - sqrt5) / 2;
		int F;

		F = (int) ((1 / sqrt5) * ((Math.pow(a, n)) - Math.pow(b, n)));

		System.out.println(F);

	}
}
