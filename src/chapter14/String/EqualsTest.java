package chapter14.String;

public class EqualsTest {

	public static void main(String[] args) {

		// String Ŭ������ �̹� toString���� ������ �Ǿ��ִ�.
		String str1 = new String("test");
		String str2 = new String("test");

		Student studentLee = new Student(100, "�̻��");
		Student studentLee2 = studentLee; // String str="java";
		Student studentSang = new Student(200, "�̻��");

		// ������ �ּ��� �� �ν��Ͻ� ��(������ ���� ���� ����)
		System.out.println("==================������ �ּ��� �� �ν��Ͻ� ��=================");

		if (studentLee == studentLee2) {
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�.");
		} else
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");

		if (studentLee.equals(studentLee2)) {
			System.out.println("studentLee�� studentLee2�� �����մϴ�.");
		} else
			System.out.println("studentLee�� studentLee2�� �������� �ʽ��ϴ�.");
		System.out.println();

		System.out.println("===============================================");

		// �� �ν��Ͻ� ��(������ �ּҴ� �ٸ����� ���� ���� ����)
		System.out.println("=======������ �ּ�( == )�� �ٸ����� ���� ���� ����(equals)=======");

		if (studentLee == studentSang) {
			System.out.println("studentLee�� studentSang�� �ּҴ� �����ϴ�.");
		} else
			System.out.println("studentLee�� studentSang�� �ּҴ� �ٸ��ϴ�.");

		if (studentLee.equals(studentSang)) {
			System.out.println("studentLee�� studentSang�� �����մϴ�.");
		} else
			System.out.println("studentLee�� studentSang�� �������� �ʽ��ϴ�.");
		System.out.println();

		System.out.println("===================������ �� ��� ===========================");
		System.out.println("studentLee �� hash code : " + studentLee.hashCode());
		System.out.println("studentSang �� hash code : " + studentSang.hashCode());
		System.out.println();

		System.out.println("======== ������ ���� ������ hash���� �ٸ��Ƿ� �����ǰ� �ʿ� ========");
		System.out.println("studentLee �� ���� �ּ� �� : " + System.identityHashCode(studentLee));
		System.out.println("studentSang �� ���� �ּ� �� : " + System.identityHashCode(studentSang));
		System.out.println();

		// HashCode�� ������ �Ǿ� ����
		System.out.println("=================String Ŭ������ ���� �� ���=================");
		System.out.println("str1�� hash code : " + str1.hashCode());
		System.out.println("str2�� hash code : " + str2.hashCode());
	}

}
