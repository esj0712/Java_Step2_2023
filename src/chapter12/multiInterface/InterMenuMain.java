package chapter12.multiInterface;

public class InterMenuMain implements Inter_mMenu3 {

	public static void main(String[] args) {
		InterMenuMain it = new InterMenuMain();

		// 부모 = 자식
		Inter_mMenu1 it1 = it;// 업캐스팅
		Inter_mMenu2 it2 = it;// 업캐스팅
		Inter_mMenu3 it3 = it;// 업캐스팅
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

		return "하나 죽으면 아는 짜장면";
	}

	@Override
	public String jjambbong() {

		return "해장하세요";
	}

	@Override
	public String tangsuk() {

		return "찹쌀 탕수육";
	}

	@Override
	public String boggembab() {

		return "해물 볶음밥";
	}

}
