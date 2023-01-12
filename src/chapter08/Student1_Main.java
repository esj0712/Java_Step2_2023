package chapter08;

public class Student1_Main {

	public static void main(String[] args) {

		Student1 stuLee = new Student1();
		stuLee.setStudentName("ÀÌÀç¹Î");
		System.out.println(stuLee.StudentName);
		// System.out.println(stuLee.serialNum);
		System.out.println(Student1.getSerialNum());
		Student1.serialNum++; // 10001

		System.out.println();
		Student1 stuKim = new Student1();
		stuKim.setStudentName("±èÃ¢¿ì");
		System.out.println(stuKim.StudentName);
		System.out.println(stuKim.getSerialNum());
		Student1.serialNum++; // 10002S

		System.out.println();
		Student1 stuJO = new Student1();
		stuJO.setStudentName("Á¶Çö¿ì");
		System.out.println(stuJO.StudentName);
		System.out.println(stuJO.getSerialNum());
		Student1.serialNum++; // 10002S

		System.out.println();
		Student1 stuPark = new Student1();
		stuPark.setStudentName("¹ÚÃ¢ÈÆ");
		System.out.println(stuPark.StudentName);
		System.out.println(stuPark.getSerialNum());
		Student1.serialNum++; // 10002S

	}

}
