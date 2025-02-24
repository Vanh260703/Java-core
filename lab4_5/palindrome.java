package lab4_5;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào chuỗi: ");
		String str = scanner.nextLine();

		String newStr = "";

		for (int i = 0; i < str.length(); i++) {
			newStr = str.charAt(i) + newStr;
		}

		System.out.println(newStr);

		if (str.equals(newStr)) {
			System.out.println("Chuỗi là Palindrome.");
		} else {
			System.out.println("Chuỗi không là Palindrome.");
		}
	}
}
