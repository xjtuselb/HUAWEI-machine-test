package 华为机试题;

import java.util.Scanner;

public class MN方格走路问题 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(calculateSteps(m, n));
		}
		sc.close();
	}

	public static int calculateSteps(int m, int n) {
		int[][] path = new int[m + 1][n + 1];
		int r = path.length;
		int c = path[0].length;

		for (int i = 0; i < c; i++)
			path[0][i] = 1;
		for (int i = 0; i < r; i++)
			path[i][0] = 1;
		for (int i = 1; i < r; i++) {
			for (int j = 1; j < c; j++) {
				path[i][j] = path[i - 1][j] + path[i][j - 1];
			}
		}
		return path[m][n];
	}
}
