package chapter08;

public class StaticFunctionMain {

	public static void main(String[] args) {
		
		StaticFunction sta=new StaticFunction();
		System.out.println(sta.str2);
		String s=sta.getStatic();
		System.out.println(s);
		
		
		
		//static �޼ҵ�� Ŭ���������� ������ ����  
		String str;
		str=StaticFunction.getStatic();
		System.out.println(str);
		
		

	}

}
