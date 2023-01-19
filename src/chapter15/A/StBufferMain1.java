package chapter15.A;

public class StBufferMain1 {

	public static void main(String[] args) {

		StringBuffer buf = new StringBuffer("Nice Day");

		System.out.println(buf.toString());
		System.out.println(buf.length());
		// StringBuffer의 기본 용량 16 + 추가(length)가 들어가있다
		System.out.println(buf.capacity());
		// 24를 넘어가면 허용번휘(26 ~ 50)까지는 갖고있는 용량*2+2=50 / 51~ 는 갖고있는 용량
		buf.ensureCapacity(51);
		System.out.println(buf.capacity());
		buf.insert(0, "Hi! ");
		System.out.println(buf);
		buf.insert(12, " Everybody! ");
		System.out.println(buf);
		buf.delete(0, 4);
		System.out.println(buf);
	}

}
