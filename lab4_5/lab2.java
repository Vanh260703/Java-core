package lab4_5;

import java.util.Scanner;

public class lab2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		String str = Integer.toString(n);

		String newStr = "";

		for (int i = 0; i < str.length(); i++) {
			newStr = str.charAt(i) + newStr;
		}

		int a = Integer.parseInt(newStr);
		System.out.println(a);
	}
}
