package chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class lab05 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<Double> list = new ArrayList<Double>();
		while (true) {
			System.out.print("Nhập vào 1 số thực bất kỳ: ");
			double x = scanner.nextDouble();
			list.add(x);
			scanner.nextLine(); // enter
			System.out.print("Nhập thêm(Y/N)");
			String option = scanner.nextLine();
			if (option.equals("N") || option.equals("n")) {
				break;
			}
		}
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println("sum:" + sum);
		scanner.close();

	}
}
