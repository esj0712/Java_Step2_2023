package chapter13.B;

class Outter2 {
	// �͸��� Ŭ������ �ν��Ͻ� �̸��� ����
	Runnable getRunnable(int i) {
		// ���1
		int num = 100;
		// new �� ���ÿ� �θ� Ŭ������ run�޼ҵ带 ��ӹ����Ƿ� �߻� �޼ҵ��� run�� �ݵ�� �������̵��ؼ� ����Ѵ�.
		return new Runnable() {

			@Override
			public void run() {
				// num=200;
				// i=10;
				System.out.println(i);
				System.out.println(num);
			}
		}; // return
	}// Runnable

	// ���2 (����)
	Runnable runner = new Runnable() {

		@Override
		public void run() {
			System.out.println("Runneable �� ������ �͸��� Ŭ���� ����");

		}
	};

}

public class AnonyMousInnerMain {

	public static void main(String[] args) {
		Outter2 out = new Outter2();
		Runnable runnable = out.getRunnable(10);
		runnable.run(); // ���1
		out.runner.run(); // ���2

	}

}
