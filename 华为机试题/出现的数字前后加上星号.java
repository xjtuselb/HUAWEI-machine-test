package 华为机试题;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 出现的数字前后加上星号 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			System.out.println(f(s));
		}
		sc.close();

	}

	public static String f(String s) {
		// 找数字
		ArrayList<String> al = new ArrayList<String>();
		Matcher m = Pattern.compile("[0-9]+").matcher(s);
		while (m.find()) {
			al.add(m.group());
		}
		String[] a = al.toArray(new String[al.size()]);
		for (int i = 0; i < a.length; i++) {
			a[i] = "*" + a[i] + "*";
		}

		// 找非数字
		ArrayList<String> al1 = new ArrayList<String>();
		Matcher m1 = Pattern.compile("[^0-9]+").matcher(s);
		while (m1.find()) {
			al1.add(m1.group());
		}
		String[] b = al1.toArray(new String[al1.size()]);

		// 连接
		String s1 = "";
		if (a.length < b.length) {
			for (int i = 0; i < a.length; i++) {
				s1 += b[i] + a[i];
			}
			s1 += b[b.length - 1];
		}

		if (a.length > b.length) {
			for (int i = 0; i < b.length; i++) {
				s1 += a[i] + b[i];
			}
			s1 += a[a.length - 1];
		}

		if (a.length == b.length && s.charAt(0) >= '0' && s.charAt(0) <= '9') {
			for (int i = 0; i < b.length; i++) {
				s1 += a[i] + b[i];
			}
		}

		if (a.length == b.length && (s.charAt(0) <= '0' || s.charAt(0) >= '9')) {
			for (int i = 0; i < a.length; i++) {
				s1 += b[i] + a[i];
			}
		}

		return s1;
	}

}
