package lab4_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<String> arr = new ArrayList<String>();

		System.out.println("Nhập vào chuỗi 1:");

		String str1 = scanner.nextLine();

		System.out.println("Nhập vào chuỗi 2:");

		String str2 = scanner.nextLine();

		char charStr1[] = {};

		char charStr2[] = {};

		charStr1 = str1.toCharArray();

		charStr2 = str2.toCharArray();

//		System.out.println(charStr1[0]);

		Arrays.sort(charStr1); // Sắp xếp lại mảng
		Arrays.sort(charStr2);

		if (Arrays.equals(charStr1, charStr2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
