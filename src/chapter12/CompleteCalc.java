package chapter12;

//��ӹ޾Ƽ� + - �� ����
public abstract class CompleteCalc implements Calc {

	@Override
	public int substaract(int num1, int num2) {

		return (num1 - num2);
	}

	@Override
	public int add(int num1, int num2) {

		return (num1 + num2);
	}

}
