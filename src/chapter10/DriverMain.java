package chapter10;

public class DriverMain {

	public static void main(String[] args) {
		Drive driver = new Drive();

		/*
		 * Bus bu = new Bus(); Taxi ta = new Taxi();
		 */
		driver.drive(new Bus());
		driver.drive(new Taxi());

	}

}
