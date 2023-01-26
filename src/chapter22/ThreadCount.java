package chapter22;

import java.util.Scanner;

public class ThreadCount implements Runnable {

	private int n;

	public ThreadCount(int n) {
		this.n = n;
	}

	public static void main(String[] args) {
		/*
		 * ��ĳ�ʸ� �̿��Ͽ� Ű���忡�� ���ڸ� �Է¹ް� 
		 * �Է� ���� ���ڰ� 1�� �����ϴٰ� 0�� �Ǿ��� �� 
		 * "����"��� �޼����� �Բ� �����带 ������������ �����Ͻÿ�
		 */

		System.out.print("���� �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		ThreadCount tc = new ThreadCount(num);
		// ������ ��ü �� ����

		tc.run();

	}

	@Override
	public void run() {
		for (int j = n; j >= 0; j--) {
			try {
				System.out.println(j);
				Thread.sleep(200);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("����");
	}

}
