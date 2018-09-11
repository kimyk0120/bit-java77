package kr.co.mlec.day20;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerTest02 {

	public static void main(String[] args) {
		try {
			// Ÿ�� ���� ����
			// ���� �ð� ������ �����ϴ� ����
			System.out.println("Ÿ�� ������ �����մϴ�.");
			ServerSocket server = new ServerSocket(10001);
			
			// �ð� ����
			String pattern = "yyyy-MM-dd HH:mm:ss";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			
			while (true) {
				// ������ Ŭ���̾�Ʈ ���� ��ü : client
				Socket client = server.accept();
				
				// ������ Ŭ���̾�Ʈ�� �ð� ������ ������(Ŭ���̾�Ʈ�� ���)
				OutputStream out = client.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				dos.writeUTF(sdf.format(new Date()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
