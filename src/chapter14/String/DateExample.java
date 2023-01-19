package chapter14.String;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {

		Date now = new Date(); // Date = 시간
		// System.out.println(now);
		String strNow = now.toString(); // toString : 객체(heap) => String타입으로 변경
		System.out.println("===============DATE===============");
		System.out.println(strNow);

		SimpleDateFormat ssdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		// String strNow2=ssdf.format(now); // 상수값이 나옴
		String strNow2 = ssdf.toString(); // 객체 변환 => 해시코드값이 나옴
		System.out.println("========SimpleDateFormat========");
		System.out.println(strNow2);

	}

}
