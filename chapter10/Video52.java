package chapter10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Video52 {

	public static int checkMssv() {
		int mssv;
		while (true) {
			Scanner scanner = new Scanner(System.in);
			try {
				mssv = scanner.nextInt();
				break;
			} catch (Exception e) {
				scanner.nextLine();
				System.out.println("MSSV không hợp lệ. Vui lòng nhập lại(số nguyên)!");
				// TODO: handle exception
			}
		}
		return mssv;
	}

	public static String name() {
		String name = null;
		Scanner scanner = new Scanner(System.in);

		boolean result = false;
		Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
		Matcher matcher = pattern.matcher("fgdfgfGHGHKJ68"); // Your String should come here
		if (matcher.find())
			result = true;// There is only Alphabets in your input string
		else {
			result = false;// your string Contains some number/special char etc..
		}

		while (true) {
			try {
				if (!matcher.find()) { // If string contains any number/symbols etc...
					throw new Exception("Not a perfect String");
				}
				// This will not be executed if exception occurs
				name = scanner.nextLine();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào mã sinh viên:");
		int mssv = checkMssv();

		System.out.println("Nhập vào tên: ");
		String name = scanner.nextLine();

		SinhVien sv1 = new SinhVien(mssv, name, 18, 9);
		System.out.println(sv1);
	}
}
