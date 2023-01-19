package chapter15.B;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class NewPersonMain {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Person person1 = new Person();
		System.out.println(person1);

		Class pClass = Class.forName("chapter15.B.Person");
		System.out.println(pClass);
		Person person2 = (Person) pClass.newInstance();
		System.out.println(person2);

		// =================================================
		// String Ŭ������ ���� ��������

		Class strClass = Class.forName("java.lang.String");
		System.out.println(strClass);
		// String Ŭ������ �����ڵ� ����
		Constructor[] cons = strClass.getConstructors();
		for (Constructor c : cons) {
			System.out.println(c);
		}

		System.out.println("==============================");

		Field[] field = strClass.getFields();
		for (Field f : field) {
			System.out.println(f);
		}
		Method[] method = strClass.getMethods();
		for (Method m : method) {
			System.out.println(m);
		}

	}

}
