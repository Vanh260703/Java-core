package lab4_5;

public class ElectronicProduct extends Product{

	private int warrantPeriod; // Thời gian bảo hành - tháng	
	
	public ElectronicProduct(String productID, String name, double price, int quantity) {
		super(productID, name, price, quantity);
		this.warrantPeriod = warrantPeriod;
	}
	
	public void displayInfo() { // Thông tin bảo hành
		super.displayInfo();
		System.out.println("Thời gian bảo hành: " + warrantPeriod);
	}

}
