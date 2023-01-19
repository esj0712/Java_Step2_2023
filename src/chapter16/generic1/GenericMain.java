package chapter16.generic1;

public class GenericMain {

	public static <T, V> double makeReckangle(Point<T, V> p1, Point<T, V> p2) {

		double left = ((Number) p1.getX()).doubleValue();// ���� T
		double Top = ((Number) p1.getY()).doubleValue();// ���� �� V

		double right = ((Number) p2.getX()).doubleValue();// ������ T
		double bottom = ((Number) p2.getY()).doubleValue();// ������ �Ʒ� V

		double width = right - left;
		double height = bottom - Top;

		return width * height;
	}

	public static void main(String[] args) {

		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0);

		double rect = GenericMain.makeReckangle(p1, p2);
		System.out.println("�� point�� ������� �簢���� ���� : " + rect + "�Դϴ�.");

	}

}
