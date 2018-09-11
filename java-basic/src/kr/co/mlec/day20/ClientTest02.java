/*
 *  TCP Ŭ���̾�Ʈ ���� Ŭ����
 *  Socket : ���� ���ӽ� ���
 *   - �޼���
 *     �� InputStream getInputStream()
 *     �� OutputStream getOutputStream()
 */
package kr.co.mlec.day20;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;
import java.util.Date;

public class ClientTest02 {

	public static void main(String[] args) {
		try{
		// �������� ������ ����
		// localhost, 127.0.0.1, 192.168.0.9
			System.out.println("������ ������ �õ��մϴ�");
			Socket s = new Socket("localhost",10001);
			System.out.println("���� ����!!! ^^");
			
			InputStream in = s.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			String time = dis.readUTF();
			System.out.println("�ð� : "+time);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
