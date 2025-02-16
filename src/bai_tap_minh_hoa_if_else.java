package vietanh;

import java.util.Scanner;

public class bai_tap_minh_hoa_if_else {
	public static void main(String[] args) {
		/*
		 * - dưới 10M: Không đóng thuế - từ 10M đến 15M: đóng 10% thuế - từ 15M đến 30M:
		 * đóng 20% thuế - trên 30M: đóng 50% thuế
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số tiền thuế(triệu đồng): ");

		int a = scanner.nextInt();
		double tax;
		if (a < 10) {
			System.out.println("Không phải đóng thuế");
		} else if (a >= 10 && a < 15) {
			tax = a * 0.1;
			System.out.println("Số tiền thuế phải đóng là 10% = " + tax + " triệu đồng");
		} else if (a >= 15 && a <= 30) {
			tax = a * 0.2;
			System.out.println("Số tiền thuế phải đóng là 20% = " + tax + " triệu đồng");
		} else {
			tax = a * 0.5;
			System.out.println("Số tiền thuế phải đóng là 50% = " + tax + " triệu đồng");
		}
		scanner.close();
	}
}
