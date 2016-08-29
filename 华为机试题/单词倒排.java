package 华为机试题;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 单词倒排 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			System.out.println(reverseStence(s));
		}
		sc.close();
	}

	public static String reverseStence(String s) {
		String r = "";
		
		ArrayList<String> al = new ArrayList<String>();
		Matcher m = Pattern.compile("[a-zA-Z]+").matcher(s);
		while(m.find()){
			al.add(m.group());
		}
		
		String[] a = al.toArray(new String[al.size()]);
		for (int i = a.length - 1; i > 0; i--) {
			r += a[i] + " ";
		}
		r += a[0];
		
		return r;
	}

}
