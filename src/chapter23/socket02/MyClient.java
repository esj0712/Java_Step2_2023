package chapter23.socket02;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {

	public static void main(String[] args) {

		System.out.println("메세지 입력 : ");
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();

		Socket s = null;

		try {
			s = new Socket("172.16.10.12", 3001); // 서버 ip와 포트번호

			// 문자열을 서버로 보내기 워해서 Stream 준비
			PrintWriter out = new PrintWriter(s.getOutputStream());
			// 서버로 문자열 보내기
			out.write(msg);

			// Stream에 적재한 내용을 비움
			out.flush();

			if (out != null) {
				out.close(); // Stream 닫기
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (s != null)
					s.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} // try

	} // main

}
