package chapter10;

public class AnimalMain {

	public static void main(String[] args) {
		Animal ani = new Animal();

		System.out.println("--------------��--------------");

		Bear ba = new Bear();

		System.out.println("�� : " + ba.getEye());
		System.out.println("�ٸ� : " + ba.getLeg());
		System.out.println("Ư¡ : " + ba.woong);

		System.out.println("-------------����--------------");

		Lion li = new Lion();

		System.out.println("�� : " + li.getEye());
		System.out.println("�ٸ� : " + li.getLeg());
		System.out.println("Ư¡ : " + li.galgi);

		System.out.println("-------------�Ź�--------------");

		Spider sp = new Spider();

		System.out.println("�� : " + sp.getEye());
		System.out.println("�ٸ� : " + sp.getLeg());
		System.out.println("Ư¡ : " + sp.web);

	}

}
