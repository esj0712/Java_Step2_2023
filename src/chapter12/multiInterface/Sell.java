package chapter12.multiInterface;

public interface Sell {

	void sell();

	// ���� �̸��� default�޼ҵ�� ������ �� �����Ƿ� �������̵�
	// ���� �������̵� �޼ҵ尡 �߷µ�
	/*
	default void order() { System.out.println("�Ǹ� �ֹ�"); }
	*/
	default void selleorder() {
		System.out.println("�Ǹ� �ֹ�");
	}
}
