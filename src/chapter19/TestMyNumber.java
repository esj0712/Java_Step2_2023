package chapter19;

public class TestMyNumber {

	public static void main(String[] args) {
        /*
		// �ν��Ͻ� �����濡 �����θ� ����
		MyNumber max = (x, y) -> (x >= y) ? x : y;
		// �����θ� �����Ͽ� ������
		System.out.println(max.getMax(2, 5));
        */
		
		MyNumber aa=new MyNumber() {
			
			@Override
			public int getMax(int x, int y) {
				int max=(x>=y)? x:y;
				return max;
			}
		};
		//===============================================
		System.out.println(aa.getMax(4, 5));
	}

}
