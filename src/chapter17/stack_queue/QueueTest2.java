package chapter17.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest2 {

	public static void main(String[] args) {

		Queue<Messege> messegeQueue = new LinkedList<Messege>();
		// offer : ÀÔ·Â
		messegeQueue.offer(new Messege("sendMail", "È«±æµ¿"));
		messegeQueue.offer(new Messege("sendSMS", "±èÀ¯½Å"));
		messegeQueue.offer(new Messege("sendKakaotalk", "ÀÌ¼ø½Å"));

		// poll : Ãâ·Â

		while (!messegeQueue.isEmpty()) {
			Messege messege = messegeQueue.poll();
			switch (messege.command) {
			case "sendMail":
				System.out.println(messege.to + "´Ô ¿¡°Ô ¸ŞÀÏÀ» º¸³À´Ï´Ù.");
				break;
			case "sendSMS":
				System.out.println(messege.to + "´Ô ¿¡°Ô SMSÀ» º¸³À´Ï´Ù.");
				break;
			case "sendKakaotalk":
				System.out.println(messege.to + "´Ô ¿¡°Ô Ä«ÅåÀ» º¸³À´Ï´Ù.");
				break;

			}

		}
	}
}
