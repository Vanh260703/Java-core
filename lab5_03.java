package vietanh;

import java.util.Arrays;
import java.util.Scanner;

public class lab5_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào độ dài trong mảng: ");
		int myArray = scanner.nextInt();
		int[] a = new int[myArray];
		System.out.println("Nhập vào số của mảng: ");
		for (int i = 0; i < myArray; i++) {
			a[i] = scanner.nextInt();
		} // Nhập vào độ dài trong mảng

		Arrays.sort(a);
		System.out.println(Arrays.toString(a)); // Sắp xếp mảng

		System.out.println("Phần từ lớn nhất nhất trong mảng:" + a[a.length - 1]);
		System.out.println("Phần từ nhỏ nhất trong mảng:" + a[0]);
		scanner.close();
	}
}
