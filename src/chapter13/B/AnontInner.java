package chapter13.B;

public class AnontInner {

	public void test() {

		new TestInter() { // TestInter ti= new TestInter => ti.printData()

			@Override
			public void printData() {
				System.out.println("ȭ����!");
			}// �߻�޼ҵ� ����
		}.printData();

	}// �޼ҵ� ��

	public static void main(String[] args) {

		AnontInner in = new AnontInner();
		in.test();

	}

}
