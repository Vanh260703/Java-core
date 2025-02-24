package chapter7;

public class SinhVienIT extends Sinhvien {
	private String language; // ngôn ngữ lập trình

	public SinhVienIT(int id, String name, double price, double tax) {
		super(id, name, price, tax);
		this.language = language;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("Ngôn ngữ lập trình: " + language);
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	void tinhDiem() {
		// TODO Auto-generated method stub

	}
}
