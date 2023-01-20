package chapter17.vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {

		Object obj;
		// 크기1의 배열 선언
		Vector<Object> vec = new Vector<Object>(1);
		obj = 202212227;
		vec.addElement(obj);// 엘리먼트 추가
		System.out.println("용량 #1 : " + vec.capacity());
		// vector 안에 저장되어 있는 엘리먼트의 수
		System.out.println("크기 #1 : " + vec.size());
		System.out.println();

		obj = "some people";
		vec.addElement(obj);// 엘리먼트 추가
		System.out.println("용량 #2 : " + vec.capacity());
		// vector 안에 저장되어 있는 엘리먼트의 수
		System.out.println("크기 #2 : " + vec.size());
		System.out.println();

		obj = "dream of success";
		vec.addElement(obj);// 엘리먼트 추가
		System.out.println("용량 #3 : " + vec.capacity());
		// vector 안에 저장되어 있는 엘리먼트의 수
		System.out.println("크기 #3 : " + vec.size());
		System.out.println();

		obj = "While";
		vec.addElement(obj);// 엘리먼트 추가
		System.out.println("용량 #4 : " + vec.capacity());
		// vector 안에 저장되어 있는 엘리먼트의 수
		System.out.println("크기 #4 : " + vec.size());
		System.out.println();

		obj = "get up";
		vec.addElement(obj);// 엘리먼트 추가
		System.out.println("용량 #5 : " + vec.capacity());
		// vector 안에 저장되어 있는 엘리먼트의 수
		System.out.println("크기 #5 : " + vec.size());
		System.out.println();

		obj = "get down";
		vec.addElement(obj);// 엘리먼트 추가
		System.out.println("용량 #6 : " + vec.capacity());
		// vector 안에 저장되어 있는 엘리먼트의 수
		System.out.println("크기 #6 : " + vec.size());
		System.out.println();

		obj = "down";
		vec.addElement(obj);// 엘리먼트 추가
		System.out.println("용량 #7 : " + vec.capacity());
		// vector 안에 저장되어 있는 엘리먼트의 수
		System.out.println("크기 #7 : " + vec.size());
		System.out.println();

		obj = "up";
		vec.addElement(obj);// 엘리먼트 추가
		System.out.println("용량 #8 : " + vec.capacity());
		// vector 안에 저장되어 있는 엘리먼트의 수
		System.out.println("크기 #8 : " + vec.size());
		System.out.println();

		obj = "test";
		vec.addElement(obj);// 엘리먼트 추가
		System.out.println("용량 #9 : " + vec.capacity());
		// vector 안에 저장되어 있는 엘리먼트의 수
		System.out.println("크기 #9 : " + vec.size());
		System.out.println();

		obj = "in";
		vec.addElement(obj);// 엘리먼트 추가
		System.out.println("용량 #10 : " + vec.capacity());
		// vector 안에 저장되어 있는 엘리먼트의 수
		System.out.println("크기 #10 : " + vec.size());
		System.out.println();

		System.out.println(vec);

	}

}
