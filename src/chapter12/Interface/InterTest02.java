package chapter12.Interface;

//body가 없는상태 
public class InterTest02 implements InterTest01 {

	@Override
	public int getA() {

		return A; // 상수 A를 반환
	}

}
