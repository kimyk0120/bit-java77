/*
 *  TCP Ŭ���̾�Ʈ ���� Ŭ����
 *  Socket : ���� ���ӽ� ���
 *   - �޼���
 *     �� InputStream getInputStream()
 *     �� OutputStream getOutputStream()
 */
package kr.co.mlec.day20;

import java.net.Socket;

public class ClientTest01 {

	public static void main(String[] args) {
		try{
		// �������� ������ ����
		// localhost, 127.0.0.1, 192.168.0.9
			System.out.println("������ ������ �õ��մϴ�");
			Socket s = new Socket("192.168.0.16",10001);
			System.out.println("���� ����!!! ^^");
		}
		catch(Exception e){
			
		}
	}

}
