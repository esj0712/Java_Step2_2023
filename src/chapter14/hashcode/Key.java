package chapter14.hashcode;

public class Key {

	public int number;

	public Key(int number) {
		this.number = number;
	}

	// ���� ��(������)
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number) {
				return true; // �� ��ġ
			}
		}
		return false;
	}

	// ������ �ּ�
	@Override
	public int hashCode() {
		// return super.toString(); // ���� heap�޸� 16���� �ּ�
		return number;
		
	}
	

}
