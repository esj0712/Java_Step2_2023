package chapter17.linkedlist;

import chapter17.Member;

public class MemberLinkedListMain {

	public static void main(String[] args) {
		// 순서 O, 중복 O
		MemberLinkedList memberLinkedList = new MemberLinkedList();

		// 팀원들의 정보
		Member memberJo = new Member(1001, "조ㅁㅁ");
		Member memberLee = new Member(1002, "이ㅁㅁ");
		Member memberKim = new Member(1003, "김ㅁㅁ");
		Member memberJoo = new Member(1004, "주ㅁㅁ");
		Member memberSin = new Member(1005, "신ㅁㅁ");
		Member memberPark = new Member(1006, "박ㅁㅁ");

		// 회원가입
		memberLinkedList.addMember(memberJo);
		memberLinkedList.addMember(memberLee);
		memberLinkedList.addMember(memberKim);
		memberLinkedList.addMember(memberJoo);
		memberLinkedList.addMember(memberSin);
		memberLinkedList.addMember(memberPark);

		memberLinkedList.showAllMember();

		Member memberGang = new Member(1003, "강ㅁㅁ");
		memberLinkedList.addMember(memberGang);

		memberLinkedList.showAllMember();

	}

}
