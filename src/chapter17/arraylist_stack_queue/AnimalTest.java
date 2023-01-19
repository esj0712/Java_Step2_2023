package chapter17.arraylist_stack_queue;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("����� �ι߷� �����Դϴ�.");
	}

	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �����Դϴ�.");
	}

	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}

	public void flying() {
		System.out.println("�������� ������ ��� ���� �ٴմϴ�.");
	}
}

public class AnimalTest {

	ArrayList<Animal> aniList = new ArrayList<Animal>();

	public static void main(String[] args) {
		AnimalTest aniTest = new AnimalTest();
		// addAnimal => ��ĳ����
		aniTest.addAnimal();
		// testCasting => �ٿ�ĳ����
		aniTest.testCasting();

	}

	public void addAnimal() {

		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());

		for (Animal a : aniList) {
			a.move();
		}

	}

	public void testCasting() {

		for (int i = 0; i < aniList.size(); i++) {
			Animal a = aniList.get(i); // �ϴ� �θ�(Animal) Ÿ������ ������

			if (a instanceof Human) {
				Human h = (Human) a; // �ٿ�ĳ����
				h.readBook();
			} else if (a instanceof Tiger) {
				Tiger t = (Tiger) a; // �ٿ�ĳ����
				t.hunting();
			} else if (a instanceof Eagle) {
				Eagle e = (Eagle) a; // �ٿ�ĳ����
				e.flying();
			}
		}

	}
}
