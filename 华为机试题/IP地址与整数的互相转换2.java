package 华为机试题;

import java.util.Scanner;

public class IP地址与整数的互相转换2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			if (s.contains(".")) {
				String[] a = s.split("\\.");

				long num = 0;
				for (int i = 0; i < a.length; i++) {
					if (i == 0) {
						num += Long.parseLong(a[i]) * Math.pow(256, 3);
					} else if (i == 1) {
						num += Long.parseLong(a[i]) * Math.pow(256, 2);
					} else if (i == 2) {
						num += Long.parseLong(a[i]) * Math.pow(256, 1);
					} else {
						num += Long.parseLong(a[i]) * Math.pow(256, 0);
					}
				}

				System.out.println(num);
			} else {
				long IP = Long.parseLong(s);
				System.out.print(IP / 256 / 256 / 256);
				System.out.print(".");
				System.out.print((IP / (256 * 256)) % 256);
				System.out.print(".");
				System.out.print((IP / 256) % 256);
				System.out.print(".");
				System.out.println(IP % 256);
			}

		}
		sc.close();
	}

}
