package training_interface;

public class Rectangle implements IDrawable, IShape {
	private int a;
	private int b;

	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		System.out.println("Tính diện tích hình chữ nhật:" + a * b);
		return a * b;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		System.out.println("Tính chu vi: " + (a + b) * 2);
		return (a + b) * 2;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("*");
	}

}
