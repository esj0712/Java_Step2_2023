package chapter20;

public class AutoClassTest1 {

	public static void main(String[] args) {

		
		try (AutoClassObj obj1 = new AutoClassObj()) {
			throw new Exception();// 예외발생
		} catch (Exception e) {
			System.out.println("예외 부분 입니다");
		}

	}

}
