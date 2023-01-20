package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {
		// Map<String, Integer>���� map
		Map<String, Integer> map = new HashMap<String, Integer>();

		// ���� ������(����, �й�)����
		map.put("��â��", 14);
		map.put("�̼���", 14);
		map.put("�Ѽ���", 12);
		map.put("�̼���", 14);
		map.put("������", 15);
		map.put("���ر�", 16);

		// ������ �ο�
		System.out.println("������ �� �ο� : " + map.size() + "��");
		System.out.println();

		// ������ �й��� �˾Ƴ���
		System.out.println("�����й� : " + map.get("��â��"));
		System.out.println();

		// ���� ����� �й� ���
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();

		System.out.println("���� ��ü�� �й�");
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(value + " �й�");
		}
	}

}
