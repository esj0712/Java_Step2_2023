package chapter12.multiInterface;

public interface Inter_mMenu1 {

	abstract String jajang();

	String jjambbong();

	default void show() {
		System.out.println("¸ÀÁý~");
	}

}
