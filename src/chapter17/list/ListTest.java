package chapter17.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		// ����Ʈ ������ ���� ArrayListŬ������ ��ü����
		// �迭 : String[] ls1={};
		List<String> ls = new ArrayList<String>();
		// ����Ʈ�� ������ �߰�
		ls.add("Hi!");
		ls.add("Happy!");
		ls.add("Nice!");

		for (int i = 0; i < ls.size(); i++) {
			System.out.println(i + " : " + ls.get(i));
		}

		System.out.println();
		System.out.println("=================�߰���================");
		ls.add(3, "Good");

		for (int i = 0; i < ls.size(); i++) {
			System.out.println(i + " : " + ls.get(i));
		}

		System.out.println();
		System.out.println("=================������================");
		ls.remove(0);

		for (int i = 0; i < ls.size(); i++) {
			System.out.println(i + " : " + ls.get(i));
		}

	}
}