package chapter21.inputstream;

import java.io.IOException;

public class SystemTest2 {

	public static void main(String[] args) {
		System.out.println("���Ĺ� �������� ���� [ENTER]�� ��������");

		int i;
		try {
			while((i=System.in.read())  != '\n') {
				System.out.println(i);
				System.out.println((char) i);// ����A				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
