package chepter09;

public class CustomerMain {

	public static void main(String[] args) {
		// VIP ��
		int price = 10000;
		System.out.println("==================VIP��===================");

		VipCustomer vipcs = new VipCustomer(1004, "ȫ�浿", 900);

		int vipprice = vipcs.calcPrice(price);
		System.out.println(vipcs.getCustomerName() + "���� " + vipprice + "���� ���� �Ϸ��ϼ̽��ϴ�.");
		System.out.println(vipcs.showCustomer());

		System.out.println("=====================��====================");

		price = 10000;
		Customer cs = new Customer(1000, "��浿");

		int csprice = cs.calcPrice(price);
		System.out.println(cs.getCustomerName() + "���� " + csprice + "���� ���� �Ϸ��ϼ̽��ϴ�.");
		System.out.println(cs.showCustomer());

	}

}
