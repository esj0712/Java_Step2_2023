package chapter22;

import java.util.Scanner;




public class Account_Main {
	
	private int n;

	public Account_Main(int n) {
		this.n = n;
	}

	public static void main(String[] args) {

		Account acc=new Account();
		Runnable r=new AccountThread(acc);
		
		Thread t1=new Thread(r);
		
		t1.start();
		
		//������ʹ� ������ ���� �޾� �Ա� ��Ű�� �ڵ�
		
		while(true) {
			System.out.println("�Ա� �� ���� �Է��ϼ��� : ");
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			acc.deposit(n);
			
			if(acc.balance==0) {
				break;
			}
			
			
		}

	}

}
