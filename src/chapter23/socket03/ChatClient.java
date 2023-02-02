package chapter23.socket03;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements Runnable {

   JTextArea area;// �޽����� ȭ�鿡 ����ϴ� ����
   JTextField input;
   JButton send_bt;// �޽��� ���۹�ư
   JPanel south_p;

   // ���� ������ ���� ��ü
   Socket s;
   BufferedReader in;
   PrintWriter out;
   Thread t;

   public ChatClient() {
      area = new JTextArea();
      this.add(area);

      // BorderLayout��ġ�����ڷ� ������ JPanel ����
      south_p = new JPanel(new BorderLayout());
      south_p.add(input = new JTextField());// �гΰ�ü�� ��� �߰�
      south_p.add(send_bt = new JButton("������"), BorderLayout.EAST);
      this.add(south_p, BorderLayout.SOUTH);
      
      // �̺�Ʈ ������ ���
      this.addWindowListener(new WindowAdapter() {
         
         @Override
         public void windowClosing(WindowEvent e) {
            // �����ϱ� ���� ���� ���� ����
            // ���� �޼����� ������.(������ �����带 �Ҹ��Ű�� ��            ���̴�.)
            out.println("~X");//����� xx:~X��� �޽��� ����
            // ���� �޼����� ������ ���ٰ� �ٽ�
            // ������ ������ ���ƿ´�.
         }
      });
      
      // ��ư
      send_bt.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent arg0) {
            sendData();//������ �޽����� �����ϱ� ���� �޼���         
         }
      });

      setBounds(100, 100, 400, 500);
      setVisible(true);

      connected(); // ���� ����

      //�����κ��� ���޵Ǵ� �޼����� �����Ͽ� �޴� ������ ����
      t = new Thread(this);
      t.start(); //Runnable�� run()�� �����
      
   }
   
   
   private void connected() {
      try {
         // ���� ����
         s = new Socket("172.16.10.12", 3200);
         in = new BufferedReader(new InputStreamReader(s.getInputStream()));
         out = new PrintWriter(s.getOutputStream(), true);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public static void main(String[] args) {

      new ChatClient();

   }

   @Override
   public void run() {
      // �����κ��� ���޵Ǵ� �޼����� ��ٷȴٰ� �����ϸ� ȭ�鿡 ���
      while (true) {
         try {
            String msg = in.readLine();
            if (msg.equals("~X")) { // ������
               break;
            }

            if (msg != null) { // ä�� ��
               area.append(msg + "\r\n"); // "\r\n" : ���� �������� �Ѿ��
            }

         } catch (Exception e) {

            e.printStackTrace();

         }
      }

      closed(); // �����ִ� ��Ʈ���� �ݴ� �޼���
      System.exit(0); // ���α׷� ����

   }// run

   private void sendData() {
      String msg = input.getText().trim(); // trim() : ���� ���� �ʿ���� ������ ��������
      if (msg.length() > 0) {
         // �ѱ��ڶ� �Է����� �� ������ ������
         out.println(msg);
      }
      input.setText("");// û��!!
   }

   private void closed() {
      try {
         if (out != null)
            out.close();
         if (in != null)
            in.close();
         if (s != null)
            s.close();
      } catch (Exception e) {
         // TODO: handle exception
      }
   }

}