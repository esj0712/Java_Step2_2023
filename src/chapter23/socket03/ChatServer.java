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
			System.out.println("��������");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ChatServer().start();

	}

	// Ŭ���̾�尡 ���� �������� �𸣹Ƿ� ��� ����ϰ� ������ Thread���� ����
	@Override
	public void run() {

		// �����ڸ� ��ٸ�
		while (true) {
			try {
				Socket s = ss.accept(); // ������ ���� ����
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + "���� ����");
				// �����ڿ� ���� ������ CopyClient���� ����

				CopyClient cc = new CopyClient(s, this);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void sendMessage(String msg) {
		// �����ڵ��� CopyClient�� ��������� ArrayList��
		// ��� ����� ���´�.
		try {
			for (CopyClient cc : list) {
				cc.out.println(msg);// ������ �����ڵ鿡�� �޼��� ����!
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void removeClient(CopyClient cc) {
		list.remove(cc);// ���ڷ� ���޵� CopyClient��ü��
		// ArrayList���� ����!!
		sendMessage("�١ڡ١�" + cc.ip + "�� ����!�١ڡ١�");
		// ���� �����ִ� �������鿡�� ����޼��� ����!
	}
}
