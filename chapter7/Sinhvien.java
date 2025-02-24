package chapter7;

public abstract class Sinhvien {
	protected int id; // MSSV
	protected String name; // Tên
	protected double price; // Học phí
	protected double tax; // tỉ lệ thuế

	abstract void tinhDiem();

	public Sinhvien(int id, String name, double price, double tax) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public double getPriceTax() {
		return price * tax;
	}

	public void showInfo() {
		System.out.println("Mã sinh viên:" + id);
		System.out.println("Tên: " + name);
		System.out.println("Học phí" + price);
		System.out.println("Thuế: " + tax);
	}
}
