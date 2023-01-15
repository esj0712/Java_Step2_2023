package chapter10;

import java.util.Scanner;

public class CalcullatorMain2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CarlculatorExam[] cal = { new CalPlus(), new CalMinus() };

		// 방법1
		System.out.println("정수 A를 입력하세요 : ");
		int a = s.nextInt();
		System.out.println("정수 B를 입력하세요 : ");
		int b = s.nextInt();

		// 방법2
		int plus = calc(new CalPlus(), a, b);
		System.out.println("두 수의 합 : " + plus);
		int Minus = calc(new CalMinus(), a, b);
		System.out.println("두 수의 차 : " + Minus);

		for (CarlculatorExam ce : cal) {
			System.out.println(ce.getClass().getSimpleName() + " : " + ce.getResult(a, b));
		}
	}

	public static int calc(CarlculatorExam c1, int a, int b) {
		return c1.getResult(a, b);

	}

}
