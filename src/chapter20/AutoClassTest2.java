package chapter20;

public class AutoClassTest2 {
	
	public static void main(String[] args) {
		
		AutoClassObj obj = new AutoClassObj();
		//�ڹ� 9���� �ۿ��� ���� ����
		try (AutoClassObj obj1 = new AutoClassObj()) {
			throw new Exception();// ���ܹ߻�
		} catch (Exception e) {
		}

	}

}
