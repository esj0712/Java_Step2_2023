package chapter12.Interface;

public class SmartTelevisionMain {

	public static void main(String[] args) {

		SmartTelevision tv = new SmartTelevision();

		tv.turnOn();
		tv.setVolume(10);
		tv.turnOff();
		tv.seatch("www.naver.com");
		System.out.println("====================================");

		//Remote Ŭ������ ���ǵǾ� �ִ� �޼ҵ常 �������̵��� �޼ҵ� ����
		Remote rc = tv;
		rc.turnOn();
		rc.setVolume(0);
		rc.turnOff();
		// rc.seatch("www.naver.com");

		Searchable sc = tv;
		/*
		sc.turnOn(); 
		sc.setVolume(10); 
		sc.turnOff();
		*/
		sc.seatch("www.daum.com");
	}

}
