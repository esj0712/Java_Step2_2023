package chapter10;

import chepter09.Customer;
import chepter09.VipCustomer;

public class OverridingTest1 {

	public static void main(String[] args) {

		Customer cusromerLee = new Customer(10001, "�̼���");
		cusromerLee.bonusPoint = 1000;
		System.out.println(cusromerLee.showCustomer());

		VipCustomer customerKim = new VipCustomer(10002, "������", 10004);
		customerKim.bonusPoint = 1000;

		int price = 10000;
		System.out.println(customerKim.showCustomer());
		System.out.println(cusromerLee.getCustomerName() + "���� " + cusromerLee.calcPrice(price) + "���� ���� �Ϸ��Ͽ����ϴ�.");
		System.out.println(customerKim.getCustomerName() + "���� " + customerKim.calcPrice(price) + "���� ���� �Ϸ��Ͽ����ϴ�.");
	}

}
