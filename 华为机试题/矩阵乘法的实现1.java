package 华为机试题;

import java.util.Scanner;

public class 矩阵乘法的实现1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int r1, c1, r2, c2;
			r1 = Integer.parseInt(sc.nextLine());
			c1 = Integer.parseInt(sc.nextLine());
			r2 = c1;
			c2 = Integer.parseInt(sc.nextLine());

			int[][] x = new int[r1][c1];
			int[][] y = new int[r2][c2];

			for (int i = 0; i < r1; i++) {
				String[] str = sc.nextLine().split(" ");
				for (int j = 0; j < str.length; j++) {
					x[i][j] = Integer.parseInt(str[j]);
				}
			}

			for (int i = 0; i < r2; i++) {
				String[] str = sc.nextLine().split(" ");
				for (int j = 0; j < str.length; j++) {
					y[i][j] = Integer.parseInt(str[j]);
				}
			}

			// print2DArray(x);
			// print2DArray(y);
			print2DArray(matrixMultiplication(x, y));

		}
		sc.close();
	}

	@SuppressWarnings("unused")
	public static int[][] matrixMultiplication(int[][] x, int[][] y) {

		int r1 = x.length, c1 = x[0].length, r2 = y.length, c2 = y[0].length;

		int[][] r = new int[r1][c2];

		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				r[i][j] = vectorMultiplication(x, i, y, j);
			}
		}

		return r;
	}

	@SuppressWarnings("unused")
	public static int vectorMultiplication(int[][] x, int r, int[][] y, int c) {
		int r1 = x.length, c1 = x[0].length, r2 = y.length, c2 = y[0].length;
		int[] a = new int[c1];
		int[] b = new int[r2];

		for (int i = 0; i < c1; i++) {
			a[i] = x[r][i];
			b[i] = y[i][c];
		}

		int sum = 0;
		for (int i = 0; i < c1; i++) {
			sum += a[i] * b[i];
		}

		return sum;
	}

	public static void print2DArray(int[][] a) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length - 1; j++) {
				sb.append(a[i][j]).append(" ");
			}
			sb.append(a[i][a[i].length - 1]).append("\n");
		}
		System.out.println(sb.toString().substring(0, sb.length() - 1));
	}

}
