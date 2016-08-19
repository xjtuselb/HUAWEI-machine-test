package 华为机试题;

import java.util.Scanner;

public class 进制转换问题 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
			System.out.println(fun(sc.nextLine().toString()));
		sc.close();
	}

	public static int fun(String s) {
		int n = 0;
		int count = 0;
		int x = 0;
		char ch;
		while (count < s.length()) {
			ch = s.charAt(s.length() - count - 1);

			if (ch >= '0' && ch <= '9')
				x = ch - '0';
			else if (ch >= 'A' && ch <= 'F')
				x = ch - 'A' + 10;
			else if (ch >= 'a' && ch <= 'f')
				x = ch - 'a' + 10;
			else
				break;

			System.out.println(x);
			n += x * Math.pow(16, count);
			count++;
		}
		return n;
	}

}
