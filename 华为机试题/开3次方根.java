package 华为机试题;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class 开3次方根 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double intput = scanner.nextDouble();
		scanner.close();

		// 方案一：调用系统的函数cbrt解决问题
		System.out.printf("%.1f", Math.cbrt(intput));

		// 方案二：使用牛顿迭代
		System.out.println();
		System.out.printf("%.1f", getCubeRoot(intput));

		// 方案三：使用函数保留1位有效数字
		System.out.println();
		DecimalFormat df = new DecimalFormat("#.#");
		System.out.println(df.format(getCubeRoot(intput)));

		// 方案四；使用BigDecimal来保留一位有效数字
		System.out.println();
		BigDecimal bd = new BigDecimal(getCubeRoot(intput));
		System.out.println(bd.setScale(1, BigDecimal.ROUND_HALF_UP));
	}

	public static double getCubeRoot(double input) {
		// 合法性检测
		if (input == 0)
			return 0;
		
		// 迭代器参数
		double f0, f1;
		f0 = input;

		// 牛顿迭代器
		f1 = (2 * f0 / 3) + (input / (f0 * f0 * 3));
		while (Math.abs(f1 - f0) > 0.000001) {
			f0 = f1;
			f1 = (2 * f0 / 3) + (input / (f0 * f0 * 3));
		}

		return f1;
	}
}