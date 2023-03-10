package chapter17.arraylist_stack_queue;

import chapter17.Member;

public class MemberArrayListMain {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		// 得据級税 舛左
		Member memberArrJo = new Member(1001, "繕けけ");
		Member memberArrLee = new Member(1002, "戚けけ");
		Member memberArrKim = new Member(1003, "沿けけ");
		Member memberArrJoo = new Member(1004, "爽けけ");
		Member memberArrSin = new Member(1005, "重けけ");
		Member memberArrPark = new Member(1006, "酵けけ");
		// 噺据亜脊
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
