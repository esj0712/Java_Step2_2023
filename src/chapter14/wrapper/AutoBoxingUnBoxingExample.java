package chapter14.wrapper;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {

		// AutoBoxing
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());

		// obj�� ��ڽ����� �ڵ� ��ȯ
		int value = obj;
		System.out.println("value : " + value);

		// ����� �ڵ� unboxing
		int result = obj + 100;
		System.out.println("value : " + result);

	}

}
