package chepter09;

public class DmbCellPhoneMain {

	public static void main(String[] args) {

		DmbCellPhone dmbCellPhone = new DmbCellPhone("JAVA폰", "검정", 10);

		// CellPhone으로부터 상속받은 필드
		dmbCellPhone.color = "파랑";
		dmbCellPhone.model = "갤럭시";
		System.out.println("CellPhone Color : " + dmbCellPhone.color + " 색");
		System.out.println("CellPhone Model : " + dmbCellPhone.model);
		System.out.println("=====================================================");

		// DmbCellPhonee의 필드
		dmbCellPhone.channel = 10;
		System.out.println("현재 채널 번호 : " + dmbCellPhone.channel + "번 입니다.");
		System.out.println("=====================================================");

		// CellPhone의 메소드를 사용하여 전화통화 구현
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요?");
		dmbCellPhone.receiveVoice("점심은 뭐먹게?");
		dmbCellPhone.sendVoice("김밥 먹을라구");
		System.out.println("=====================================================");

		// DmbCellPhonee의 메소드를 사용하여 채널 변경
		dmbCellPhone.channel = 10;
		System.out.println("현재 채널 번호 : " + dmbCellPhone.channel + "번");
		dmbCellPhone.changeChannelDmb(20);
		System.out.println("=====================================================");
	}
}
