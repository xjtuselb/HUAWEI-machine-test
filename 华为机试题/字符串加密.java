package 华为机试题;

import java.util.Scanner;

public class 字符串加密 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String k = sc.nextLine();
			String d = sc.nextLine();
			System.out.println(encryption(k, d));
		}
		sc.close();
	}

	// 字符串去重
	public static String removeDuplication(String s) {
		String x = "";
		for (int i = 0; i < s.length(); i++) {
			boolean f = !x.contains(s.charAt(i) + "");
			if (f)
				x += s.charAt(i);
		}
		return x;
	}

	// 构造新的字母表
	public static String newAlphabet(String string) {
		String zimubiao = "";
		String s_single = removeDuplication(string);
		String s = s_single.toLowerCase();
		zimubiao += s;
		String x = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < 26; i++) {
			if (!s.contains(x.charAt(i) + "")) {
				zimubiao += x.charAt(i);
			}
		}
		return zimubiao.substring(0, 26);
	}

	public static String encryption(String k, String d) {
		String s = "";
		String newAlphabet = newAlphabet(k);
		for (int i = 0; i < d.length(); i++) {
			// 数据是小写字母
			if (d.charAt(i) >= 'a' && d.charAt(i) <= 'z') {
				s += newAlphabet.charAt((int) d.charAt(i) - 97);
			}
			// 数据是大写字母
			if (d.charAt(i) >= 'A' && d.charAt(i) <= 'Z') {
				s += (char) ((int) newAlphabet.charAt((int) d.charAt(i) - 65) + 32);
			}
		}
		return s;
	}

}
