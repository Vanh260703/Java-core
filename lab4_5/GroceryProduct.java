package lab4_5;

public class GroceryProduct extends Product {

	private String expirationDate;

	public GroceryProduct(String productID, String name, double price, int quantity) {
		super(productID, name, price, quantity);
		this.expirationDate = expirationDate;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println("Ngày hết hạn: " + expirationDate);
	}

}
