package chapter10;

public class SinhVien {

	private int mssv;
	private String name;
	private double score;
	private int age;

	public SinhVien(int mssv, String name, double score, int age) {
		this.mssv = mssv;
		this.name = name;
		this.score = score;
		this.age = age;
	}

	public int getMssv() {
		return mssv;
	}

	@Override
	public String toString() {
		return "SinhVien [mssv=" + mssv + ", name=" + name + ", score=" + score + ", age=" + age + "]";
	}

	public void setMssv(int mssv) {
		this.mssv = mssv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
