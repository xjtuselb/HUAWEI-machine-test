package 华为机试题;

import java.util.Scanner;

public class 句子逆序 {

	// i am a boy
	// boy a am i
	
	public static void main(String[] args) {
		// 输入一行句子
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		sc.close();

		// 把句子按照空格划分成单词
		String[] word = sentence.split("\\s+");

		// 把最后一个单词做成动态字符串
		StringBuffer sb = new StringBuffer(word[word.length - 1]);

		// 逆序添加其他的单词到动态字符串
		for (int i = word.length - 2; i >= 0; i--) {
			sb.append(" ");
			sb.append(word[i]);
		}

		System.out.println(sb.toString());

	}

}
