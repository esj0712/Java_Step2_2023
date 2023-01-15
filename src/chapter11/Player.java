package chapter11;

public class Player {

	private PlayLevel level;

	public Player() {
		level = new BegginnerLevel();// PlayLevel level=new BegginnerLevel;
		level.showLevelMessage();
	}

	public PlayLevel getleLevel() {
		return level;
	}

	public void upgradeLevel(PlayLevel level) {
		this.level = level;
		level.showLevelMessage();
	}

	public void play(int count) {
		level.go(count);

	}
}
