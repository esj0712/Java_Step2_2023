package chapter22;

import java.util.Random;

public class Runners {

	public static void main(String[] args) {

		int[] PlayerRandom = new int[5];

		String[] PlayerJump = { "", " ", "  ", "   ", "    " };

		boolean finish = false;
		int finishPlayer = 0;

		while (true) {
			// 도약거리
			for (int i = 0; i < PlayerRandom.length; i++) {
				PlayerRandom[i] = new Random().nextInt(4); // 0~4

				try {
					Thread.sleep(30);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			// 각 선수에게 도약거리 적용
			for (int i = 0; i < PlayerJump.length; i++) {

				switch (PlayerRandom[i]) {
				case 0: {
					PlayerJump[i] += "";
					break;
				}
				case 1: {
					PlayerJump[i] += " ";
					break;
				}
				case 2: {
					PlayerJump[i] += "  ";
					break;
				}
				case 3: {
					PlayerJump[i] += "   ";
					break;
				}

				}// switch

			} // for
			System.out.println("==============================================");
			for (int i = 0; i < PlayerJump.length; i++) {
				System.out.print(PlayerJump[i]);
				;
				System.out.println(i + 1 + "옷");

				if (PlayerJump[i].length() >= 40) {
					finishPlayer = i + 1;
					finish = true;

				}
			} // for
				// System.out.println("==============================================");

			// 결산
			if (finish) {
				System.out.println("WINNER - " + finishPlayer + "번 선수");
				break;
			}
		}
	}// main

}
