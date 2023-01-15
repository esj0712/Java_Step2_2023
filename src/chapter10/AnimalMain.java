package chapter10;

public class AnimalMain {

	public static void main(String[] args) {
		Animal ani = new Animal();

		System.out.println("--------------°õ--------------");

		Bear ba = new Bear();

		System.out.println("´« : " + ba.getEye());
		System.out.println("´Ù¸® : " + ba.getLeg());
		System.out.println("Æ¯Â¡ : " + ba.woong);

		System.out.println("-------------»çÀÚ--------------");

		Lion li = new Lion();

		System.out.println("´« : " + li.getEye());
		System.out.println("´Ù¸® : " + li.getLeg());
		System.out.println("Æ¯Â¡ : " + li.galgi);

		System.out.println("-------------°Å¹Ì--------------");

		Spider sp = new Spider();

		System.out.println("´« : " + sp.getEye());
		System.out.println("´Ù¸® : " + sp.getLeg());
		System.out.println("Æ¯Â¡ : " + sp.web);

	}

}
