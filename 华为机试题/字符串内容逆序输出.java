package 华为机试题;

import java.util.Scanner;

public class 字符串内容逆序输出 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			System.out.println(reverseStr(sc.nextLine()));
		}
		sc.close();

	}

	private static String reverseStr(String s) {
		String x = "";

		String[] a = s.split(" ");
		if (a.length > 1) {
			for (int i = a.length - 1; i > 0; i--) {
				x += new StringBuffer(a[i]).reverse().toString();
				x += " ";
			}
			x += new StringBuffer(a[0]).reverse().toString();
		} else {
			x = new StringBuffer(s).reverse().toString();
		}
		return x;
	}

}
