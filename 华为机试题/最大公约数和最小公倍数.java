package 华为机试题;

public class 最大公约数和最小公倍数 {
	public static void main(String[] args) {

		// 递归法测试
		System.out.println("递归法测试：");
		System.out.println(gcd(12, 3));
		System.out.println(lcm(12, 3));

		// 循环法测试
		System.out.println("循环法测试：");
		System.out.println(gcd1(3, 12));
		System.out.println(lcm1(12, 3));
	}

	// 递归法求最大公约数
	public static int gcd(int m, int n) {
		if (n <= m)
			if (m % n == 0)
				return n;
			else
				return gcd(n, m % n);
		else
			return gcd(n, m);// 递归调用
	}

	// 求最小公倍数
	public static int lcm(int m, int n) {
		return m * n / gcd(m, n);
	}

	// 循环法求最大公约数
	public static int gcd1(int m, int n) {
		while (m % n != 0) {
			int temp = m % n;
			m = n;
			n = temp;
		}
		return n;
	}

	// 最小公倍数
	public static int lcm1(int m, int n) {
		return m * n / gcd1(m, n);
	}
}