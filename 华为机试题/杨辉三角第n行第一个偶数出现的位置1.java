package 华为机试题;

import java.util.Scanner;

public class 杨辉三角第n行第一个偶数出现的位置1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(getTheFirstEvenNumber(n));
		}
		sc.close();

	}

	// 遍历得到最大值
	public static int getTheFirstEvenNumber(int n) {
		int ret = -1;
		int[][] yangHui = new int[n][n];
		insertYangHui(yangHui);
		print2DArray(yangHui);
		for (int j = n - 1; j >= 0; j--) {
			if (yangHui[n - 1][j] % 2 == 0) {
				ret = n - j;
				break;
			}
		}
		return ret;
	}

	// 填充矩阵：即三角的变半边
	public static void insertYangHui(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				if ((i == j) || (i == 1 && j == 0)) {
					a[i][j] = 1;
				} else if ((i + 1 == j) && (i >= 2)) {
					a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
				} else if ((i >= 2) && (j == 0)) {
					a[i][j] = a[i - 1][j] + 2 * a[i - 1][j + 1];
				} else {
					a[i][j] = a[i - 1][j] + a[i - 1][j - 1] + a[i - 1][j + 1];
				}
			}
		}

	}

	// 打印
	public static void print2DArray(int[][] a) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length - 1; j++) {
				sb.append(a[i][j]).append("\t");
			}
			sb.append(a[i][a[i].length - 1]).append("\n");
		}
		System.out.print(sb.toString());
	}

}
