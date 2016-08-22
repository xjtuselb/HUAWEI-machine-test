package 华为机试题;

import java.util.Scanner;
import java.util.TreeSet;

public class 明明随机数去重排序 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			TreeSet<Integer> ts = new TreeSet<Integer>();
			int n = sc.nextInt();
			if (n > 0) {
				for (int i = 0; i < n; i++)
					ts.add(sc.nextInt());
			}

			for (Integer i : ts)
				System.out.println(i);
		}
		sc.close();

	}

}
