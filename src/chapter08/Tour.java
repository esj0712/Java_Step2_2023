package chapter08;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {
		System.out.print("������ �� : ");
		Scanner scan=new Scanner(System.in);
		
		Guest guest=new Guest();
		
        
		int n=scan.nextInt(); 
		Guide guide=new Guide(n);
		
		
		
		
		boolean run=true;
		
		while (true) {
			
			for(int i=0;i<n;i++) {
				System.out.print((i+1)+". �̸� : ");
				guide.guest[i].setName(scan.next());
				System.out.print((i+1)+". ���� : ");
				guide.guest[i].setGender(scan.next());
				System.out.println("----------------------");
			}
			break;
		}
		
			while(run) {
		System.out.println("1.������ ����");
		System.out.println("2.������ ����");
		System.out.println("3.����");
			int a=scan.nextInt();
			switch (a) {
			case 1:{
				for(int j=0;j<n;j++) {
				System.out.println((j+1)+". �̸� : "+guide.guest[j].getName());
				System.out.println((j+1)+". ���� : "+guide.guest[j].getGender());
				System.out.println((j+1)+". ������ : "+guide.guest[j].getPoint());
				break;
				}
			}
			case 2:{
				System.out.println("������ ���");
				Guide.point=scan.next();
				System.out.println(Guide.point+"�� ������ ����");
				System.out.println("=============================");
				System.out.println("");
				break;
				}
			case 3:{
				run=false;
				break;
			}
			}
			}
		
		
       
	}

}
