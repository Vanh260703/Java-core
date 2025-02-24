package lab4_5;

import java.util.ArrayList;
import java.util.Scanner;

public class lab7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> arr = new ArrayList<Integer>();

		System.out.println("Nhập vào số lượng phần tử: ");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			arr.add(scanner.nextInt());
		}

		arr.sort(null);

		System.out.println(arr);
		System.out.println(arr.get(n - 2));
	}
}
