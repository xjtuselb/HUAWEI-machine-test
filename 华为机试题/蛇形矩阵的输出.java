package 华为机试题;

import java.util.Scanner;

public class 蛇形矩阵的输出 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			StringBuilder sb = new StringBuilder();

			for (int i = 1; i <= n; i++) {
				// 每一行的第一个元素是(i-1)*i/2+1
				// 每一行的元素个数是n-i
				// 初始间隔是i+1，之后每一个间隔比上一个间隔多1，之后的每个元素是前一个元素加上间隔
				for (int j = 1, start = (i - 1) * i / 2 + 1, step = i + 1; j <= n - i + 1; j++, start += step++) {
					sb.append(start).append(' ');
				}

				// 设置换行符
				sb.setCharAt(sb.length() - 1, '\n');
				
			}
			System.out.print(sb.toString());
		}
		sc.close();
	}

}