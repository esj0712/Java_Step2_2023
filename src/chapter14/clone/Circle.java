package chapter14.clone;

public class Circle implements Cloneable {
	                          // ��ü ����
	Point point;
	int radius;

	public Circle(int x, int y, int radius) {
		// �����ڸ� ���ؼ� �ٸ� Ŭ������ ��ü ����
		// (��Ŭ�� ����� ����Ʈ[��ü]�� ���� ����)
		point = new Point(x, y);
		this.radius = radius;
	}

	// Ŭ������ ��ü ����
	@Override // Ÿ��
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	@Override   // ���� ����
	public String toString() {

		return "������ " + point + "�̰�, �������� " + radius;
	}

}
