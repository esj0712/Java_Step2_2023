package chapter19;

public class TestAdd {

	public static void main(String[] args) {
		// Lambda : �޼ҵ� �̸��� ���� �����θ� ������
		              // Body
		Add addF = (x, y) -> x + y;
		System.out.println(addF.add(3, 5));

	}

}
