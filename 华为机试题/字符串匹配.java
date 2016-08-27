package 华为机试题;

import java.util.Scanner;

public class 字符串匹配 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String x = sc.nextLine();
			String y = sc.nextLine();
			boolean flag = matching(x,y);
			System.out.println(flag);
		}
		sc.close();
	}
	
	
	public static boolean matching(String x, String y){
		boolean flag = true;
		for(int i=0;i<x.length();i++){
			if(!y.contains(x.charAt(i)+"")){
				flag = false;
				break;
			}
		}
		return flag;
	}

}
