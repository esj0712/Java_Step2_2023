package chapter11;

public class MainBoard {

	public static void main(String[] args) {

		// �⺻���� 1�ܰ�
		Player ply = new Player();
		ply.play(1);

		// ���� 2�ܰ�
		AdvencedLevel aLevel = new AdvencedLevel();
		ply.upgradeLevel(aLevel);
		ply.play(2);

		// ���� 2�ܰ�
		SuperLevel slevel = new SuperLevel();
		ply.upgradeLevel(slevel);
		ply.play(3);

	}

}
