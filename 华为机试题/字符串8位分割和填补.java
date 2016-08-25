package 华为机试题;

import java.util.Scanner;

public class 字符串8位分割和填补 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < n; i++) {
				String x = sc.nextLine();
				printArr(x);
			}
		}
		sc.close();
	}

	public static void printArr(String x) {
		StringBuilder sb = new StringBuilder();

		while (x.length() / 8 > 0) {
			sb.append(x.substring(0, 8));
			x = x.substring(8);
			if (x.length() >= 1)
				sb.append("\n");
		}

		if (x.length() >= 1)
			sb.append((x + "00000000").substring(0, 8));
		System.out.println(sb.toString());
	}
}
