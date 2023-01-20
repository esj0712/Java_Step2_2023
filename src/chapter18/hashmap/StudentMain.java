package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentMain {

	public static void main(String[] args) {

		// 학생정보, 점수
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		// 중복 X
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(2, "이순신"), 85);
		map.put(new Student(3, "장영실"), 75);
		map.put(new Student(4, "한석봉"), 65);
		map.put(new Student(5, "허 준"), 90);

		// 저장된 총 Entry수 출력
		System.out.println("총 Entry 수 : " + map.size());

		// 하나씩 처리하는 방법
		Set<Student> KeySet = map.keySet();
		Iterator<Student> KeyIterator = KeySet.iterator();

		while (KeyIterator.hasNext()) {
			Student key = KeyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}

		Scanner scan = new Scanner(System.in);

		Student std;
		int input;
		String name;

		while (true) {

			System.out.print("학생 번호를 입력하세요 : ");
			input = scan.nextInt();
			System.out.print("학생이름을 입력하세요 :");
			name = scan.next();
			std = new Student(input, name);

			if (map.containsKey(std)) {
				System.out.println(name + " 학생의 점수는 : " + map.get(std));
				break;

			} else {
				System.out.println("해당 학생의 데이터가 존재하지 않습니다.");
			}

		}

	}

}
