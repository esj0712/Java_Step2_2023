package chapter14.clone;

import java.util.ArrayList;

class MyBook implements Cloneable {

	String title;

	public MyBook(String title) {
		this.title = title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title;
	}

}

public class ObjectArrayClone {

	public static void main(String[] args) {

		ArrayList<MyBook> bookList = new ArrayList<>();

		MyBook book1 = new MyBook("자바");
		MyBook book2 = new MyBook("스프링");
		MyBook book3 = new MyBook("파이썬");

		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);

		ArrayList<MyBook> copyList = (ArrayList) bookList.clone();
		//MyBook copybook = new MyBook("C++");
		copyList.add(new MyBook("오라클")); // 외워*****
		System.out.println(bookList);
		System.out.println(copyList);

		
		book3.setTitle("C++");
		System.out.println(bookList);
		System.out.println(copyList);
	}

}
