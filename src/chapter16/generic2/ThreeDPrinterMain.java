package chapter16.generic2;

public class ThreeDPrinterMain {

	public static void main(String[] args) {

		ThreeDPrinter pripow = new ThreeDPrinter();
		// #1
		Powder p1 = new Powder();
		pripow.setMaterial(p1);
		System.out.println(p1);
		// #2 *****
		Powder p2 = (Powder) pripow.getMaterial();
		System.out.println(p2);
//==================================================
		ThreeDPrinter pripla = new ThreeDPrinter();
		// #1
		Plastic p3 = new Plastic();
		pripla.setMaterial(p3);
		System.out.println(p3);
		// #2 *****
		Plastic p4 = (Plastic) pripla.getMaterial();
		System.out.println(p4);

	}

}
