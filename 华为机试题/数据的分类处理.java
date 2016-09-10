package 华为机试题;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class 数据的分类处理 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String I = sc.nextLine();
			String R = sc.nextLine();
			String[] arrR = R.split(" ");
			String[] arrI = I.split(" ");
			getResult(arrR, arrI);
		}
		sc.close();
	}

	public static void getResult(String[] strR, String[] strI) {
		LinkedList<Integer> res = new LinkedList<>();
		Set<Integer> setR = new TreeSet<>();

		for (int i = 1; i < strR.length; i++)
			setR.add(Integer.parseInt(strR[i]));

		for (int str : setR) {
			LinkedList<Integer> temp = new LinkedList<>();

			for (int i = 1; i < strI.length; i++) {
				if (strI[i].contains("" + str)) {
					temp.add(i - 1);
					temp.add(Integer.parseInt(strI[i]));
				}
			}

			if (!temp.isEmpty()) {
				res.add(str);
				res.add(temp.size() / 2);
				res.addAll(temp);
			}
		}

		System.out.print(res.size() + " ");

		int count = res.size();
		for (int ele : res) {
			if (count != 1)
				System.out.print(ele + " ");
			else
				System.out.print(ele);
			count--;
		}
		System.out.println();
	}
}
