package chapter17.hashset;

import chapter17.Member2;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// ���� O, �ߺ� O
		MemberhashSet memberhashSet = new MemberhashSet();

		// �������� ����
		Member2 memberJo = new Member2(1001, "������");
		Member2 memberLee = new Member2(1002, "�̤���");
		Member2 memberKim = new Member2(1003, "�褱��");
		Member2 memberJoo = new Member2(1004, "�֤���");
		Member2 memberSin = new Member2(1005, "�Ť���");
		Member2 memberPark = new Member2(1006, "�ڤ���");

		// ȸ������
		memberhashSet.addMember(memberJo);
		memberhashSet.addMember(memberLee);
		memberhashSet.addMember(memberKim);
		memberhashSet.addMember(memberJoo);
		memberhashSet.addMember(memberSin);
		memberhashSet.addMember(memberPark);

		memberhashSet.showAllMember();

		Member2 memberGang = new Member2(1003, "������");
		memberhashSet.addMember(memberGang);

		memberhashSet.showAllMember();

	}

}
