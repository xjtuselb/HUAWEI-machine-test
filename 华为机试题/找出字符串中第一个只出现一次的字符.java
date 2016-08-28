package 华为机试题;

import java.util.Scanner;

public class 找出字符串中第一个只出现一次的字符 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			System.out.println(getTheFistCharacter(s));
		}
		sc.close();
	}

	public static char getTheFistCharacter(String s) {
		char c = '.';
		for (int i = 0; i < s.length(); i++) {
			boolean b1 = !s.substring(i + 1, s.length()).contains(s.charAt(i) + "");
			boolean b2 = !s.substring(0, i).contains(s.charAt(i) + "");
			if (b1 && b2) {
				c = s.charAt(i);
				break;
			}
		}
		return c;
	}

}
