package chapter8;

public class SinhVienIT extends SinhVien {

	private double scoreJava;
	private double scoreHTML;

	public SinhVienIT(double scoreJava, double scoreHTML) {
		super();
		this.scoreHTML = scoreHTML;
		this.scoreJava = scoreJava;
	}

	public double getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(double scoreJava) {
		this.scoreJava = scoreJava;
	}

	public double getScoreHTML() {
		return scoreHTML;
	}

	public void setScoreHTML(double scoreHTML) {
		this.scoreHTML = scoreHTML;
	}

	@Override
	double getDiem() {
		return (this.scoreJava * 2 + this.scoreHTML) / 3;

	}

}
