package chapter13.B;

class Outter {

	// 외부 클래스 멤버변수
	int outnum = 100;
	static int snum = 200;

	// Runnable 매개변수와 멤버변수 final로 정의된다
	Runnable getRunnable(int i) {
		int num = 100; // final

		class MyRunnable implements Runnable {
			int localNum = 10;// 내부 클래스의 멤버변수

			@Override
			public void run() {
				// num=200; //final
				// i=100; //final
				System.out.println("i=" + i);
				System.out.println("num=" + num);
				System.out.println("localNum=" + localNum);
				System.out.println("outNum=" + outnum + "(외부)");

				System.out.println("outter.sNum==" + Outter.snum + "(외부Data영역)");
			}
		}
		return new MyRunnable();
	}
}

public class LocalInner2 {

	public static void main(String[] args) {
		Outter out = new Outter();
		Runnable runner = out.getRunnable(10);
		runner.run();

	}

}
