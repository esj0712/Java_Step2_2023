package chapter13.B;

class Outter {

	// �ܺ� Ŭ���� �������
	int outnum = 100;
	static int snum = 200;

	// Runnable �Ű������� ������� final�� ���ǵȴ�
	Runnable getRunnable(int i) {
		int num = 100; // final

		class MyRunnable implements Runnable {
			int localNum = 10;// ���� Ŭ������ �������

			@Override
			public void run() {
				// num=200; //final
				// i=100; //final
				System.out.println("i=" + i);
				System.out.println("num=" + num);
				System.out.println("localNum=" + localNum);
				System.out.println("outNum=" + outnum + "(�ܺ�)");

				System.out.println("outter.sNum==" + Outter.snum + "(�ܺ�Data����)");
			}
		}
		return new MyRunnable();
	}
}

public class LocalInner2 {

	public static void main(String[] args) {
		Outter out = new Outter();
		Runnable runner = out.getRunnable(10);
		runner.run();

	}

}
