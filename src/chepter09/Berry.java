package chepter09;

public class Berry extends Fruit{
	                    //�θ�
	private String name;
	private String size;
	
	//setter
	public void Set2(String a, String b) {
		name=a;
		size=b;
	}
	//getter
	public void Disp2() {
		System.out.println("�̷� : "+name);
		System.out.println("ũ�� : "+size);
	}
 
}
