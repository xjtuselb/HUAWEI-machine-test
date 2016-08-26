package 华为机试题;

import java.util.Scanner;

public class 字符统计 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			// 读取这一行
			String s = sc.nextLine();

			// 统计字符在ascii中出现的频率
			int[] asii = new int[200];
			for (int i = 0; i < s.length(); i++)
				asii[(int) s.charAt(i)]++;

			// 找出最大值
			int max = 0;
			for (int i = 0; i < 200; i++) {
				if (asii[i] > max)
					max = asii[i];
			}

			// max>=max>0由大到小打印
			// 次数由多到少，ascii有小到大输出
			while (max != 0) {
				for (int i = 0; i < 200; i++) {
					if (asii[i] == max)
						System.out.print((char) i);
				}
				max--;
			}

			System.out.println();
		}
		sc.close();
	}

}
