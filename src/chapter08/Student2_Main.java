package chapter08;

public class Student2_Main {

	public static void main(String[] args) {
		
		Student2 stuLee = new Student2();
		stuLee.setStudentName("�����");
		System.out.println("�̸� : "+stuLee.StudentName+
				                     "���̵� : "+Student2.getSerialNum());
		

		System.out.println();
		Student2 stuKim = new Student2();
		stuKim.setStudentName("��â��");
		System.out.println("�̸� : "+stuKim.StudentName+
				                     "���̵� : "+Student2.getSerialNum());
		

		System.out.println();
		Student2 stuJO = new Student2();
		stuJO.setStudentName("������");
		System.out.println("�̸� : "+stuJO.StudentName+
				                     "���̵� : "+Student2.getSerialNum());
		

		System.out.println();
		Student2 stuPark = new Student2();
		stuPark.setStudentName("��â��");
		System.out.println("�̸� : "+stuPark.StudentName+
				                     "���̵� : "+Student2.getSerialNum());
		

	}

}
