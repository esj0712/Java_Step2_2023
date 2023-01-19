package chapter17.arraylist_stack_queue;

import java.util.ArrayList;
import java.util.Iterator;

import chapter17.Member;

public class MemberArrayList {

	// ArrayList ����(arrayList)
	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		// heap ����
		arrayList = new ArrayList<Member>();

	}

	// ���� : arrayList�� add�ϴ� �޼ҵ�
	public void addMember(Member member) {
		arrayList.add(member);

	}

	// ���� : arrayList�� remove�ϴ� �޼ҵ�
	public boolean reMoveMember(int memberId) {
		Iterator<Member> it = arrayList.iterator();

		while (it.hasNext()) {
			Member member = it.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				arrayList.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "�� ���������ʽ��ϴ�.");
		return false;
	}

	// ������� �޼ҵ� : arrayList ����ϱ�
	public void showAllMember() {
		for (Member member : arrayList)

		{
			System.out.println(member);
		}
		System.out.println();
	}
}
