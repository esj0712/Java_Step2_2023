package chapter12.multiInterface;

public class InterMenuMain implements Inter_mMenu3 {

	public static void main(String[] args) {
		InterMenuMain it = new InterMenuMain();

		// �θ� = �ڽ�
		Inter_mMenu1 it1 = it;// ��ĳ����
		Inter_mMenu2 it2 = it;// ��ĳ����
		Inter_mMenu3 it3 = it;// ��ĳ����
		System.out.println("======Inter_Menu1======");
		System.out.println(it1.jajang());
		System.out.println(it1.jjambbong());
		it1.show();

		System.out.println("======Inter_Menu2======");
		System.out.println(it2.tangsuk());

		System.out.println("======Inter_Menu3======");
		System.out.println(it3.boggembab());

	}

	@Override
	public String jajang() {

		return "�ϳ� ������ �ƴ� ¥���";
	}

	@Override
	public String jjambbong() {

		return "�����ϼ���";
	}

	@Override
	public String tangsuk() {

		return "���� ������";
	}

	@Override
	public String boggembab() {

		return "�ع� ������";
	}

}
