package chapter17.hashset;

import chapter17.Member2;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// 授辞 O, 掻差 O
		MemberhashSet memberhashSet = new MemberhashSet();

		// 得据級税 舛左
		Member2 memberJo = new Member2(1001, "繕けけ");
		Member2 memberLee = new Member2(1002, "戚けけ");
		Member2 memberKim = new Member2(1003, "沿けけ");
		Member2 memberJoo = new Member2(1004, "爽けけ");
		Member2 memberSin = new Member2(1005, "重けけ");
		Member2 memberPark = new Member2(1006, "酵けけ");

		// 噺据亜脊
		memberhashSet.addMember(memberJo);
		memberhashSet.addMember(memberLee);
		memberhashSet.addMember(memberKim);
		memberhashSet.addMember(memberJoo);
		memberhashSet.addMember(memberSin);
		memberhashSet.addMember(memberPark);

		memberhashSet.showAllMember();

		Member2 memberGang = new Member2(1003, "悪けけ");
		memberhashSet.addMember(memberGang);

		memberhashSet.showAllMember();

	}

}
