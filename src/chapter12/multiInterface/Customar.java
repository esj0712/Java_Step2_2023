package chapter12.multiInterface;

public class Customar implements Buy, Sell {

	@Override
	public void buy() {
		System.out.println("구매하기");
	}

	@Override
	public void sell() {
		System.out.println("판매하기");

	}

	// 같은 이름의 default메소드는 존재할 수 없으므로 오버라이딩
	/*
	 * @Override public void order() { 
	 * System.out.println("고객 판매 주문"); }
	 */
}
