package chapter21.inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest4 {

	public static void main(String[] args) throws IOException {

		try (FileOutputStream fos=new FileOutputStream("resource.txt",true); //저장
				FileInputStream fis =new FileInputStream("resource.txt")){
			
			//쓰기
			fos.write(72); // A 대응되는 문자로 저장
			fos.write(74); // B 대응되는 문자로 저장
			fos.write(67); // C 대응되는 문자로 저장
			
			//읽기
			System.out.println((char)fis.read()+" ");
			System.out.println((char)fis.read()+" ");
			System.out.println((char)fis.read()+" ");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
