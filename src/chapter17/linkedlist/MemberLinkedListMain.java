package chapter17.linkedlist;

import chapter17.Member;

public class MemberLinkedListMain {

	public static void main(String[] args) {
		// ���� O, �ߺ� O
		MemberLinkedList memberLinkedList = new MemberLinkedList();

		// �������� ����
		Member memberJo = new Member(1001, "������");
		Member memberLee = new Member(1002, "�̤���");
		Member memberKim = new Member(1003, "�褱��");
		Member memberJoo = new Member(1004, "�֤���");
		Member memberSin = new Member(1005, "�Ť���");
		Member memberPark = new Member(1006, "�ڤ���");

		// ȸ������
		memberLinkedList.addMember(memberJo);
		memberLinkedList.addMember(memberLee);
		memberLinkedList.addMember(memberKim);
		memberLinkedList.addMember(memberJoo);
		memberLinkedList.addMember(memberSin);
		memberLinkedList.addMember(memberPark);

		memberLinkedList.showAllMember();

		Member memberGang = new Member(1003, "������");
		memberLinkedList.addMember(memberGang);

		memberLinkedList.showAllMember();

	}

}
