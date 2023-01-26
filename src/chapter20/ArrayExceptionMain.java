package chapter20;

public class ArrayExceptionMain {

	public static void main(String[] args) {

		int[] arr = new int[5];
		/*
		 * for(int i=0; i<=5;i++) { 
		 * System.out.println(arr[i]);
		 */

		try {
			for (int i = 0; i <= 5; i++) {
				arr[i] = i + 1;
				System.out.println(arr[i] + "");
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} finally {
			System.out.println("Fianally");
		}

		System.out.println("시스템 종료");

	}

}
