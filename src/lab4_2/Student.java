package lab4_2;

public class Student extends Person {
	private String studentID; // Mã sinh viên
	private double gpa; // Điểm trung bình
	private String major; // Ngành học

	public Student(String name, int age, String address, String studentID, double gpa, String major) {
		super(name, age, address);
		this.studentID = studentID;
		this.gpa = gpa;
		this.major = major;
	}

	public void displayInfo() {
		super.displayInfo(); // ghi đè thông tin
		System.out.println("Mã sinh viên: " + studentID);
		System.out.println("Điểm trung bình: " + gpa);
		System.out.println("Ngành học: " + major);
	}
}
