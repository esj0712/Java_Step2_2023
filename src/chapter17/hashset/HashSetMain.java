package chapter17.hashset;

import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		// equals�� hashcode�� override�� String type
		//�ߺ� X, ���� X
		HashSet<String> hashset=new HashSet<String>();
		hashset.add(new String("������"));
		hashset.add(new String("������"));
		hashset.add(new String("ȫ����"));
		hashset.add(new String("������"));
		
		System.out.println(hashset);
		hashset.add(new String("������"));
		System.out.println(hashset);
		
		
		

	}

}
