package chapter17.vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {

		Object obj;
		// ũ��1�� �迭 ����
		Vector<Object> vec = new Vector<Object>(1);
		obj = 202212227;
		vec.addElement(obj);// ������Ʈ �߰�
		System.out.println("�뷮 #1 : " + vec.capacity());
		// vector �ȿ� ����Ǿ� �ִ� ������Ʈ�� ��
		System.out.println("ũ�� #1 : " + vec.size());
		System.out.println();

		obj = "some people";
		vec.addElement(obj);// ������Ʈ �߰�
		System.out.println("�뷮 #2 : " + vec.capacity());
		// vector �ȿ� ����Ǿ� �ִ� ������Ʈ�� ��
		System.out.println("ũ�� #2 : " + vec.size());
		System.out.println();

		obj = "dream of success";
		vec.addElement(obj);// ������Ʈ �߰�
		System.out.println("�뷮 #3 : " + vec.capacity());
		// vector �ȿ� ����Ǿ� �ִ� ������Ʈ�� ��
		System.out.println("ũ�� #3 : " + vec.size());
		System.out.println();

		obj = "While";
		vec.addElement(obj);// ������Ʈ �߰�
		System.out.println("�뷮 #4 : " + vec.capacity());
		// vector �ȿ� ����Ǿ� �ִ� ������Ʈ�� ��
		System.out.println("ũ�� #4 : " + vec.size());
		System.out.println();

		obj = "get up";
		vec.addElement(obj);// ������Ʈ �߰�
		System.out.println("�뷮 #5 : " + vec.capacity());
		// vector �ȿ� ����Ǿ� �ִ� ������Ʈ�� ��
		System.out.println("ũ�� #5 : " + vec.size());
		System.out.println();

		obj = "get down";
		vec.addElement(obj);// ������Ʈ �߰�
		System.out.println("�뷮 #6 : " + vec.capacity());
		// vector �ȿ� ����Ǿ� �ִ� ������Ʈ�� ��
		System.out.println("ũ�� #6 : " + vec.size());
		System.out.println();

		obj = "down";
		vec.addElement(obj);// ������Ʈ �߰�
		System.out.println("�뷮 #7 : " + vec.capacity());
		// vector �ȿ� ����Ǿ� �ִ� ������Ʈ�� ��
		System.out.println("ũ�� #7 : " + vec.size());
		System.out.println();

		obj = "up";
		vec.addElement(obj);// ������Ʈ �߰�
		System.out.println("�뷮 #8 : " + vec.capacity());
		// vector �ȿ� ����Ǿ� �ִ� ������Ʈ�� ��
		System.out.println("ũ�� #8 : " + vec.size());
		System.out.println();

		obj = "test";
		vec.addElement(obj);// ������Ʈ �߰�
		System.out.println("�뷮 #9 : " + vec.capacity());
		// vector �ȿ� ����Ǿ� �ִ� ������Ʈ�� ��
		System.out.println("ũ�� #9 : " + vec.size());
		System.out.println();

		obj = "in";
		vec.addElement(obj);// ������Ʈ �߰�
		System.out.println("�뷮 #10 : " + vec.capacity());
		// vector �ȿ� ����Ǿ� �ִ� ������Ʈ�� ��
		System.out.println("ũ�� #10 : " + vec.size());
		System.out.println();

		System.out.println(vec);

	}

}
