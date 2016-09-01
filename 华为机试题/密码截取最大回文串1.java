package 测试二;

import java.util.Scanner;

public class 密码截取最大回文串1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			System.out.println(getMaxHuiWen(s).length());
		}
		sc.close();
	}

	public static String getMaxHuiWen(String s) {
		String x = "";
		String sr = new StringBuffer(s).reverse().toString();

		for (int i = 0; i <= s.length() - 1; i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String tem = s.substring(i, j);
				if (tem.length() >= x.length() && sr.contains(tem))
					x = tem;
			}
		}
		return x;
	}

}
