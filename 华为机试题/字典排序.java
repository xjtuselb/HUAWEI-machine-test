package 华为机试题;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 字典排序 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = Integer.parseInt(sc.nextLine());
			ArrayList<String> al = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				al.add(sc.nextLine());
			}
			Collections.sort(al);
			for (String x : al) {
				System.out.println(x);
			}
		}
		sc.close();
	}

}
