package chepter09;

public class VipCustomer extends Customer {

	private int agentID;
	double saleRatio;

	public VipCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		// this.customerID=customerID;
		// this.customerName=customerName;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		this.agentID = agentID;// ���� ����
		this.saleRatio = 0.1;
	}

	// ����Ʈ ���� & ���ǰ���
	@Override
	public int calcPrice(int price) {
		bonusPoint = (price - (int) (price * saleRatio)) * bonusRatio;
		return price - (int) (price * saleRatio); // ���ǰ���
	}

	@Override
	public String showCustomer() {
		return super.showCustomer() + "\n�������� ��ȣ�� " + agentID + "�� �Դϴ�";
	}

	public int getAgentID() {
		return agentID;
	}

}
