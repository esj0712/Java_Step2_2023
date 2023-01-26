package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExcaption2 {

	public Class loadClass(String fileName, String className) 
			throws FileNotFoundException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);

		return c;

	}

	public static void main(String[] args) {

		ThrowsExcaption2 test = new ThrowsExcaption2();

		try {
			test.loadClass("c.txt", "java.lang.String");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
