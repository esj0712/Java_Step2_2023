package chapter16.generic;

public class Gen<T> {

	public <T> void printarr(T[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
	}

}
