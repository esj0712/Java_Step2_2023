package chapter17.hashset;

import java.util.HashSet;

public class SetMember {

	public static void main(String[] args) {
		// 정렬 X, 중복 X

		HashSet<Integer> hs = new HashSet<Integer>();

		while (true) {
			// 난수발생
			int v = (int) (Math.random() * 45 + 1);
			// int v=new Random().nextInt(45)+1;

			hs.add(v);

			if (hs.size() >= 6)
				break;

		}
		System.out.println(hs);

	}

}
