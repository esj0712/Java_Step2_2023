package chapter18.hashmap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTable {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();

		map.put("Spring", "123");
		map.put("Summer", "1234");
		map.put("Fall", "12345");
		map.put("Winter", "123456");

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��� �ּ���.");
			System.out.print("���̵� : ");
			String id = scan.next();
			System.out.println();

			if (map.containsKey(id)) {
				System.out.print("��й�ȣ : ");
				String pw = scan.next();
				if (map.get(id).equals(pw)) {
					System.out.println("�α��� ����");

					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ ���� �ʽ��ϴ�.");
					continue;
				} // in if
			} else {
				System.out.println("�Է��Ͻ� ���̵�� �������� �ʽ��ϴ�.");
			}

		}

	}
}