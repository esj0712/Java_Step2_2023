package chapter11;

public class SuperLevel extends PlayLevel {

	@Override
	public void run() {
		System.out.println("�ſ� ������ �޸��ϴ�");

	}

	@Override
	public void jump() {
		System.out.println("�ſ� ���� jump �մϴ�.");

	}

	@Override
	public void turn() {
		System.out.println("�ѹ��� ���ϴ�.");

	}

	@Override
	public void showLevelMessage() {
		System.out.println("����� �Դϴ�");

	}
}
