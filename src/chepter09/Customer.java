package chepter09;

public class Customer {

	// �������
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	public double bonusPoint;
	protected double bonusRatio;

	// �⺻������
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public int calcPrice(int price) {
		bonusPoint += (bonusRatio * price);
		return price;
	}

	public String showCustomer() {
		return customerName + " ���� ����� " + getCustomerGrade() + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + " ����Ʈ �Դϴ�.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public double getBounsPoint() {
		return bonusPoint;
	}

	public void setBounsPoint(double bounsPoint) {
		this.bonusPoint = bounsPoint;
	}

	public double getBounsRatio() {
		return bonusRatio;
	}

	public void setBounsRatio(double bounsRatio) {
		this.bonusRatio = bounsRatio;
	}

}
