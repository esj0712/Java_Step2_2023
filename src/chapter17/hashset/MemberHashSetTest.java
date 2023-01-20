package chapter17.hashset;

import chapter17.Member2;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// 순서 O, 중복 O
		MemberhashSet memberhashSet = new MemberhashSet();

		// 팀원들의 정보
		Member2 memberJo = new Member2(1001, "조ㅁㅁ");
		Member2 memberLee = new Member2(1002, "이ㅁㅁ");
		Member2 memberKim = new Member2(1003, "김ㅁㅁ");
		Member2 memberJoo = new Member2(1004, "주ㅁㅁ");
		Member2 memberSin = new Member2(1005, "신ㅁㅁ");
		Member2 memberPark = new Member2(1006, "박ㅁㅁ");

		// 회원가입
		memberhashSet.addMember(memberJo);
		memberhashSet.addMember(memberLee);
		memberhashSet.addMember(memberKim);
		memberhashSet.addMember(memberJoo);
		memberhashSet.addMember(memberSin);
		memberhashSet.addMember(memberPark);

		memberhashSet.showAllMember();

		Member2 memberGang = new Member2(1003, "강ㅁㅁ");
		memberhashSet.addMember(memberGang);

		memberhashSet.showAllMember();

	}

}
