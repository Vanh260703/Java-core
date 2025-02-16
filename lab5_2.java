package chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class lab5_2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> intArr = new ArrayList<Integer>();

		System.out.println("Nhập số lượng phần tử: ");
		int n = scanner.nextInt();

		System.out.println("Nhập các số nguyên: ");
		for (int i = 0; i < n; i++) {
			intArr.add(scanner.nextInt()); // Nhập các phần tử
		}

		scanner.nextLine(); // enter

		System.out.println("Danh sách số nguyên ban đầu: " + intArr);

		while (true) {
			System.out.println("Bạn có muốn thêm, sửa, xoá phần tử trong mảng(Y/N)?");
			String option = scanner.nextLine();

			if (option.equalsIgnoreCase("N")) {
				break;
			} else if (option.equalsIgnoreCase("Y")) {
				System.out.println("Bạn muốn thêm(1) hay xoá số(2) ?");
				int select = scanner.nextInt();
				scanner.nextLine(); // enter
				switch (select) {
				case 1:
					System.out.println("Số mà bạn muốn thêm: ");
					intArr.add(scanner.nextInt());
					scanner.nextLine(); // enter
					break;
				case 2:
					System.out.println("Số mà bạn muốn xoá: ");
					intArr.remove(scanner.nextInt());
					scanner.nextLine(); // enter
					break;
				default:
					System.out.println("Lựa chọn của bạn không hợp lệ. Vui lòng chọn lại");
				}
			} else {
				System.out.println("Lựa chọn của bạn không hợp lệ. Vui lòng chọn lại");
			}
		}

		System.out.println("Danh sách sau khi thay đổi: " + intArr);
		scanner.close();

	}
}
