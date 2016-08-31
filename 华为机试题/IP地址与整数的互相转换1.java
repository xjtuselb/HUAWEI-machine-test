package 华为机试题;

import java.util.Scanner;

public class IP地址与整数的互相转换1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.next();
			if (s.contains(".")) {
				System.out.println(ipToInt(s));
			} else {
				System.out.println(intToIp(Integer.parseInt(s)));
			}
		}
		sc.close();
	}

	// 整数转化成ip
	public static String intToIp(long n) {
		if (n > 2147483647)
			return "the number can not convert to a right ip.";

		StringBuilder sb = new StringBuilder();
		if (n <= 2147483647) {
			String stemp = "00000000000000000000000000000000" + decToBin(n);
			String s = stemp.substring(stemp.length() - 32, stemp.length());

			for (int i = 0; i < 3; i++) {
				sb.append(binToDec(s.substring(8 * i, 8 * i + 8))).append(".");
			}
			sb.append(binToDec(s.substring(24, 32)));
		}

		return sb.toString();
	}

	// ip地址转化成整数
	public static String ipToInt(String ip) {
		String sbin = "";
		String[] sa = ip.split("\\.");
		for (int i = 0; i < sa.length; i++) {
			String x = decToBin(Integer.parseInt(sa[i]));
			if (x.length() > 8) {
				sbin = "this is not a right ip";
				break;
			}
			sbin += ("00000000" + x).substring(("00000000" + x).length() - 8, ("00000000" + x).length());
		}

		return binToDec(sbin) + "";
	}

	// 十进制转化成二进制
	public static String decToBin(long n) {
		String s = "";
		while ((n / 2) != 0) {
			s += n % 2;
			n = n / 2;
		}
		s += n % 2;
		return new StringBuffer(s).reverse().toString();
	}

	// 二进制转化成十进制
	public static int binToDec(String s) {
		int sum = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			sum += Integer.parseInt(s.charAt(i) + "") * Math.pow(2, s.length() - 1 - i);
		}
		return sum;
	}

}
