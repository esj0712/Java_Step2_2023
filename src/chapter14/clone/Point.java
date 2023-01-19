package chapter14.clone;

public class Point {

	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override       // 내용이 나온다
	public String toString() {

		return "x = " + x + ", y = " + y;
	}

}
