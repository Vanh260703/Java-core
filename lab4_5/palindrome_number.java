package lab4_5;

public class palindrome_number {
	public static void main(String[] args) {
		int x = 132;
		char ch;

		String str = Integer.toString(x);

		String newStr = "";

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			newStr = ch + newStr;

		}
		System.out.println(newStr);

	}
}
