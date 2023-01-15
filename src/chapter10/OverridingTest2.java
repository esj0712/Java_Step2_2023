package chapter10;

import chepter09.Customer;
import chepter09.VipCustomer;

public class OverridingTest2 {

	public static void main(String[] args) {
		// 부모=자식 (자동형변환)
		Customer vc = new VipCustomer(10003, "김치", 20000);
		System.out.println(vc.showCustomer());

	}

}
