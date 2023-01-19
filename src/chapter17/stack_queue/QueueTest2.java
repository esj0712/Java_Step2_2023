package chapter17.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest2 {

	public static void main(String[] args) {

		Queue<Messege> messegeQueue = new LinkedList<Messege>();
		// offer : �Է�
		messegeQueue.offer(new Messege("sendMail", "ȫ�浿"));
		messegeQueue.offer(new Messege("sendSMS", "������"));
		messegeQueue.offer(new Messege("sendKakaotalk", "�̼���"));

		// poll : ���

		while (!messegeQueue.isEmpty()) {
			Messege messege = messegeQueue.poll();
			switch (messege.command) {
			case "sendMail":
				System.out.println(messege.to + "�� ���� ������ �����ϴ�.");
				break;
			case "sendSMS":
				System.out.println(messege.to + "�� ���� SMS�� �����ϴ�.");
				break;
			case "sendKakaotalk":
				System.out.println(messege.to + "�� ���� ī���� �����ϴ�.");
				break;

			}

		}
	}
}
