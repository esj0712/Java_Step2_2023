package chapter19.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {

		List<TravelCustomer> cus = new ArrayList<TravelCustomer>();

		// ��ü ����
		TravelCustomer a1 = new TravelCustomer("ȫ�浿", 19, 10000);
		TravelCustomer a2 = new TravelCustomer("�̼���", 21, 20000);
		TravelCustomer a3 = new TravelCustomer("������", 22, 30000);
		// �߰�
		cus.add(a1);
		cus.add(a2);
		cus.add(a3);

		System.out.println("===�� ��� �߰��� ������� ���===");

		// map : �����͸� Ư�����ǿ� �ش��ϴ� ������ ��ȯ�� ��
		cus.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		// mapToInt : int�� �ڷ�� ��ȯ
		int total = cus.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("�� ���� : " + total);
		// filter : Ư�� ���ǿ� �´� �����͸� �ɷ�����
		System.out.println("==20�� �̻��� ���� �̸��� �����Ͽ� ���==");
		cus.stream().filter(c -> c.getAge() >= 20).
		             map(c -> c.getName()).
		             sorted().forEach(s -> System.out.println(s));

	}

}
