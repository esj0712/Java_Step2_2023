package chapter19;

public class TestStringConcat {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";

		// �ν��Ͻ� ����
		System.out.println("============�ν��Ͻ� ����============");
		StringConcatImple concat = new StringConcatImple();
		concat.makeString(s1, s2);

		// ���ٽ� ���
		System.out.println("============���ٽ� ���============");
		StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
		concat2.makeString("Hello", "World");

		// �͸��� ���� Ŭ���� ���
		System.out.println("============�͸��� ���� Ŭ���� ���============");
		StringConcat concat3 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "," + s2);

			}
		};

		concat3.makeString(s1, s2);

	}

}