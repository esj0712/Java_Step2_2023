package chapter12.multiInterface;

public class CustomerMain {

	public static void main(String[] args) {

		Customar Custo = new Customar();
		System.out.println("============Buy============");
		Buy buyer = Custo;
		buyer.buy();
		buyer.order();

		System.out.println("============Sell============");
		Sell Se = Custo;
		Se.sell();
		Se.selleorder();

		// Se 부모 / Customer 자식
		if (Se instanceof Customar) {
			Customar cus2 = (Customar) Se;
			System.out.println("==Down Chasting==");
			cus2.buy();
			cus2.sell();
			cus2.selleorder();
		}

		Custo.order();

	}

}
