package lab4_5;

public class lab9 {
	public static void main(String[] args) {
		int[] arr = { 33, 1, 13, 4, 28, 25, 27, 21, 10, 3, 28, -2, 21, 24, 121 };

		int sum = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			double sqrt = Math.sqrt(arr[i]);

//			System.out.println(sqrt);

			if (arr[i] % sqrt == 0) {
				sum += arr[i];
				count++;
			}
		}

		System.out.println(sum / count);

	}
}
