package chapter12.multiInterface;

import java.util.Scanner;

public class SchedulerMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 Skill 값이 높은 상담원에게 할당");
			System.out.println("S or s : 종료");
			System.out.print("전화 상담 방식을 선택하세요 : ");

			char p = scan.next().charAt(0);

			// 문자를 아스키코드로 형변환

			Scheduler sch = null;

			// int ch=System.in.read();
			// 객체 생성

			/*
			if ((int) p == 'R' || (int) p == 'r') {
				RoundRobin ro = new RoundRobin();
				ro.getNextCall();
				ro.secdCallToAgent();
			} else if ((int) p == 'L' || (int) p == 'l') {
				LeastJob lo = new LeastJob();
				lo.getNextCall();
				lo.secdCallToAgent();
			} else if ((int) p == 'P' || (int) p == 'p') {
				PriorityAllocavation po = new PriorityAllocavation();
				po.getNextCall();
				po.secdCallToAgent();
			} else if ((int) p == 'S' || (int) p == 's') {
				System.out.println("종료");
				break;
			}
			*/

			if ((int) p == 'R' || (int) p == 'r') {
				sch = new RoundRobin();
			} else if ((int) p == 'L' || (int) p == 'l') {
				sch = new LeastJob();
			} else if ((int) p == 'P' || (int) p == 'p') {
				sch = new PriorityAllocavation();
			} else if ((int) p == 'S' || (int) p == 's') {
				System.out.println("종료");
				break;
			}
			sch.getNextCall();
			sch.secdCallToAgent();
		}

	}

}
