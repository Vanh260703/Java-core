package training_interface;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
//		Animal test = new Dog();
//
//		IVehicle car = new Car();
//
//		car.start();
//		car.stop();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập chiều dài: ");
		int a = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Nhập chiều rộng: ");
		int b = scanner.nextInt();

		Rectangle rectangle = new Rectangle(a, b);

		rectangle.area();
		rectangle.perimeter();
		rectangle.draw();
	}
}
