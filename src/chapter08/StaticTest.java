package chapter08;

class stVal{
	
	int a;
	static int b;
}

public class StaticTest {
	

	public static void main(String[] args) {
		
		stVal obj1=new stVal();
		stVal obj2=new stVal();

		obj1.a=10;
		obj2.b=20;
		System.out.println("obj1 : "+obj1+" obj2 : "+obj2);
		System.out.println("=====================================");
		obj1.a=100;
		obj2.b=200;
		System.out.println("obj2 : "+obj2.a+" obj2 : "+obj2.b);
		System.out.println("=====================================");
		//static�� ������ �������� �������� ���ǹǷ� �ٸ� ��ü���� ���� �����ϸ� ����� ���� �����
		System.out.println("obj1 : "+obj1.a+" obj1 : "+obj1.b);
		
		obj1.a=100;
		obj2.b=300;
		System.out.println("obj2 : "+obj2.a+" obj2 : "+obj2.b);
		System.out.println("obj1 : "+obj1.a+" obj2 : "+obj1.b);
	}

}
