package 华为机试题;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 人民币数字转大写 {

	public static void main(String[] args) {
		// System.out.println(readMoney("0.78"));
		// System.out.println(readMoney("10000.00"));
		// System.out.println(readMoney("100110000089.00"));
		// System.out.println(readMoney("100110000089.00"));
		// System.out.println(readMoney("000000089.00"));
		// System.out.println(readMoney("100110000089.00"));
		// System.out.println(readMoney("1000000009.10"));

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {

			System.out.println(readMoney(sc.nextLine()));

		}

		sc.close();

	}

	public static boolean isXiaoShu(String x) {
		boolean flag = false;
		Pattern p = Pattern.compile("\\.");
		Matcher m = p.matcher(x);
		while (m.find()) {
			flag = true;
		}
		return flag;
	}

	// 分解整数和小数
	public static ArrayList<String> fenJieZhengshu(String x) {
		ArrayList<String> ret = new ArrayList<String>();
		ArrayList<String> al = new ArrayList<String>();
		Pattern p = Pattern.compile("[0-9]+");
		Matcher m = p.matcher(x);
		while (m.find()) {
			al.add(m.group());
		}
		int zhengshuweishu = al.get(0).length();
		if (zhengshuweishu >= 0 && zhengshuweishu <= 4) {
			ret.add(al.get(0));
		}
		if (zhengshuweishu >= 5 && zhengshuweishu <= 8) {
			ret.add(al.get(0).substring(0, zhengshuweishu - 4));
			ret.add(al.get(0).substring(zhengshuweishu - 4, zhengshuweishu));
		}
		if (zhengshuweishu >= 9 && zhengshuweishu <= 12) {
			ret.add(al.get(0).substring(0, zhengshuweishu - 8));
			ret.add(al.get(0).substring(zhengshuweishu - 8, zhengshuweishu - 4));
			ret.add(al.get(0).substring(zhengshuweishu - 4, zhengshuweishu));
		}
		return ret;
	}

	public static String fenJieXiaoshu(String x) {
		String xiaoshu = "";
		ArrayList<String> al = new ArrayList<String>();
		Pattern p = Pattern.compile("[0-9]+");
		Matcher m = p.matcher(x);
		while (m.find()) {
			al.add(m.group());
		}
		xiaoshu = al.get(1);
		return xiaoshu;
	}

	// 读仟，读小数
	public static String readQian(String x) {
		String ret = "";
		String daxie = "零壹贰叁肆伍陆柒捌玖拾";
		String danwei = "个拾佰仟万亿";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < x.length(); i++) {
			sb.append(daxie.charAt(Integer.parseInt(x.charAt(i) + "")));
			sb.append(danwei.charAt(x.length() - i - 1));
		}
		ret = sb.toString();
		return ret;
	}

	public static String readxiaoshu(String x) {
		String ret = "";
		String daxie = "零壹贰叁肆伍陆柒捌玖拾";
		ret = daxie.charAt(Integer.parseInt(x.charAt(0) + "")) + "角";
		ret = ret + daxie.charAt(Integer.parseInt(x.charAt(1) + "")) + "分";
		return ret;
	}

	// 统一读法
	public static String readMoney(String x) {
		String ret = "";

		StringBuilder sb_temp = new StringBuilder();
		ArrayList<String> zheng = fenJieZhengshu(x);
		if (zheng.size() == 1) {
			sb_temp.append(readQian(zheng.get(0)));
		}
		if (zheng.size() == 2) {
			sb_temp.append(readQian(zheng.get(0)));
			sb_temp.append("万");
			sb_temp.append(readQian(zheng.get(1)));
		}
		if (zheng.size() == 3) {
			sb_temp.append(readQian(zheng.get(0)));
			sb_temp.append("亿");
			sb_temp.append(readQian(zheng.get(1)));
			sb_temp.append("万");
			sb_temp.append(readQian(zheng.get(2)));
		}

		String xiao = "";
		if (isXiaoShu(x) == true) {
			xiao = readxiaoshu(fenJieXiaoshu(x));
			sb_temp.append("元");
			sb_temp.append(xiao);
			ret = "人民币" + sb_temp.toString();
		}
		if (isXiaoShu(x) == false) {
			ret = "人民币" + sb_temp.toString() + "元整";
		}

		ret = xiuGai(ret);

		return ret;
	}

	// 修改
	public static String xiuGai(String x) {
		String ret = x;
		for (int i = 0; i < 2; i++) {
			ret = ret.replaceAll("零角零分", "整");
			ret = ret.replaceAll("零角", "零");
			ret = ret.replaceAll("零分", "");
			ret = ret.replaceAll("零仟零佰零拾零个亿", "");
			ret = ret.replaceAll("零仟零佰零拾零个万", "零");
			ret = ret.replaceAll("零仟零佰零拾零个", "");
			ret = ret.replaceAll("零佰零拾零个", "");
			ret = ret.replaceAll("零拾零个", "");
			ret = ret.replaceAll("零个元", "");
			ret = ret.replaceAll("零个", "");
			ret = ret.replaceAll("零仟零佰零拾", "零");
			ret = ret.replaceAll("零仟零佰", "零");
			ret = ret.replaceAll("零万", "万");
			ret = ret.replaceAll("零仟", "零");
			ret = ret.replaceAll("零佰", "零");
			ret = ret.replaceAll("零拾", "零");
			ret = ret.replaceAll("零零", "零");
			ret = ret.replaceAll("个", "");
			ret = ret.replaceAll("人民币零", "人民币");
			ret = ret.replaceAll("人民币亿", "人民币");
			ret = ret.replaceAll("", "");

			ret = ret.replaceAll("壹拾", "拾");
			ret = ret.replaceAll("元零", "元");
		}
		return ret;
	}

}