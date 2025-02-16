package chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class lab5_01 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<String> fruitsArr = new ArrayList<String>();
		fruitsArr.add("Táo");
		fruitsArr.add("Cam");
		fruitsArr.add("Đào");
		fruitsArr.add("Ổi");

//		System.out.println(fruitsArr);

		while (true) {

			System.out.println("Bạn có muốn thêm trái cây vào danh sách(Y/N)?");
			String option = scanner.nextLine();

			if (option.equalsIgnoreCase("N")) {
				break;
			} else if (option.equalsIgnoreCase("Y")) {
				System.out.println("Trái cây mà bạn muốn thêm: ");
				String newFruit = scanner.nextLine();
				fruitsArr.add(newFruit);

				System.out.println("Bạn đã thêm " + newFruit + " vào danh sách");
			} else {
				System.out.println("Lựa chọn của bạn không hợp lệ. Vui lòng chọn lại");
			}

			System.out.println("Danh sách trái cây hiện tại: " + fruitsArr);

		}

		System.out.println("Danh sách trái cây sau khi thay đổi:" + fruitsArr);

		scanner.close();
	}
}
