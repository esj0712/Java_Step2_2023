package chapter21.inputstream;

import java.io.IOException;

public class SystemTest2 {

	public static void main(String[] args) {
		System.out.println("알파뱃 여러개를 쓰고 [ENTER]를 누르세요");

		int i;
		try {
			while((i=System.in.read())  != '\n') {
				System.out.println(i);
				System.out.println((char) i);// 문자A				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
