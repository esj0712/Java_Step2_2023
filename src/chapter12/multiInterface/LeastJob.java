package chapter12.multiInterface;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");

	}

	@Override
	public void secdCallToAgent() {
		System.out.println("���� �������� ���ų� ����� �ð��� ���� ���� �������� ���.");

	}
}
