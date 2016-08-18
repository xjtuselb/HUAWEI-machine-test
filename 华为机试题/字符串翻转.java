package 华为机试题;

import java.util.Scanner;

public class 字符串翻转 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();

		System.out.println(new StringBuffer(s).reverse().toString());

	}

}
