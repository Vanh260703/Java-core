package lab4;

public class product {
	private String name; // tên sản phẩm
	private double price; // giá sản phẩm
	private double tax; // thuế sản phẩn

	public product() {

	}

	public product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public String getName() { // getter
		return name;
	}

	public void setName(String name) { // setter
		this.name = name;
	}

	public double getPrice() { // getter
		return price;
	}

	public void setPrice(double price) { // setter
		this.price = price;
	}

	public double getTax() { // getter
		return tax;
	}

	public void setTax(double tax) { // setter
		this.tax = tax;
	}

	public product nhapThongTin(String name, double price, double tax) {
		product pr = new product(name, price, tax);
		return pr;
	}

	public void xuatThongTin(product pr) {
		System.out.println("name = " + pr.getName() + " price = " + pr.getPrice() + " tax = " + pr.getTax());
	}

	public double getTaxPrice(double price, double tax) {
		return tax * price;
	}
}
