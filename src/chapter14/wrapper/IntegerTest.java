package chapter14.wrapper;

//Wrapper
public class IntegerTest {

	public static void main(String[] args) {

		// Integer i = new Integer(100); // int i = 100

		Integer num = 100; // �Ϲ��ڷ� => Ŭ������ ���� [����ڽ�]

		int iNum = num.intValue(); // Ŭ���� => �Ϲ��ڷ� [��ڽ�]

		int jNum = 200;

		int sum = iNum + jNum;
		System.out.println(sum);

		// ��ڽ�(Integer => int)
		int total = num + jNum; // num.intValue+jNum
		System.out.println(total);

		// ����ڽ�(int => Integer)
		Integer i = jNum;
		System.out.println(i); // Integer.valueOf(jNum)���� ��ȯ�ϴ°Ͱ� ����
	}

}
