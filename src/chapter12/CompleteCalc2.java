package chapter12;

//��ӹ޾Ƽ� times/divide ����
public class CompleteCalc2 extends CompleteCalc {

	@Override
	public int adivide(int num1, int num2) {
        /*
		try {
			return num1/num2;
		} catch (Exception e) {
			
		}
		
		return Calc.ERROR;
		*/
		if(num2 != 0) {
			return num1/num2;
		}else {
			return Calc.ERROR;
		}
	}
	
	public void showInfo() {
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�.");
	}
	
	
    //����Ʈ�޼ҵ��� ������
	@Override
	public void description() {
		//super.description();
        System.out.println("�Ϻ��� ���� �Դϴ�.");		
	}

	@Override
	public int times(int num1, int num2) {

		
		
		return (num1 * num2);
	}

}
