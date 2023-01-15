package chapter10;

import chepter09.Customer;
import chepter09.VipCustomer;

public class OverridingTest1 {

	public static void main(String[] args) {

		Customer cusromerLee = new Customer(10001, "이순신");
		cusromerLee.bonusPoint = 1000;
		System.out.println(cusromerLee.showCustomer());

		VipCustomer customerKim = new VipCustomer(10002, "김유신", 10004);
		customerKim.bonusPoint = 1000;

		int price = 10000;
		System.out.println(customerKim.showCustomer());
		System.out.println(cusromerLee.getCustomerName() + "님이 " + cusromerLee.calcPrice(price) + "원을 지불 완료하였습니다.");
		System.out.println(customerKim.getCustomerName() + "님이 " + customerKim.calcPrice(price) + "원을 지불 완료하였습니다.");
	}

}
