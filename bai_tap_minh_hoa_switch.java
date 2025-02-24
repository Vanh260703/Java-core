package vietanh;

import java.util.Scanner;

public class bai_tap_minh_hoa_switch {
	public static void main(String[] args) {
		/*
		 * Viết chương trình lựa chọn tính năng Nếu nhập vào 1 => in ra
		 * "Bạn lựa chọn phép cộng" Nếu nhập vào 2 => in ra "Bạn lựa chọn phép trừ" Nếu
		 * nhập vào 3 => in ra "Bạn lựa chọn phép nhân" Nếu nhập vào 4 => in ra
		 * "Bạn lựa chọn phép chia" Nếu nhập vào 5 => in ra "Bạn đã lựa chọn thoát khỏi
		 * chương trình
		 */
		System.out.println("Lựa chọn tính năng");
		System.out.println("1. Cộng");
		System.out.println("2. Trừ");
		System.out.println("3. Nhân");
		System.out.println("4. Chia");
		System.out.println("5. Thoát khỏi chương trình");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		switch (a) {
		case 1:
			System.out.println("Bạn đã lựa chọn phép cộng");
			break;
		case 2:
			System.out.println("Bạn đã lựa chọn phép trừ");
			break;
		case 3:
			System.out.println("Bạn đã lựa chọn phép nhân");
			break;
		case 4:
			System.out.println("Bạn đã lựa chọn phép chia");
			break;
		case 5:
			System.out.println("Bạn đã lựa chọn thoát khỏi chương trình");
			break;
		default:
			System.out.println("Lựa chọn không hợp lệ. Hãy lựa chọn lại(1-5)");
		}
		scanner.close();
	}
}
