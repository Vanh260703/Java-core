package lab4_5;

import java.util.ArrayList;
import java.util.Scanner;

public class sortArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> arr = new ArrayList<Integer>();

		System.out.println("Nhập vào số phần tử: ");
		int n = scanner.nextInt();
		scanner.nextLine(); // enter

		System.out.println("Nhập vào số: ");
		for (int i = 0; i < n; i++) {
			arr.add(scanner.nextInt());
		}

		arr.sort(null);

		System.out.println(arr);

	}
}
