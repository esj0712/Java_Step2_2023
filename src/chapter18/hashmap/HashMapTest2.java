package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {
		// Map<String, Integer>생성 map
		Map<String, Integer> map = new HashMap<String, Integer>();

		// 팀원 데이터(성함, 학번)저장
		map.put("박창훈", 14);
		map.put("이석진", 14);
		map.put("한성무", 12);
		map.put("이세정", 14);
		map.put("박찬우", 15);
		map.put("장준근", 16);

		// 팀원의 인원
		System.out.println("팀원의 총 인원 : " + map.size() + "명");
		System.out.println();

		// 팀장의 학번을 알아내자
		System.out.println("팀장학번 : " + map.get("박창훈"));
		System.out.println();

		// 팀원 모두의 학번 출력
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();

		System.out.println("팀원 전체의 학번");
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(value + " 학번");
		}
	}

}
