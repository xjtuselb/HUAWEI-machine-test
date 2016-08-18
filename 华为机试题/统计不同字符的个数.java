package 华为机试题;

import java.util.HashSet;
import java.util.Scanner;

public class 统计不同字符的个数 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();

		HashSet<Integer> hs = new HashSet<Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 0 && s.charAt(i) <= 127) {
				hs.add((int) s.charAt(i));
			}
		}

		System.out.println(hs.size());

	}

}
