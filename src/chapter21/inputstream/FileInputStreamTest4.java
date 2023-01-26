package chapter21.inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest4 {

	public static void main(String[] args) throws IOException {

		try (FileOutputStream fos=new FileOutputStream("resource.txt",true); //����
				FileInputStream fis =new FileInputStream("resource.txt")){
			
			//����
			fos.write(72); // A �����Ǵ� ���ڷ� ����
			fos.write(74); // B �����Ǵ� ���ڷ� ����
			fos.write(67); // C �����Ǵ� ���ڷ� ����
			
			//�б�
			System.out.println((char)fis.read()+" ");
			System.out.println((char)fis.read()+" ");
			System.out.println((char)fis.read()+" ");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
