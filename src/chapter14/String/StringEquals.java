package chapter14.String;

public class StringEquals {

	public static void main(String[] args) {

		String str1 = new String("test");
		String str2 = new String("test");
		           // new ���� => heap ======��
		System.out.println(str1 == str2); // heap�޸𸮰� ������ ��ȯ����
		System.out.println(str1.equals(str2));

		String str = "abc";
		String str3 = "abc";

		System.out.println(str == str3);

		// Boxing : �⺻ Ÿ�԰��� �����ؼ� ��ü�� ����
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);

		System.out.println(i1 == i2); // heap�޸�
		System.out.println(i1.equals(i2)); // ���Ϸ��� ���� equals ��� *****

	}

}
