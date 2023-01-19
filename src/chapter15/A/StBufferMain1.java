package chapter15.A;

public class StBufferMain1 {

	public static void main(String[] args) {

		StringBuffer buf = new StringBuffer("Nice Day");

		System.out.println(buf.toString());
		System.out.println(buf.length());
		// StringBuffer�� �⺻ �뷮 16 + �߰�(length)�� ���ִ�
		System.out.println(buf.capacity());
		// 24�� �Ѿ�� ������(26 ~ 50)������ �����ִ� �뷮*2+2=50 / 51~ �� �����ִ� �뷮
		buf.ensureCapacity(51);
		System.out.println(buf.capacity());
		buf.insert(0, "Hi! ");
		System.out.println(buf);
		buf.insert(12, " Everybody! ");
		System.out.println(buf);
		buf.delete(0, 4);
		System.out.println(buf);
	}

}
