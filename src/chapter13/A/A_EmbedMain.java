package chapter13.A;

import javax.swing.JOptionPane;

class Out2 {

	static int a = 1;
	int b;

	public static class In {

		String InFun() {
			return (a + "��° static ���� Ŭ����");
		}
	}
}

public class A_EmbedMain {

	public static void main(String[] args) {

		// static�� Ŭ���������� ���� ������ ������

		Out2.In obj3 = new Out2.In();
		// ���ο� �ִ� �޼ҵ�
		String str = obj3.InFun();

		JOptionPane.showMessageDialog(null, str + "\n Success");

	}

}
