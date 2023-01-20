package chapter17.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();

		long startTime;
		long endTime;

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		} // for

		endTime = System.nanoTime();
		System.out.println("Arraylist �ɸ��ð� : " + (endTime - startTime) + "ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		} // for

		endTime = System.nanoTime();
		System.out.println("Linkedlist �ɸ��ð� : " + (endTime - startTime) + "ns");

	}// main

}// class
