package 华为机试题;

import java.util.Scanner;

public class 删除字符串中出现次数最少的字符 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			System.out.println(fun(sc.nextLine()));
		}

		sc.close();

	}

	public static String fun(String s) {

		char[] c = s.toCharArray();
		int[] zmb = new int[26];
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < c.length; i++)
			zmb[(int) (c[i] - 'a')]++;

		for (int i = 0; i < zmb.length; i++) {
			if (zmb[i] < min && zmb[i] != 0)
				min = zmb[i];
		}

		for (int i = 0; i < zmb.length; i++) {
			if (zmb[i] == min)
				s = s.replaceAll((char) (i + 97) + "", "");
		}

		return s;
	}

}
