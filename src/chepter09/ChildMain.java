package chepter09;

public class ChildMain {

	public static void main(String[] args) {

		Child child = new Child();

		child.method1();// �θ��
		child.method2();// ����
		child.method3();// ����
		// =======================================
		// ���������� �θ�Ŭ������ ���
		System.out.println();
		Parent parent1 = new Parent();
		parent1.method1();
		parent1.method2();

		System.out.println();
		Parent parent2 = child;
		parent2.method1();
		parent2.method2();

	}

}
