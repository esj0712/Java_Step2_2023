package chepter09;

public class CustomerMain {

	public static void main(String[] args) {
		// VIP 고객
		int price = 10000;
		System.out.println("==================VIP고객===================");

		VipCustomer vipcs = new VipCustomer(1004, "홍길동", 900);

		int vipprice = vipcs.calcPrice(price);
		System.out.println(vipcs.getCustomerName() + "님이 " + vipprice + "원을 지불 완료하셨습니다.");
		System.out.println(vipcs.showCustomer());

		System.out.println("=====================고객====================");

		price = 10000;
		Customer cs = new Customer(1000, "고길동");

		int csprice = cs.calcPrice(price);
		System.out.println(cs.getCustomerName() + "님이 " + csprice + "원을 지불 완료하셨습니다.");
		System.out.println(cs.showCustomer());

	}

}
