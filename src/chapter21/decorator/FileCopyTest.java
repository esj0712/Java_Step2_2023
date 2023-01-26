package chapter21.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest {

	public static void main(String[] args) {

		long millisecond = 0;

		try (FileInputStream fis = new FileInputStream("aa.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip")) {

			millisecond = System.currentTimeMillis();

			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
			}

			millisecond = System.currentTimeMillis() - millisecond;

		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("파일 복사 하는데 " + millisecond + " millisecond 소요 되었습니다.");

	}

}
