package chepter09;

public class Berry extends Fruit{
	                    //부모
	private String name;
	private String size;
	
	//setter
	public void Set2(String a, String b) {
		name=a;
		size=b;
	}
	//getter
	public void Disp2() {
		System.out.println("이룸 : "+name);
		System.out.println("크기 : "+size);
	}
 
}
