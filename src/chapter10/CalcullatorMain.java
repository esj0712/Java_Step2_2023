package chapter10;

public class CalcullatorMain {

	public static void main(String[] args) {

		CalPlus cap = new CalPlus();
		CalMinus cam = new CalMinus();

		System.out.println("CalPuls : " + cap.getResult(15, 15));
		System.out.println("CalMinus : " + cam.getResult(30, 15));

	}

}
