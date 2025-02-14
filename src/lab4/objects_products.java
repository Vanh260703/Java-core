package lab4;

public class objects_products {
	public static void main(String[] args) {
		product test = new product(); // khởi tạo một hàm mới để hứng giá trị

		product pr1 = test.nhapThongTin("keyboard", 200, 0.1);
		test.xuatThongTin(pr1); // in ra thông tin
		System.out.println("Tax = " + test.getTaxPrice(pr1.getPrice(), pr1.getTax()));
	}
}
