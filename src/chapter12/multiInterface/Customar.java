package chapter12.multiInterface;

public class Customar implements Buy, Sell {

	@Override
	public void buy() {
		System.out.println("�����ϱ�");
	}

	@Override
	public void sell() {
		System.out.println("�Ǹ��ϱ�");

	}

	// ���� �̸��� default�޼ҵ�� ������ �� �����Ƿ� �������̵�
	/*
	 * @Override public void order() { 
	 * System.out.println("�� �Ǹ� �ֹ�"); }
	 */
}
