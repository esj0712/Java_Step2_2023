package chapter22;

public class ThreadJoin implements Runnable {

	public static void main(String[] args) {
		System.out.println("����Ŭ���� ����!");

		ThreadJoin t1 = new ThreadJoin();
		Thread JThread = new Thread(t1);
		JThread.start();

		try {
			JThread.join(); // run()�޼���� Main()�޼��尡 Join�� �Ǿ� run()�� ������ ���� �ɶ����� ��ٸ�(��->�Ʒ�)
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("����Ŭ���� ����!");
	}
//=========================================================================================================
	@Override
	public void run() {
		System.out.println("run() �޼ҵ� ����!");
		first();
	}

	private void first() {
		System.out.println("first() �޼ҵ� ����!");
		second();
	}

	private void second() {
		System.out.println("second() �޼ҵ� ����!");
	}
}
