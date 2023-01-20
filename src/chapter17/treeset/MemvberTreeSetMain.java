package chapter17.treeset;

public class MemvberTreeSetMain {

	public static void main(String[] args) {

		MemvberTreeSet memberTreeSet = new MemvberTreeSet();

		Member3 memberwPark = new Member3(1001, "¹Ú¤±¤±");
		Member3 memberwLee = new Member3(1002, "ÀÌ¤±¤±");
		Member3 memberwKim = new Member3(1003, "±è¤±¤±");

		memberTreeSet.addMember(memberwPark);
		memberTreeSet.addMember(memberwLee);
		memberTreeSet.addMember(memberwKim);

		memberTreeSet.showAllMember();

	}

}
