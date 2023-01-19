package chapter14.String;

import java.util.Date;

class Book {
	String title;
	String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + ", " + author;
	}
}

public class ToStringEx01 {

	public static void main(String[] args) {

		Book book = new Book("java", "rara");
		// ��ü�� heap�޸𸮸� ��� => heap�޸𸮴� 16���� �ּҰ��� ��������
		System.out.println(book);
		// System.out.println(book.toString()); // toString �޼ҵ带 ���� ȣ�� (��ȣX)

		String str = new String("test");
		System.out.println(str);

	}

}
