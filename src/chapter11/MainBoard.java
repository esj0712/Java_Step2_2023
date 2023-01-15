package chapter11;

public class MainBoard {

	public static void main(String[] args) {

		// 기본게임 1단계
		Player ply = new Player();
		ply.play(1);

		// 레벨 2단계
		AdvencedLevel aLevel = new AdvencedLevel();
		ply.upgradeLevel(aLevel);
		ply.play(2);

		// 레벨 2단계
		SuperLevel slevel = new SuperLevel();
		ply.upgradeLevel(slevel);
		ply.play(3);

	}

}
