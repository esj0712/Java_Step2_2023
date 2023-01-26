package chapter22;

public class Account {

	int balance = 1000; // ���� �ܾ�

	// ��� �޼ҵ�
	public synchronized void withdraw(int money) {
		// �� �̰� �ϰ�~

		if (balance < money) {

			try {
				wait(); // �����尡 �Ͻ������� �������¿� ����
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		balance -= money;

	}// withdraw

	// �Ա� �޼ҵ�
	public synchronized void deposit(int money) {
		balance += money;
		notify(); // ������ ������ ����

	}

}

/*
 * ��Ƽ������ ȯ�濡�� ����ؾ��� �����尣�� ����ȭ ���� ��� �����尣�� �����ϴ� Data�� ������ �� �����ϰ� �����ϴ� �������� ����ȭ�� ���� ���Ѿ� �Ѵ�
 * �ڹٿ����� synchronized Ű����� ����ȭ�� �����ش�
 */
