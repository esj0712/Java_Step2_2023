package chapter17.arraylist_stack_queue;

import java.util.ArrayList;

public class ArrayEx2 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("홍길동");
		list.add("이순신");
		list.add("강감찬");
		list.add("김유신");
		list.add("장영실");
		
		System.out.println(list);
		
		System.out.println("list[0] : "+list.get(0));
		System.out.println("list[2] : "+list.get(2));

	}

}
