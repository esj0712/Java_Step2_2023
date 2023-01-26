package chapter20;

public class AutoClassTest2 {
	
	public static void main(String[] args) {
		
		AutoClassObj obj = new AutoClassObj();
		//자바 9부터 밖에서 선언 가능
		try (AutoClassObj obj1 = new AutoClassObj()) {
			throw new Exception();// 예외발생
		} catch (Exception e) {
		}

	}

}
