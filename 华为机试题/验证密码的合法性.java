package 华为机试题;

import java.util.Scanner;

public class 验证密码的合法性 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String x = sc.nextLine();
			if (isLen(x) == true && isFourKind(x) == true && isNotSame(x) == true)
				System.out.println("OK");
			else
				System.out.println("NG");
		}
		sc.close();

	}

	public static boolean isLen(String x) {
		if (x.length() > 8)
			return true;
		return false;
	}

	public static boolean isFourKind(String x) {
		boolean flag = false;

		int f1 = 0, f2 = 0, f3 = 0, f4 = 0;
		for (int i = 0; i < x.length(); i++) {
			char c = x.charAt(i);

			if (c >= '0' && c <= '9')
				f1++;
			else if (c >= 'a' && c <= 'z')
				f2++;
			else if (c >= 'A' && c <= 'Z')
				f3++;
			else
				f4++;
		}

		if (f1 >= 1)
			f1 = 1;
		if (f2 >= 1)
			f2 = 1;
		if (f3 >= 1)
			f3 = 1;
		if (f4 >= 1)
			f4 = 1;
		if (f1 + f2 + f3 + f4 >= 3)
			flag = true;

		return flag;
	}

	public static boolean isNotSame(String x) {
		for (int i = 0; i < x.length() - 3; i++) {
			String str1 = x.substring(i, i + 3);
			String str2 = x.substring(i + 3, x.length());
			if (str2.contains(str1))
				return false;
		}
		return true;
	}

}
