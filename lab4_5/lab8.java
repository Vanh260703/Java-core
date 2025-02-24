package lab4_5;

import java.util.Scanner;

public class lab8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("a: ");
		int a = scanner.nextInt();

		System.out.println("b: ");
		int b = scanner.nextInt();

		int maxA = 0, maxB = 0;
		int minA = 0, minB = 0;
		int LCM = 1;
		int maxGCD;

//		System.out.println(a);
//		System.out.println(b);
		for (int i = 1; i < a; i++) {
			if (a % i == 0 && i > maxA && b % i == 0) {
				maxA = i;
			}
		}
		for (int i = 1; i < b; i++) {
			if (b % i == 0 && i > maxB && a % i == 0) {
				maxB = i;
			}
		}

		maxGCD = maxA = maxB;

		System.out.println(maxGCD);

		for (int i = 1; i < 10; i++) {
			LCM = a * i;
			if (LCM % b == 0) {
				minA = LCM;
				break;
			}
		}
		System.out.println(minA);

//		System.out.println(minA);
	}

}
