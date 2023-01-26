package chapter20;

public class IDFormatTest {

	private String userID;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatExcaption {

		if (userID == null) {
			throw new IDFormatExcaption("아이디는 null일수 없습니다");
		} else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatExcaption("아이디는 8글자 이상 20자 이하로 쓰세요");
		}

		this.userID = userID;
	}

	public static void main(String[] args) {

		IDFormatTest test = new IDFormatTest();

		String userID = "1234567";

		try {
			test.setUserID(userID);
		} catch (IDFormatExcaption e) { // 개발자가 만든 Exception
			//System.out.println(e);// 코드와 메세지
			System.out.println(e.getMessage()); // 메세지만 출력
		}
	}

}
