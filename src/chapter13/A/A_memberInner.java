package chapter13.A;

public class A_memberInner {

	int a = 10;
	private int b = 100;
	static int c = 200;

	// ������

	// �޼ҵ�

	// ���� Ŭ����

	class Inner {
		// �ʵ�
		// ������
		// �޼ҵ�
		public void printData() {
			System.out.println("int a : " + a);
			System.out.println("private int b : " + b);
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
