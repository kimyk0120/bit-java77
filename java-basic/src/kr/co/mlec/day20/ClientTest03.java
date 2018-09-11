/*
 * ������ Ŭ���̾�Ʈ�� �����͸� �ְ� �ޱ�
 * - �������α׷� �ۼ��ϱ�
 */

package kr.co.mlec.day20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest03 {
	public static void main(String[] args) {
		try {
			// ������ ���� �õ�
			Socket s = new Socket("192.168.0.16",10001); // ������ ����°� �켱����
			
			// ȭ�鿡�� �Է�
			Scanner sc = new Scanner(System.in);
			
			// �Է¹��� �޼����� ������ ������ ��� ��ü
			OutputStream out = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			
			// �������� �����۵� �޼����� ���� �Է� ��ü
			InputStream in = s.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			while(true){
				// 1. ȭ�鿡�� �޼����� �Է� �޴´�
				System.out.print("�޼��� : ");
				String msg = sc.nextLine();
				
				// 2. �Է��� �޼����� ������ �����Ѵ�(��� ��ü Ȱ��)
				dos.writeUTF(msg);
				
				if(msg.equals("quit")) break;
				
				
				// 5. �������� �����۵� �޼����� �д´�(�Է� ��ü Ȱ��)
				String echoMsg = dis.readUTF();
				System.out.println("���ڸ޼��� : " + echoMsg);
			
			}
			
		} catch (Exception e) {
		} 
	}
}
