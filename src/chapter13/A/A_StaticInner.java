package chapter13.A;

public class A_StaticInner {

	int a = 10;
	private int b = 100;
	static int c = 200; // Data영역 메모리

	// 생성자

	// 메소드

	// 내부 클래스

	static class Inner {
		// 필드
		static int d = 1000;
		// 생성자
        // 메소드
		public void printData() {
			// a와 b는 static이 아니여서 데이터영역에서 사용할 수 없음
			// System.out.println("int a : " + a);
			// System.out.println("private int b : " + b);
			System.out.println("static c : " + c);

		}
	}

	public static void main(String[] args) {

		// 외부
		//A_memberInner outer = new A_memberInner();
		// 내부
		// outer.new Inner();
		// A_memberInner.Inner inner=outer.new Inner();

		A_memberInner.Inner inner = new A_memberInner().new Inner();

		inner.printData();

	}

}
