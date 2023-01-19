package chapter17.arraylist_stack_queue;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {

	public void personMgr() {

		int select;
		Person p = null;

		ArrayList<Person> personArr = new ArrayList<Person>();

		while (true) {

			System.out.println("1. 회원추가");
			System.out.println("2. 회원탈퇴");
			System.out.println("3. 회원정보");
			System.out.println("4. 종   료");
			System.out.print("항목선택 : ");

			Scanner scan = new Scanner(System.in);
			select = scan.nextInt();

			// if || switch

			if (select == 1) {
				p = new Person();

				System.out.println("====정보 입력====");
				System.out.print("이름 : ");
				p.setName(scan.next());
				System.out.print("전화번호 : ");
				p.setTel(scan.next());
				System.out.print("나이 : ");
				p.setAge(scan.nextInt());
//=======================================================================				
				personArr.add(p);
				System.out.println("정보가 저장되었습니다.");
                
				continue;
			} else if (select == 2) {
				System.out.print("회원 명 : ");
				p.setName(scan.next());
				for (int i = 0; i < personArr.size(); i++) {
					if (p.getName().equals(personArr.get(i).getName())) {
						personArr.remove(i);
						System.out.println("삭제되었습니다");
						

					} else
						System.out.println("회원이 존재하지 않습니다.");
					
				}

			} else if (select == 3) {
				for (int i = 0; i < personArr.size(); i++) {

					System.out.println("회원번호 : " + (i + 1));
					System.out.println("이름 : " + personArr.get(i).getName());
					System.out.println("나이 : " + personArr.get(i).getAge());
					System.out.println("전화 : " + personArr.get(i).getTel());
					System.out.println("=====================================");
					
				}
				continue;

			} else if (select == 4)
				System.out.println("종료 합니다.");
			break;

		}

	}

}
