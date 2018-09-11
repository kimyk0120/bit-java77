package kr.co.mlec.day20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class EchoThread extends Thread {
	private Socket s;

	EchoThread(Socket s) {
		this.s = s;
	}

	public void run() {

		try {

			InputStream in = s.getInputStream();
			DataInputStream dis = new DataInputStream(in);

			OutputStream out = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);

			// ������ Ŭ���̾�Ʈ ���� ��ü : client
			while (true) {

				// 3. Ŭ���̾�Ʈ ������ �޼����� �д´�
				String s = dis.readUTF();

				if (s.equals("quit"))
					break;

				// 4. ���� �����͸� Ŭ���̾�Ʈ�� ����
				dos.writeUTF(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

public class ThreadServerTest03 {

	public static void main(String[] args) {
		try {
			// Ÿ�� ���� ����
			// ���� �ð� ������ �����ϴ� ����
			System.out.println("���� ������ �����մϴ�.");

			ServerSocket server = new ServerSocket(10001);
			while (true) {
				Socket s = server.accept();
				EchoThread et = new EchoThread(s);
				et.start();
			}
		} catch (Exception e) {
		}
	}

}
