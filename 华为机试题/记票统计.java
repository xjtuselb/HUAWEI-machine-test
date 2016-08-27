package 华为机试题;

import java.util.Scanner;

public class 记票统计 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			// 输入
			String line1 = sc.nextLine();
			String line2 = sc.nextLine();
			String line3 = sc.nextLine();
			String line4 = sc.nextLine();

			// 处理
			int houxuanrenshu = Integer.parseInt(line1);
			String[] houxuanren = line2.split(" ");

			int xuanjurenshu = Integer.parseInt(line3);
			String[] xuanjujieguo = line4.split(" ");

			// 状态
			int[] flag = new int[houxuanrenshu + 1];
			// 写状态
			for (int i = 0; i < houxuanrenshu; i++) {
				for (int j = 0; j < xuanjurenshu; j++) {
					if (houxuanren[i].equals(xuanjujieguo[j])) {
						flag[i]++;
					}
				}
			}
			// 写无效的状态
			int sumyouxiao = 0;
			for (int i = 0; i < flag.length - 1; i++) {
				sumyouxiao += flag[i];
			}
			flag[flag.length - 1] = xuanjurenshu - sumyouxiao;

			// 输出
			String s = "";
			for (int i = 0; i < houxuanrenshu; i++) {
				s += houxuanren[i] + " : " + flag[i] + "\n";
			}
			s += "Invalid : " + flag[flag.length - 1];

			System.out.println(s);

		}
		sc.close();
	}

}
