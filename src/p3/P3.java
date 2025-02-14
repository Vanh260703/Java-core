package p3;

import p1.P;

public class P3 extends P { // dùng extends để kế thừa
	private void test() {
		P firstObj = new P();
		firstObj.a = 10;
		firstObj.b = 10;
		super.c = 10; // protected (kế thừa)
		firstObj.d = 5;
	}

	public static void main(String[] args) {

	}
}
