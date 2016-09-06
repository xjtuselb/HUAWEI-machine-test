package 华为机试题;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 识别有效的IP地址和掩码并进行分类统计 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int typeA = 0;
		int typeB = 0;
		int typeC = 0;
		int typeD = 0;
		int typeE = 0;
		int errIpOrMask = 0;
		int privateIp = 0;
		while (sc.hasNext()) {
			String line = sc.next();
			String[] arr = line.split("~");
			String ip = arr[0];
			String mask = arr[1];
			if (!isRightIp(ip) || !isRightMask(mask)) {
				errIpOrMask++;
				continue;
			}
			if (isRightIp(ip) == true) {
				char c = typeIp(ip);
				if (c == 'A')
					typeA++;
				else if (c == 'B')
					typeB++;
				else if (c == 'C')
					typeC++;
				else if (c == 'D')
					typeD++;
				else if (c == 'E')
					typeE++;
			}
			if (isRightIp(ip) == true && isPrivateIp(ip) == true)
				privateIp++;
		}
		System.out.printf("%d %d %d %d %d %d %d", typeA, typeB, typeC, typeD, typeE, errIpOrMask, privateIp);
		sc.close();
	}

	public static boolean isRightIp(String ip) {
		boolean flag = true;

		if (ip == null || "".equals(ip))
			return false;

		Matcher m = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$").matcher(ip);
		if (m.matches()) {
			String[] a = ip.split("\\.");
			for (int i = 0; i < 4; i++) {
				int n = Integer.valueOf(a[i]);
				if (n < 0 || n > 255) {
					flag = false;
					break;
				}
			}
		} else
			flag = false;
		return flag;
	}

	public static boolean isRightMask(String mask) {
		String s = "";
		String[] m = mask.split("\\.");
		for (int i = 0; i < 4; i++)
			s += decToBin(Integer.valueOf(m[i]));
		int firstindexOf0 = s.indexOf("0");
		int lastIndexOf1 = s.lastIndexOf("1");
		if (firstindexOf0 < lastIndexOf1)
			return false;
		return true;
	}

	public static char typeIp(String ip) {
		char res = ' ';
		String[] iparr = ip.split("\\.");
		Integer n = Integer.valueOf(iparr[0]);
		if (n >= 1 && n <= 126)
			res = 'A';
		else if (n >= 128 && n <= 191)
			res = 'B';
		else if (n >= 192 && n <= 223)
			res = 'C';
		else if (n >= 224 && n <= 239)
			res = 'D';
		else if (n >= 240 && n <= 255)
			res = 'E';
		return res;
	}

	public static boolean isPrivateIp(String ip) {
		String[] iparr = ip.split("\\.");
		int x = Integer.valueOf(iparr[0]);
		int y = Integer.valueOf(iparr[1]);
		boolean flag = (x == 10) || ((x == 172) && (y >= 16 && y <= 31)) || (x == 192 && y == 168);
		if (flag)
			return true;
		return false;
	}

	public static String decToBin(int n) {
		String s0 = "000000000";
		String bs = Integer.toBinaryString(n);
		String tem = s0 + bs;
		return tem.substring(tem.length() - 8, tem.length());
	}
}
