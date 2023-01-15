package chapter12;

public interface Calc {

	double PI = 3.14;
	int ERROR = -9999999;

	int add(int num1, int num2);
	int substaract(int num1, int num2);
	int times(int num1, int num2);
	int adivide(int num1, int num2);

	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
		myMethod();// private
	}

	static int total(int[] arr) {
		int total = 0;

		for (int i : arr) {
			total += 1;
		}
		myStaticMethod();
		return total;
	}

	private void myMethod() {
		System.out.println("private �޼��� �Դϴ�");
	}

	private static void myStaticMethod() {
		System.out.println("private static�޼��� �Դϴ�");

	}
	// �������̽� ���
	/*
	 * -�߻�޼ҵ� body�� ���� �޼ҵ�� ������ �����ǰ� �ʿ� --�ڹ� 8���� ���� ---����Ʈ �޼ҵ� : �⺻ ���๮�� ���� �� �ִ�
	 * �޼ҵ��̸� �����Ǹ� �� �� �ִ� ----����(static) �޼ҵ� : ��ü ������ ������� �������̽�Ÿ��(Ŭ������)���� ����� �� �ִ�.
	 * -----private �޼ҵ� : �������̽��� ������ Ŭ�������� ��밡�� ������ �� �� ���� �� �������̽�(������ Ŭ����)������ ����ϱ�
	 * ����
	 */
}
