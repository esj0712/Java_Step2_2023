package chapter08;

public class Student2_Main {

	public static void main(String[] args) {
		
		Student2 stuLee = new Student2();
		stuLee.setStudentName("이재민");
		System.out.println("이름 : "+stuLee.StudentName+
				                     "아이디 : "+Student2.getSerialNum());
		

		System.out.println();
		Student2 stuKim = new Student2();
		stuKim.setStudentName("김창우");
		System.out.println("이름 : "+stuKim.StudentName+
				                     "아이디 : "+Student2.getSerialNum());
		

		System.out.println();
		Student2 stuJO = new Student2();
		stuJO.setStudentName("조현우");
		System.out.println("이름 : "+stuJO.StudentName+
				                     "아이디 : "+Student2.getSerialNum());
		

		System.out.println();
		Student2 stuPark = new Student2();
		stuPark.setStudentName("박창훈");
		System.out.println("이름 : "+stuPark.StudentName+
				                     "아이디 : "+Student2.getSerialNum());
		

	}

}
