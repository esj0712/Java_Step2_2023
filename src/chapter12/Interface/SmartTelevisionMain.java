package chapter12.Interface;

public class SmartTelevisionMain {

	public static void main(String[] args) {

		SmartTelevision tv = new SmartTelevision();

		tv.turnOn();
		tv.setVolume(10);
		tv.turnOff();
		tv.seatch("www.naver.com");
		System.out.println("====================================");

		//Remote 클래스에 정의되어 있는 메소드만 오버라이딩된 메소드 대입
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
