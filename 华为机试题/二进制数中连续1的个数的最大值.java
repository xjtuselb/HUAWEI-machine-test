package 华为机试题;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 二进制数中连续1的个数的最大值 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			String bs = Integer.toBinaryString(n);

			ArrayList<String> al = new ArrayList<String>();
			Matcher m = Pattern.compile("1+").matcher(bs);
			while (m.find()) {
				al.add(m.group());
			}
			
			int max = 0;
			for (int i = 0; i < al.size(); i++) {
				if (al.get(i).length() >= max) {
					max = al.get(i).length();
				}
			}
			System.out.println(max);
		}
		sc.close();

	}

}
