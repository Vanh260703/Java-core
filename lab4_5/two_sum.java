package lab4_5;

import java.util.ArrayList;

public class two_sum {
	public static void main(String[] args) {
		int[] nums = { 2, 5, 7, 11, 19 };
		int target = 18;

		ArrayList<Integer> newArr = new ArrayList<Integer>();

		for (int i = 0; i < nums.length - 1; i++) {
//			System.out.println(i);
//			System.out.println(nums[i]);

			for (int j = 0; j < i; j++) {
				if (nums[i] + nums[j] == target) {
					newArr.add(j);
					newArr.add(i);
				}
			}
//		}
//
		}
		System.out.println(newArr);
	}
}
