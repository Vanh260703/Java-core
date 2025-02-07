package vietanh;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("First number: ");
		int a = scanner.nextInt();
		System.out.println("Second number: ");
		int b = scanner.nextInt();
		int c = Math.min(a, b);
		System.out.println("Max number: " + c);
		scanner.close();
	}
}
