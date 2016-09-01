package 华为机试题;

import java.util.Scanner;

public class 查找二进制中1的个数 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(fun(n));
		}
		sc.close();
	}

	public static int fun(int n) {
		String s = Integer.toBinaryString(n);
		int num = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == '1')
				num++;
		return num;
	}

}
