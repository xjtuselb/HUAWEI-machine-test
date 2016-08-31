package 华为机试题;

import java.util.Scanner;

public class 最长的公共子字符串2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();

			String min = s1.length() > s2.length() ? s2 : s1;
			String max = s1.length() > s2.length() ? s1 : s2;

			String res = "";
			for (int i = 0; i < min.length()-1; i++) {
				for (int j = i+1; j <= min.length(); j++) {
					String tem = min.substring(i, j);
					if(max.contains(tem)&&tem.length()>res.length())
						res=tem;
				}
			}

			System.out.println(res);
		}
		sc.close();
	}

}
