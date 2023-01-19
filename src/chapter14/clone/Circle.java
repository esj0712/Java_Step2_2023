package chapter14.clone;

public class Circle implements Cloneable {
	                          // 객체 복사
	Point point;
	int radius;

	public Circle(int x, int y, int radius) {
		// 생성자를 통해서 다름 클래스의 객체 생성
		// (서클을 만들시 포인트[객체]도 같이 생성)
		point = new Point(x, y);
		this.radius = radius;
	}

	// 클래스의 객체 복사
	@Override // 타입
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	@Override   // 값이 나옴
	public String toString() {

		return "원점은 " + point + "이고, 반지름은 " + radius;
	}

}
