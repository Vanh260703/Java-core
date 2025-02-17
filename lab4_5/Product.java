package lab4_5;

public class Product {
	protected String productID; // Mã sản phẩm
	protected String name; // Tên sản phẩm
	protected double price; // Giá
	protected int quantity; // Số lượng

	public Product(String productID, String name, double price, int quantity) {
		this.productID = productID;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public void displayInfo() { // Hiển thị thông tin sản phẩm
		System.out.println("Nhập mã sản phẩm: " + productID);
		System.out.println("Nhập tên sản phẩm: " + name);
		System.out.println("Nhập giá: " + price);
		System.out.println("Nhập số lượng trong kho: " + quantity);
	}

	public void updateQuantity(int amount) { // Cập nhật sản phẩm
		System.out.println("Nhập số lượng sản phẩm muốn cập nhật: " + amount);
		quantity += amount;
		System.out.println("Số lượng sản phẩm sau khi cập nhật:" + quantity);
	}
}
