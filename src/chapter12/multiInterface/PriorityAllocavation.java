package chapter12.multiInterface;

public class PriorityAllocavation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("�� ����� ���� ������� ��⿭���� �����ɴϴ�.");
		
	}
	@Override
	public void secdCallToAgent() {
		System.out.println("���� Skill ���� ���� ���� �������� �켱������ ��� �մϴ�.");
		
	}
}
