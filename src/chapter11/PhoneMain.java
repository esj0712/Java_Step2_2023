package chapter11;

public class PhoneMain {

	public static void main(String[] args) {
		//Phone phone=new Phone();//(X)
		
		SmartPhone smartPhone =new SmartPhone("±Ë¿ØΩ≈");
		
		System.out.println(smartPhone.owner+"¥‘");
		smartPhone.turnOn();
		smartPhone.intersearch();
		smartPhone.turnOFff();

	}

}
