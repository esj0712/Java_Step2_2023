package chapter20;

public class AutoClassTest1 {

	public static void main(String[] args) {

		
		try (AutoClassObj obj1 = new AutoClassObj()) {
			throw new Exception();// ���ܹ߻�
		} catch (Exception e) {
			System.out.println("���� �κ� �Դϴ�");
		}

	}

}
