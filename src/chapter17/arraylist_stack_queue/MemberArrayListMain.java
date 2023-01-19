package chapter17.arraylist_stack_queue;

import chapter17.Member;

public class MemberArrayListMain {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		// 팀원들의 정보
		Member memberArrJo = new Member(1001, "조ㅁㅁ");
		Member memberArrLee = new Member(1002, "이ㅁㅁ");
		Member memberArrKim = new Member(1003, "김ㅁㅁ");
		Member memberArrJoo = new Member(1004, "주ㅁㅁ");
		Member memberArrSin = new Member(1005, "신ㅁㅁ");
		Member memberArrPark = new Member(1006, "박ㅁㅁ");
		// 회원가입
		memberArrayList.addMember(memberArrJo);
		memberArrayList.addMember(memberArrLee);
		memberArrayList.addMember(memberArrKim);
		memberArrayList.addMember(memberArrJoo);
		memberArrayList.addMember(memberArrSin);
		memberArrayList.addMember(memberArrPark);

		memberArrayList.showAllMember();

		memberArrayList.reMoveMember(memberArrJoo.getMemberId());

		memberArrayList.showAllMember();
	}

}
