package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentMain {

	public static void main(String[] args) {

		// �л�����, ����
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		// �ߺ� X
		map.put(new Student(1, "ȫ�浿"), 95);
		map.put(new Student(2, "�̼���"), 85);
		map.put(new Student(3, "�念��"), 75);
		map.put(new Student(4, "�Ѽ���"), 65);
		map.put(new Student(5, "�� ��"), 90);

		// ����� �� Entry�� ���
		System.out.println("�� Entry �� : " + map.size());

		// �ϳ��� ó���ϴ� ���
		Set<Student> KeySet = map.keySet();
		Iterator<Student> KeyIterator = KeySet.iterator();

		while (KeyIterator.hasNext()) {
			Student key = KeyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}

		Scanner scan = new Scanner(System.in);

		Student std;
		int input;
		String name;

		while (true) {

			System.out.print("�л� ��ȣ�� �Է��ϼ��� : ");
			input = scan.nextInt();
			System.out.print("�л��̸��� �Է��ϼ��� :");
			name = scan.next();
			std = new Student(input, name);

			if (map.containsKey(std)) {
				System.out.println(name + " �л��� ������ : " + map.get(std));
				break;

			} else {
				System.out.println("�ش� �л��� �����Ͱ� �������� �ʽ��ϴ�.");
			}

		}

	}

}
