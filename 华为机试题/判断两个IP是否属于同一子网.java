package 华为机试题;

import java.util.Scanner;

public class 判断两个IP是否属于同一子网 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s1 = sc.next();
			String s2 = sc.next();
			String s3 = sc.next();

			System.out.println(function(s1, s2, s3));
		}
		sc.close();
	}

	public static int function(String s1, String s2, String s3) {
		int flag = 0;

		if (s1 == null || s1.length() == 0 || s2 == null || s2.length() == 0 || s3 == null || s3.length() == 0)
			flag = 1;

		String mask = ipStrToBinStr(s1);
		String ip1 = ipStrToBinStr(s2);
		String ip2 = ipStrToBinStr(s3);

		for (int i = 0; i < 32; i++) {
			int m = Integer.parseInt(mask.charAt(i) + "");
			int c1 = Integer.parseInt(ip1.charAt(i) + "");
			int c2 = Integer.parseInt(ip2.charAt(i) + "");
			boolean f = (m & c1) != (m & c2);
			if (f) {
				flag = 2;
				break;
			}
		}

		return flag;
	}

	public static String ipStrToBinStr(String s) {
		String res = "";
		String[] a = s.split("\\.");
		for (int i = 0; i < a.length; i++) {
			String tem = "0000000000" + Integer.toBinaryString(Integer.parseInt(a[i]));
			res += tem.substring(tem.length() - 8, tem.length());
		}

		String temp = "00000000000000000000000000000000";
		int len = (temp + res).length();
		res = (temp + res).substring(len - 32, len);

		return res;
	}

}
