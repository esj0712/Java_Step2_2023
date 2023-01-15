package chapter10;

import java.util.Scanner;

public class CalcullatorMain2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CarlculatorExam[] cal = { new CalPlus(), new CalMinus() };

		// ���1
		System.out.println("���� A�� �Է��ϼ��� : ");
		int a = s.nextInt();
		System.out.println("���� B�� �Է��ϼ��� : ");
		int b = s.nextInt();

		// ���2
		int plus = calc(new CalPlus(), a, b);
		System.out.println("�� ���� �� : " + plus);
		int Minus = calc(new CalMinus(), a, b);
		System.out.println("�� ���� �� : " + Minus);

		for (CarlculatorExam ce : cal) {
			System.out.println(ce.getClass().getSimpleName() + " : " + ce.getResult(a, b));
		}
	}

	public static int calc(CarlculatorExam c1, int a, int b) {
		return c1.getResult(a, b);

	}

}
