package chapter14.String;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {

		Date now = new Date(); // Date = �ð�
		// System.out.println(now);
		String strNow = now.toString(); // toString : ��ü(heap) => StringŸ������ ����
		System.out.println("===============DATE===============");
		System.out.println(strNow);

		SimpleDateFormat ssdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		// String strNow2=ssdf.format(now); // ������� ����
		String strNow2 = ssdf.toString(); // ��ü ��ȯ => �ؽ��ڵ尪�� ����
		System.out.println("========SimpleDateFormat========");
		System.out.println(strNow2);

	}

}
