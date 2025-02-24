package vietanh;

import java.util.Arrays;
import java.util.Scanner;

public class exercise_lab5_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào độ dài mảng: ");
		int myArray = scanner.nextInt();
		int[] a = new int[myArray];
		System.out.println("Nhập vào số của màng: ");
		for (int i = 0; i < myArray; i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("Tổng các phần tử trong mảng:" + sum);
		scanner.close();
	}
}
