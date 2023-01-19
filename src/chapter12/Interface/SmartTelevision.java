package chapter12.Interface;

public class SmartTelevision implements Remote, Searchable {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > Remote.MAX_VOLUME) {
			this.volume = Remote.MAX_VOLUME; // 10�� �ʰ��ϸ� 10(MAX)�� �ʱ�ȭ
		} else if (volume > Remote.MIN_VOLUME) {
			this.volume = Remote.MIN_VOLUME; // 0�� ���ϸ� �Է��ϸ� 1(MIN)�� �ʱ�ȭ
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : " + this.volume);
	}

	@Override
	public void seatch(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}

}
