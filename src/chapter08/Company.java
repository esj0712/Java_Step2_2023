package chapter08;

public class Company {
	
	//��ü�� �� �ϳ��� �����ϴ� Ŭ����
	private static Company instance=new Company();
	
	//�Ϲ����� ��ü ����
	public Company() {
		
	}
	
	//singleton ��ü ���� �޼ҵ�
	public static Company getInstance() {
		//���� ó��
		if(instance == null) {
			instance=new Company();
		}
		return instance;
	}

}
