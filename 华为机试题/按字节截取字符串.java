package 华为机试题;

import java.util.Scanner;

public class 按字节截取字符串 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			// 输入的字符串
			String s = sc.next();
			// 要截取的字节数
			int n = Integer.parseInt(sc.nextLine());
			// 要截取字符串的尾下标
			int index = 0;
			// 按照截取的个数递减循环
			while (n > 0) {
				// ASC码值大于256的认为是汉字，要截取字节数n-2
				// 其他的认为是单字节的字符，要截取字节数n-1
				if (s.charAt(index) > 256) {
					n -= 2;
					if (n >= 0)
						index++;
				} else {
					n--;
					index++;
				}
			}
			// 打印截取的字符串
			System.out.println(s.substring(0, index));
		}
		sc.close();

	}

}
