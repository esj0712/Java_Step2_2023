package chapter10;

import chepter09.Customer;
import chepter09.VipCustomer;

public class OverridingTest2 {

	public static void main(String[] args) {
		// �θ�=�ڽ� (�ڵ�����ȯ)
		Customer vc = new VipCustomer(10003, "��ġ", 20000);
		System.out.println(vc.showCustomer());

	}

}
