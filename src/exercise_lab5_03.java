package vietanh;

import java.util.Arrays;
import java.util.Scanner;

public class exercise_lab5_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào độ dài mảng:");
		int size = scanner.nextInt();
		int[] a = new int[size];
		System.out.println("Độ dài mảng: " + size);
		System.out.println("Nhập vào phần tử của mảng: ");
		for (int i = 0; i < size; i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println("Tập hợp các số chẵn:" + a[i]);
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println("Tập hợp các số lẻ:" + a[i]);
			}
		}
	}
}
