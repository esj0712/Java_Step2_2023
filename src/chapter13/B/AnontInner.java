package chapter13.B;

public class AnontInner {

	public void test() {

		new TestInter() { // TestInter ti= new TestInter => ti.printData()

			@Override
			public void printData() {
				System.out.println("화욜팅!");
			}// 추상메소드 구현
		}.printData();

	}// 메소드 끝

	public static void main(String[] args) {

		AnontInner in = new AnontInner();
		in.test();

	}

}
