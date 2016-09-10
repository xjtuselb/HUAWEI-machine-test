package 华为机试题;

import java.util.Scanner;
import java.util.Stack;

public class 矩阵乘法复杂度计算 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			// 数据输入
			int n = Integer.parseInt(sc.nextLine());

			int[][] book = new int[n][2];
			for (int i = 0; i < n; i++) {
				String[] tmp = sc.nextLine().split(" ");
				book[i][0] = Integer.parseInt(tmp[0]);
				book[i][1] = Integer.parseInt(tmp[1]);
			}

			String rule = sc.nextLine();

			// 数据操作
			Stack<Integer> stack = new Stack<>();
			int sum = 0, count = 0;

			for (int i = 0; i < rule.length(); i++) {
				char tem = rule.charAt(i);
				// 操作1
				if (tem == '(')
					stack.push(-1);

				// 操作2
				if (Character.isLetter(tem)) {
					if (!stack.isEmpty() && stack.peek() != -1) {
						int col = stack.pop();
						int row = stack.pop();
						int col2 = book[count][1];
						sum += col * row * col2;
						stack.push(row);
						stack.push(col2);
					} else {
						stack.push(book[count][0]);
						stack.push(book[count][1]);
					}
					count++;
				}

				// 操作3
				if (tem == ')') {
					int col1 = stack.pop();
					int row1 = stack.pop();
					stack.pop();

					if (stack.size() <= 1)
						break;
					if (stack.peek() != -1) {
						stack.pop();
						int row2 = stack.pop();
						sum += row2 * row1 * col1;
						row1 = row2;
					}
					stack.push(row1);
					stack.push(col1);
				}
			}

			System.out.println(sum);
		}
		sc.close();
	}

}
