package 华为机试题;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 在字符串中找出连续最长的数字串 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			ArrayList<String> al = new ArrayList<>();
			Matcher m = Pattern.compile("[0-9]+").matcher(s);
			while (m.find()) {
				al.add(m.group());
			}

			int max = 0;
			for (int i = 0; i < al.size(); i++) {
				max = al.get(i).length() > max ? al.get(i).length() : max;
			}

			String maxstr = "";
			for (int i = 0; i < al.size(); i++) {
				if (al.get(i).length() == max)
					maxstr += al.get(i);
			}

			System.out.println(maxstr + "," + max);
		}
		sc.close();
	}
}
