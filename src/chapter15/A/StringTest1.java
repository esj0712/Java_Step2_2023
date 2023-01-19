package chapter15.A;

public class StringTest1 {

	public static void main(String[] args) {

		String javaStr = new String("java "); // heap
		String androidStr = new String("android "); // heap
		System.out.println(javaStr); // toString
		System.out.println(javaStr.hashCode()); // 10����
		System.out.println(System.identityHashCode(javaStr)); // 16����
		               // �ٿ��� ����ϰ������
		javaStr=javaStr.concat(androidStr);
        System.out.println();
		System.out.println(javaStr);
		System.out.println(System.identityHashCode(javaStr)); // 16����
	}

}
