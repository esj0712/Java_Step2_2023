package chapter12.Interface;

public class MyClassMain {

	public static void main(String[] args) {

		MyClass my = new MyClass();

		X xClass = my;
		xClass.x();
		System.out.println("===============================");

		Y yClass = my;
		yClass.y();
		System.out.println("===============================");

		MyInterface iClass = my;
		iClass.myMethod();
		iClass.x();
		iClass.y();

	}

}
