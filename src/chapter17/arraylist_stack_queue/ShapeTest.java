package chapter17.arraylist_stack_queue;

import java.util.ArrayList;

class Shape {

	void draw() {
		System.out.println("draw Shape");
	}
}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("draw Circle");
	}

	void circle() {
		System.out.println("����� �Դϴ�.");
	}
}

class Reactangle extends Shape {

	@Override
	void draw() {
		System.out.println("draw Reactangle");
	}

	void reactangle() {
		System.out.println("�簢�� �Դϴ�.");
	}
}

class Triangle extends Shape {

	@Override
	void draw() {
		System.out.println("draw Triangle");
	}

	void triangle() {
		System.out.println("�ﰢ�� �Դϴ�.");
	}
}

public class ShapeTest {

	// shape �� shape�� ��ӹ��� ��� Ŭ���� Ÿ���� ����ϴ� ArrayList
	ArrayList<Shape> sList = new ArrayList<Shape>();

	public static void main(String[] args) {
		ShapeTest sTest = new ShapeTest();
		System.out.println("===============��ĳ����===============");
		sTest.addShape(); // Shape SC=new Circle
		System.out.println("==============�ٿ�ĳ����===============");
		sTest.testCasting();

	}

	public void addShape() {

		sList.add(new Circle());
		sList.add(new Triangle());
		sList.add(new Reactangle());

		for (Shape s : sList) {
			s.draw();
		}

	}

	public void testCasting() {

		for (int i = 0; i < sList.size(); i++) {
			Shape s = sList.get(1); // �ϴ� �θ�(Shape) Ÿ������ ������

			if (s instanceof Circle) {
				Circle c = (Circle) s; // �ٿ�ĳ����
				c.circle();
			} else if (s instanceof Reactangle) {
				Reactangle r = (Reactangle) s; // �ٿ�ĳ����
				r.reactangle();
			} else if (s instanceof Triangle) {
				Triangle t = (Triangle) s; // �ٿ�ĳ����
				t.triangle();
			} else {
				System.out.println("�������� ���� Ÿ���Դϴ�.");
			}
		}

	}

}
