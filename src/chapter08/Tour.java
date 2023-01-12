package chapter08;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {
		System.out.print("관광객 수 : ");
		Scanner scan=new Scanner(System.in);
		
		Guest guest=new Guest();
		
        
		int n=scan.nextInt(); 
		Guide guide=new Guide(n);
		
		
		
		
		boolean run=true;
		
		while (true) {
			
			for(int i=0;i<n;i++) {
				System.out.print((i+1)+". 이름 : ");
				guide.guest[i].setName(scan.next());
				System.out.print((i+1)+". 성별 : ");
				guide.guest[i].setGender(scan.next());
				System.out.println("----------------------");
			}
			break;
		}
		
			while(run) {
		System.out.println("1.관광객 정보");
		System.out.println("2.목적지 변경");
		System.out.println("3.종료");
			int a=scan.nextInt();
			switch (a) {
			case 1:{
				for(int j=0;j<n;j++) {
				System.out.println((j+1)+". 이름 : "+guide.guest[j].getName());
				System.out.println((j+1)+". 성별 : "+guide.guest[j].getGender());
				System.out.println((j+1)+". 목적지 : "+guide.guest[j].getPoint());
				break;
				}
			}
			case 2:{
				System.out.println("변경할 장소");
				Guide.point=scan.next();
				System.out.println(Guide.point+"로 목적지 변경");
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
