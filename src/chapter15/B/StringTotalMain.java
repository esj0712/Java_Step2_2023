package chapter15.B;

import java.util.StringTokenizer;

public class StringTotalMain {

	public static void main(String[] args) {
		String str = "Have,a,Nice,Day";

		// Tokenizer
		// StringTokenizer(1,2,3)
		// 1 : ����� String ���ڿ�
		// 2 : �и��ϴ� ����
		// 3 : �ڸ��� ������ ǥ���Ұ��� ����

		StringTokenizer obj = new StringTokenizer(str, ",", false);

		while (obj.hasMoreTokens()) {
			String t = obj.nextToken();
			System.out.println(t);
		}

	}

}
