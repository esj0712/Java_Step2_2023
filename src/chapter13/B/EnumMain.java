package chapter13.B;

import java.util.Scanner;

public class EnumMain {

	public enum Item {Start, pause, Exit} // 0 1 2 (�迭)ó�� ���� ����

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("���ڸ� �Է��ϼ���[0:���ӽ���, 1:�Ͻ�����, 2:��������} : ");

			int n = scan.nextInt();

			Item start = Item.Start; // start�� <= 0
			Item pause = Item.pause; // pause�� <= 1
			Item Exit = Item.Exit; // Exit�� <= 2

			if (n == start.ordinal()) // n == 0
				System.out.println("���� ����");
			else if (n == pause.ordinal()) // n == 1
				System.out.println("���� �Ͻ�����");
			else {
				System.out.println("���� ����");
				return;
			}

		}

	}

}
