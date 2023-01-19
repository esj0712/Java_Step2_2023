package chapter13.B;

public class LocalInner {

	int a = 100;

	// innerTest �Լ� ����
	public void innerTest(int n) {
		int b = 200; // ���� ����
		final int c = n; // ���
		// ================================================================
		// innerTest()�Լ� ���ο� ����Ŭ���� �ۼ�
		class Inner {
			// Local���� Ŭ������ �ܺ� Ŭ������ ��������� ����鸸 ������ �� �ִ�
			public void getData() {
				System.out.println("int a : " + a);
				// System.out.println("int b : " + b); // ����
				System.out.println("int c : " + c);
			}

		}// Local ���� Ŭ����
		// ================================================================
		// �Լ����ο� �ִ� Ŭ��������ص� �Լ��� ȣ���ϸ� ����� �ڵ����� ������ ���� �ƴ϶�
		// ��ü�� ���� ����ؾ��Ѵ�
		Inner i = new Inner();
		i.getData();

	}// method

	public static void main(String[] args) {
		LocalInner outer = new LocalInner();
		outer.innerTest(500);
	}
}
