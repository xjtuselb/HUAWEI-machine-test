package 华为机试题;

import java.util.Scanner;

public class 提取不重复的整数 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			System.out.println(fun(sc.nextInt()));
		}
		sc.close();
	}

	public static int fun(int x) {
		String s = Integer.toString(x);
		String t = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			if (t.contains(s.charAt(i) + ""))
				continue;
			else
				t += s.charAt(i);
		}
		return Integer.parseInt(t);
	}

}
