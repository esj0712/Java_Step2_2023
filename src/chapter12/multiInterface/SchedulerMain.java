package chapter12.multiInterface;

import java.util.Scanner;

public class SchedulerMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("R or r : �Ѹ� ���ʷ� �Ҵ�");
			System.out.println("L or l : �����ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
			System.out.println("P or p : ���� Skill ���� ���� �������� �Ҵ�");
			System.out.println("S or s : ����");
			System.out.print("��ȭ ��� ����� �����ϼ��� : ");

			char p = scan.next().charAt(0);

			// ���ڸ� �ƽ�Ű�ڵ�� ����ȯ

			Scheduler sch = null;

			// int ch=System.in.read();
			// ��ü ����

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
				System.out.println("����");
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
				System.out.println("����");
				break;
			}
			sch.getNextCall();
			sch.secdCallToAgent();
		}

	}

}
