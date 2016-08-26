package 华为机试题;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 统计大写字母的个数 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			System.out.println(f(s));
		}
		sc.close();
	}

	public static int f(String s) {

		String s1 = "";
		Matcher m = Pattern.compile("[A-Z]+").matcher(s);
		while (m.find()) {
			s1 += m.group();
		}
		return s1.length();
	}

}
