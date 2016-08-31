package 华为机试题;

import java.util.Scanner;

public class 坐标移动 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			System.out.println(move(s));
		}
		sc.close();
	}

	public static String move(String s) {
		String[] tem = s.split(";");
		int x = 0, y = 0;

		for (int i = 0; i < tem.length; i++) {
			if (isRightCommond(tem[i]) == true) {

				String s1 = tem[i].substring(0, 1);
				String s2 = tem[i].substring(1, tem[i].length());
				int n = Integer.parseInt(s2);

				if (s1.equals("A"))
					x -= n;
				if (s1.equals("D"))
					x += n;
				if (s1.equals("W"))
					y += n;
				if (s1.equals("S"))
					y -= n;
			}
		}

		return x + "," + y;

	}

	// 判断单一的命令是否是有效的命令
	public static boolean isRightCommond(String s) {
		boolean f = true;
		if (s.length() < 2 || s.length() > 3)
			f = false;
		else {
			String s0 = s.substring(0, 1);
			String set1 = "ADWS";
			String set2 = "0123456789";
			
			if (!set1.contains(s0))
				f = false;

			for (int i = 1; i < s.length(); i++) {
				if (!(set2.contains(s.charAt(i) + ""))) {
					f = false;
				}
			}
		}
		return f;
	}

}
