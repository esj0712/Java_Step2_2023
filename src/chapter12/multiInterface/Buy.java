package chapter12.multiInterface;

public interface Buy {

	void buy();

	default void order() {
		System.out.println("���� �ֹ�");
	}

}
