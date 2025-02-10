package vietanh;

import java.util.Arrays;
import java.util.Scanner;

public class exercise_lab5_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào độ dài mảng: ");
		int size = scanner.nextInt();
		int[] a = new int[size];
		System.out.println("Nhập vào số trong mảng:");
		for (int i = 0; i < size; i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Số lớn nhất trong mảng: " + max);
		System.out.println("Số nhỏ nhất trong mảng:" + a[0]);
	}
}
