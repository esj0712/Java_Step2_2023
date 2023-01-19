package chapter14.String;

public class EqualsTest {

	public static void main(String[] args) {

		// String 클래스는 이미 toString으로 재정의 되어있다.
		String str1 = new String("test");
		String str2 = new String("test");

		Student studentLee = new Student(100, "이상우");
		Student studentLee2 = studentLee; // String str="java";
		Student studentSang = new Student(200, "이상우");

		// 동일한 주소의 두 인스턴스 비교(물리적 논리적 값이 동일)
		System.out.println("==================동일한 주소의 두 인스턴스 비교=================");

		if (studentLee == studentLee2) {
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		} else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");

		if (studentLee.equals(studentLee2)) {
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		} else
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		System.out.println();

		System.out.println("===============================================");

		// 두 인스턴스 비교(물리적 주소는 다르지만 논리적 값이 동일)
		System.out.println("=======물리적 주소( == )는 다르지만 논리적 값이 동일(equals)=======");

		if (studentLee == studentSang) {
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		} else
			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");

		if (studentLee.equals(studentSang)) {
			System.out.println("studentLee와 studentSang는 동일합니다.");
		} else
			System.out.println("studentLee와 studentSang는 동일하지 않습니다.");
		System.out.println();

		System.out.println("===================데이터 값 출력 ===========================");
		System.out.println("studentLee 의 hash code : " + studentLee.hashCode());
		System.out.println("studentSang 의 hash code : " + studentSang.hashCode());
		System.out.println();

		System.out.println("======== 데이터 값이 같으나 hash값이 다르므로 재정의가 필요 ========");
		System.out.println("studentLee 의 실제 주소 값 : " + System.identityHashCode(studentLee));
		System.out.println("studentSang 의 실제 주소 값 : " + System.identityHashCode(studentSang));
		System.out.println();

		// HashCode가 제정의 되어 있음
		System.out.println("=================String 클래스의 실제 값 출력=================");
		System.out.println("str1의 hash code : " + str1.hashCode());
		System.out.println("str2의 hash code : " + str2.hashCode());
	}

}
