package chepter09;

public class Paprika extends Vegetable {

	private String color;
	private int price;
	private String name;

	public void set2(String a, int b, String c) {

		color = a;
		price = b;
		name = c;
	}

	public void Disp1() {
		System.out.println("-------paprika-------");
		System.out.println("�з� : " + sort);
		System.out.println("���� : " + season);
		// ��������� �θ�� ���� ��ӹ��� �Ͱ� ��ġ�ϴ� ���� ���� ���
		System.out.println("�̸� : " + super.name);// (super.)�θ�Ŭ������ �⺻ ������

		System.out.println();
	}

	public void Disp2() {
		System.out.println("-------paprika-------");
		System.out.println("���� : " + color);
		System.out.println("���� : " + price);
		System.out.println("�̸� : " + super.name);// (super.)�θ�Ŭ������ �⺻ ������

		System.out.println();
	}
}
