package 华为机试题;

import java.util.Scanner;

public class DNA子序列 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			int n = sc.nextInt();
			if (s.length() < n)
				continue;
			System.out.println(getSubString(s, n));
		}
		sc.close();
	}

	public static String getSubString(String s, int n) {
		int len = s.length();
		String res = "";
		int GCRatio = 0;

		for (int i = 0; i < len; i++) {
			if (i + n > len)
				break;
			String subs = s.substring(i, i + n);
			if (getGCRatio(subs) > GCRatio) {
				res = subs;
				GCRatio = getGCRatio(subs);
			}
//			System.out.println(subs + " " + getGCRatio(subs) + " " + GCRatio);
		}

		return res;
	}

	public static int getGCRatio(String s) {
		int len = s.length();
		int GC = 0;
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == 'G' || s.charAt(i) == 'C')
				GC++;
		}
		return GC;
	}

}
