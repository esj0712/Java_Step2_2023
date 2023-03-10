package chapter17.linkedlist;

import chapter17.Member;

public class MemberLinkedListMain {

	public static void main(String[] args) {
		// 授辞 O, 掻差 O
		MemberLinkedList memberLinkedList = new MemberLinkedList();

		// 得据級税 舛左
		Member memberJo = new Member(1001, "繕けけ");
		Member memberLee = new Member(1002, "戚けけ");
		Member memberKim = new Member(1003, "沿けけ");
		Member memberJoo = new Member(1004, "爽けけ");
		Member memberSin = new Member(1005, "重けけ");
		Member memberPark = new Member(1006, "酵けけ");

		// 噺据亜脊
		memberLinkedList.addMember(memberJo);
		memberLinkedList.addMember(memberLee);
		memberLinkedList.addMember(memberKim);
		memberLinkedList.addMember(memberJoo);
		memberLinkedList.addMember(memberSin);
		memberLinkedList.addMember(memberPark);

		memberLinkedList.showAllMember();

		Member memberGang = new Member(1003, "悪けけ");
		memberLinkedList.addMember(memberGang);

		memberLinkedList.showAllMember();

	}

}
