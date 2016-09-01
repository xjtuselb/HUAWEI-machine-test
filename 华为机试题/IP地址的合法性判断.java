package 华为机试题;

import java.util.Scanner;

public class IP地址的合法性判断 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String ip = sc.nextLine();
			System.out.println(isRightIP(ip));
		}
		sc.close();
	}

	public static String isRightIP(String ip) {

		for (int i = 0; i < ip.length(); i++) {
			if (!"0123456789.".contains(ip.charAt(i) + ""))
				return "NO";
		}

		if (ip.contains(" "))
			return "NO";

		String[] a = ip.split("\\.");

		if (a.length != 4)
			return "NO";

		for (int i = 0; i < 4; i++) {
			if (Integer.parseInt(a[i]) > 255 || Integer.parseInt(a[i]) < 0)
				return "NO";
		}

		return "YES";
	}

}
