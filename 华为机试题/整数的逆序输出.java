package 华为机试题;

import java.util.Scanner;

public class 整数的逆序输出 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		String s = new StringBuffer(Integer.toString(x)).reverse().toString();

		System.out.println(s);

	}

}
