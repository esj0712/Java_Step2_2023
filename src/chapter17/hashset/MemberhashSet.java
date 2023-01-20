package chapter17.hashset;

import java.util.HashSet;
import java.util.Iterator;

import chapter17.Member2;

public class MemberhashSet {

	private HashSet<Member2> hashset;

	// �����ڸ� ���� LinkedList��ü ����
	public MemberhashSet() {
		hashset = new HashSet<Member2>();
	}

	// addMember
	public void addMember(Member2 member2) {
		hashset.add(member2);
	}

	// removeMember
	public boolean removeMember(int memberId) {
		Iterator<Member2> ir = hashset.iterator();

		while (ir.hasNext()) {
			Member2 member2 = ir.next();
			int tempId = member2.getMemberId();
			if (tempId == memberId) {
				hashset.remove(member2);
				return true;

			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}

	// showAllMember
	public void showAllMember() {
		for (Member2 member2 : hashset) {
			System.out.println(member2);
		}
		System.out.println();
	}

}
