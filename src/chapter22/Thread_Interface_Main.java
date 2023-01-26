package chapter22;

public class Thread_Interface_Main implements Runnable {

	public static void main(String[] args) {
		System.out.println("���� Ŭ���� ����!");
		Thread_Interface_Main t1 = new Thread_Interface_Main();
		// t1.run();
		Thread mThread = new Thread(t1); // �Ϲ� Ŭ������ ��ü�� ������� ��ȯ
		mThread.start();
		System.out.println("���� Ŭ���� ����!");

	}

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

/* 
 [�Ϲ����� �޼��� ȣ��]
 * ���� Ŭ���� ����! 
 * run() �޼ҵ� ����! 
 * first() �޼ҵ� ����! 
 * second() �޼ҵ� ����! 
 * ���� Ŭ���� ����!
 * 
 [������ȭ �� �޼��� ȣ��]
 * ���� Ŭ���� ����!
 *���� Ŭ���� ����!
 *run() �޼ҵ� ����!
 *first() �޼ҵ� ����!
 *second() �޼ҵ� ����!
 */
