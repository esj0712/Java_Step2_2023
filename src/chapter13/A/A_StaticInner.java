package chapter13.A;

public class A_StaticInner {

	int a = 10;
	private int b = 100;
	static int c = 200; // Data���� �޸�

	// ������

	// �޼ҵ�

	// ���� Ŭ����

	static class Inner {
		// �ʵ�
		static int d = 1000;
		// ������
        // �޼ҵ�
		public void printData() {
			// a�� b�� static�� �ƴϿ��� �����Ϳ������� ����� �� ����
			// System.out.println("int a : " + a);
			// System.out.println("private int b : " + b);
			System.out.println("static c : " + c);

		}
	}

	public static void main(String[] args) {

		// �ܺ�
		//A_memberInner outer = new A_memberInner();
		// ����
		// outer.new Inner();
		// A_memberInner.Inner inner=outer.new Inner();

		A_memberInner.Inner inner = new A_memberInner().new Inner();

		inner.printData();

	}

}
