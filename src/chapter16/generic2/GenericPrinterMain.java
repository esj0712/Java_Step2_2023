package chapter16.generic2;

public class GenericPrinterMain {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> pripow=new GenericPrinter<Powder>();
		pripow.setMaterial(new Powder());
		Powder powder=pripow.getMaterial();
		System.out.println(powder);

	}

}
