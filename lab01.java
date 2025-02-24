package vietanh;

import java.util.Scanner;

public class lab01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào tên sinh viên: ");
		String name = scanner.nextLine();
		System.out.println("Điểm = ");
		int score = scanner.nextInt();
		System.out.println(name + " có điểm = " + score);

		scanner.close();
	}
}
