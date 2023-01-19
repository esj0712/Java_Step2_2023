package chapter16.generic;

public class GenMain {

	public static void main(String[] args) {

		Gen gen = new Gen();

		// 정수형
		Integer[] iarr = { 1, 2, 3, 4, 5 };

		// 더블형
		Double[] darr = { 1.1, 2.2, 3.3, 4.4, 5.5 };

		// 문자형
		Character[] carr = { 'a', 'b', 'c', 'd', 'e' };

		gen.printarr(iarr);
		gen.printarr(darr);
		gen.printarr(carr);
	}

}
