package chapter7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class video42 {
	public static void main(String[] args) {
		System.out.println("run video 42");

		Pattern patteren = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
		Matcher matcher = patteren.matcher("1@d");
		System.out.println(matcher.matches());
	}
}
