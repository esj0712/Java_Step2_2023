package chapter14.String;

public class Student {

	int studentID;
	String studentName;

	// ������
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return studentID + ", " + studentName;
	}

	// ������ �ּ�
	@Override
	public int hashCode() {
		return studentID;
	}

	@Override
	public boolean equals(Object obj) {
		// �� �ڽ��� �¾�?
		if (obj instanceof Student) {
			Student std = (Student) obj;
			if (studentID == std.studentID) // ���Ǵ�
				return true;
			else
				return false;

		}
		return false;

	}

}
