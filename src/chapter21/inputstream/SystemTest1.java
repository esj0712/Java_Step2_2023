package chapter21.inputstream;

import java.io.IOException;

public class SystemTest1 {

	public static void main(String[] args) {
		System.out.println("���Ĺ� �ϳ��� ���� [ENTER]�� ��������");

		int i;
		try {
			i = System.in.read();
			System.out.println(i);// �ƽ�Ű �ڵ�
			System.out.println((char) i);// ����
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
