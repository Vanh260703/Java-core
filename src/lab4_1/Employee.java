package lab4_1;

public class Employee extends Person {

	private String employeeID; // mã nhân viên
	private double salary; // Lương
	private String position; // Chức vụ

	public Employee(String name, int age, String address, String employeeID, double salary, String position) {
		super(name, age, address);
		// TODO Auto-generated constructor stub
		this.employeeID = employeeID;
		this.salary = salary;
		this.position = position;
	}

	public void displayInfo() {
		super.displayInfo(); // ghi đè thông tin
		System.out.println("Mã nhân viên: " + employeeID);
		System.out.println("Lương: " + salary);
		System.out.println("Chức vụ:" + position);
	}

}
