package kr.co.mlec.day20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest03 {

	public static void main(String[] args) {
		try {
			// Ÿ�� ���� ����
			// ���� �ð� ������ �����ϴ� ����
			System.out.println("���� ������ �����մϴ�.");
			
			ServerSocket server = new ServerSocket(10001);
			while(true){

			// 3. Ŭ���̾�Ʈ ������ �޼����� �д´�
			Socket client = server.accept();
			InputStream in = client.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			// 4. ���� �����͸� Ŭ���̾�Ʈ�� ���� 
			OutputStream out = client.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			
			// ������ Ŭ���̾�Ʈ ���� ��ü : client
			while (true) {
				
				String s = dis.readUTF();
				
				
				if(s.equals("quit")) break;
				
				dos.writeUTF(s);
				
			}
			}
		} catch (Exception e) {
		}
	}

}
