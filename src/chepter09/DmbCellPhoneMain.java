package chepter09;

public class DmbCellPhoneMain {

	public static void main(String[] args) {

		DmbCellPhone dmbCellPhone = new DmbCellPhone("JAVA��", "����", 10);

		// CellPhone���κ��� ��ӹ��� �ʵ�
		dmbCellPhone.color = "�Ķ�";
		dmbCellPhone.model = "������";
		System.out.println("CellPhone Color : " + dmbCellPhone.color + " ��");
		System.out.println("CellPhone Model : " + dmbCellPhone.model);
		System.out.println("=====================================================");

		// DmbCellPhonee�� �ʵ�
		dmbCellPhone.channel = 10;
		System.out.println("���� ä�� ��ȣ : " + dmbCellPhone.channel + "�� �Դϴ�.");
		System.out.println("=====================================================");

		// CellPhone�� �޼ҵ带 ����Ͽ� ��ȭ��ȭ ����
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������?");
		dmbCellPhone.receiveVoice("������ ���԰�?");
		dmbCellPhone.sendVoice("��� ������");
		System.out.println("=====================================================");

		// DmbCellPhonee�� �޼ҵ带 ����Ͽ� ä�� ����
		dmbCellPhone.channel = 10;
		System.out.println("���� ä�� ��ȣ : " + dmbCellPhone.channel + "��");
		dmbCellPhone.changeChannelDmb(20);
		System.out.println("=====================================================");
	}
}
