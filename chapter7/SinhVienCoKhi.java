package chapter7;

public class SinhVienCoKhi extends Sinhvien {
	private String skill; // Kỹ năng

	public SinhVienCoKhi(int id, String name, double price, double tax) {
		super(id, name, price, tax);
		this.skill = skill;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("Kỹ năng: " + skill);
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	void tinhDiem() {
		// TODO Auto-generated method stub

	}
}
