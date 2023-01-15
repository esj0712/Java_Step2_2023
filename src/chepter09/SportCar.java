package chepter09;

public class SportCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
		System.out.println(speed);
	}
    //final이므로 재정의가 안됨
	/*
	public void stop() {
		System.out.println("자동차가 멈춥니다");
		speed = 0;
	}
    */
	public static void main(String[] args) {
		SportCar ac = new SportCar();
		ac.speedUp();
		ac.stop();

	}

}
