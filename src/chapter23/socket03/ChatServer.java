package chapter23.socket03;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer extends Thread {

	ServerSocket ss;
	ArrayList<CopyClient> list;

	public ChatServer() {
		try {
			list = new ArrayList<CopyClient>();
			ss = new ServerSocket(3200);
			System.out.println("서버시작");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ChatServer().start();

	}

	// 클라이언드가 언제 접속할지 모르므로 상시 대기하고 들어오면 Thread에서 구동
	@Override
	public void run() {

		// 접속자를 기다림
		while (true) {
			try {
				Socket s = ss.accept(); // 접속자 등장 수락
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + "님이 접속");
				// 접속자와 서버 정보를 CopyClient에게 전달

				CopyClient cc = new CopyClient(s, this);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void sendMessage(String msg) {
		// 접속자들은 CopyClient로 만들어져서 ArrayList에
		// 모두 저장된 상태다.
		try {
			for (CopyClient cc : list) {
				cc.out.println(msg);// 서버의 접속자들에게 메세지 전달!
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void removeClient(CopyClient cc) {
		list.remove(cc);// 인자로 전달된 CopyClient객체를
		// ArrayList에서 삭제!!
		sendMessage("☆★☆★" + cc.ip + "님 퇴장!☆★☆★");
		// 위는 남아있는 구성원들에게 퇴장메세지 전달!
	}
}
