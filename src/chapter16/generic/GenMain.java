package chapter16.generic;

public class GenMain {

	public static void main(String[] args) {

		Gen gen = new Gen();

		// ������
		Integer[] iarr = { 1, 2, 3, 4, 5 };

		// ������
		Double[] darr = { 1.1, 2.2, 3.3, 4.4, 5.5 };

		// ������
		Character[] carr = { 'a', 'b', 'c', 'd', 'e' };

		gen.printarr(iarr);
		gen.printarr(darr);
		gen.printarr(carr);
	}

}
