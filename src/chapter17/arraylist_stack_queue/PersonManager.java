package chapter17.arraylist_stack_queue;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {

	public void personMgr() {

		int select;
		Person p = null;

		ArrayList<Person> personArr = new ArrayList<Person>();

		while (true) {

			System.out.println("1. ȸ���߰�");
			System.out.println("2. ȸ��Ż��");
			System.out.println("3. ȸ������");
			System.out.println("4. ��   ��");
			System.out.print("�׸��� : ");

			Scanner scan = new Scanner(System.in);
			select = scan.nextInt();

			// if || switch

			if (select == 1) {
				p = new Person();

				System.out.println("====���� �Է�====");
				System.out.print("�̸� : ");
				p.setName(scan.next());
				System.out.print("��ȭ��ȣ : ");
				p.setTel(scan.next());
				System.out.print("���� : ");
				p.setAge(scan.nextInt());
//=======================================================================				
				personArr.add(p);
				System.out.println("������ ����Ǿ����ϴ�.");
                
				continue;
			} else if (select == 2) {
				System.out.print("ȸ�� �� : ");
				p.setName(scan.next());
				for (int i = 0; i < personArr.size(); i++) {
					if (p.getName().equals(personArr.get(i).getName())) {
						personArr.remove(i);
						System.out.println("�����Ǿ����ϴ�");
						

					} else
						System.out.println("ȸ���� �������� �ʽ��ϴ�.");
					
				}

			} else if (select == 3) {
				for (int i = 0; i < personArr.size(); i++) {

					System.out.println("ȸ����ȣ : " + (i + 1));
					System.out.println("�̸� : " + personArr.get(i).getName());
					System.out.println("���� : " + personArr.get(i).getAge());
					System.out.println("��ȭ : " + personArr.get(i).getTel());
					System.out.println("=====================================");
					
				}
				continue;

			} else if (select == 4)
				System.out.println("���� �մϴ�.");
			break;

		}

	}

}
