package chapter21.inputstream;

import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) throws IOException {
		// �� ����� �ѱ� ����
		// FileInputStream fis=null;
		FileReader fis = null;

		try {
			// fis = new FileInputStream("input.txt");
			fis = new FileReader("input.txt");
			int i;
			// fis.read() : ������ ������ ������ -1�� ��ȯ
			while ((i = fis.read()) != -1) {
				System.out.print((char) i + " ");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
				// NullPointerException�� ���� ���ؼ� ����
				// catch
			} catch (NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println();
		System.out.println("end");
	}
}
