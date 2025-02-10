package vietanh;

import java.util.Arrays;

public class array {
	public static void main(String[] args) {
		int[] clubs = { 5, 4, 3, 2, 1 };

//		Arrays.sort(clubs);
//
//		System.out.println(Arrays.toString(clubs));

		for (int i = 0; i < clubs.length - 1; i++) { // chỉ cần lấy 4 giá trị của mảng để so sánh
			for (int j = i + 1; j < clubs.length; j++) { // j phải bằng giá trị tiếp theo của i
				if (clubs[i] > clubs[j]) {
					int temp = clubs[i]; // khởi tạo một biến tạm thời
					clubs[i] = clubs[j]; // swap giá trị cho nhau
					clubs[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(clubs));
	}
//	}
}
