package chapter17.arraylist_stack_queue;

import chapter17.Member;

public class MemberArrayListMain {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		// �������� ����
		Member memberArrJo = new Member(1001, "������");
		Member memberArrLee = new Member(1002, "�̤���");
		Member memberArrKim = new Member(1003, "�褱��");
		Member memberArrJoo = new Member(1004, "�֤���");
		Member memberArrSin = new Member(1005, "�Ť���");
		Member memberArrPark = new Member(1006, "�ڤ���");
		// ȸ������
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
