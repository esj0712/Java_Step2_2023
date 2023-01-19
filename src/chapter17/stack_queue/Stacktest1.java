package chapter17.stack_queue;

import java.util.Stack;

public class Stacktest1 {

	public static void main(String[] args) {

		Object obj;
		
		// empty ���û���
		Stack<Object> st = new Stack<Object>();
		
		// �Է�
		if (st.empty()) { // ������ ���������
			for (int i = 0; i <= 3; i++) {
				st.push(new String("Hi!" + i));
				System.out.println(" �Է�" + i + "��° : " + st.peek());
			} // for
		} // if
		
		// ���
		st.pop(); // ������ ������ 5���
		System.out.println("���� Top�� ��ġ(peek) : " + st.peek());
		st.pop(); // ������ ������ 4���
		System.out.println("���� Top�� ��ġ(peek) : " + st.peek());

		st.push(new String("Happy!!"));
		System.out.println(st.peek());
		st.push(new String("Good!!"));
		System.out.println(st.peek());
	}

}
