package 华为机试题;

import java.util.Scanner;

public class 购物单 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int money = sc.nextInt();
			int num = sc.nextInt();
			int[] price = new int[num + 1];
			int[] value = new int[num + 1];
			int[] check = new int[num + 1];
			price[0] = 0;
			value[0] = 0;
			check[0] = 0;
			for (int i = 1; i <= num; i++) {
				price[i] = sc.nextInt();
				value[i] = sc.nextInt();
				check[i] = sc.nextInt();
			}
			// 行是数量，列是钱
			int[][] res = new int[num + 1][money + 1];
			for (int i = 0; i <= num; i++)
				res[i][0] = 0;
			// 行n=num数量 列m=money钱数
			for (int m = 1; m <= money; m++) {
				for (int n = 1; n <= num; n++) {
					// 买附件
					if (check[n] > 0 && price[n] + price[check[n]] < m) {
						// 递推(上次+本次)--->中间变量
						int w = res[n - 1][m - price[n]] + value[n] * price[n];
						// 中间变量--->本次
						res[n][m] = Math.max(w, res[n - 1][m]);
					}
					// 买主件
					if (check[n] <= 0 && price[n] <= m) {
						// 递推(上次+本次)--->中间变量
						int w = res[n - 1][m - price[n]] + value[n] * price[n];
						// 中间变量--->本次
						res[n][m] = Math.max(w, res[n - 1][m]);
					}
				}
			}
			System.out.println(res[num][money]);
		}
		sc.close();
	}
}
