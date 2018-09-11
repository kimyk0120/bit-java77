/*
 * TCP ���� �̿�
 * - ServerSocket : Server ���� Ŭ����
 * - �޼���
 * 	 �� accept() : Ŭ���̾�Ʈ�� ��û�� ���� ���
 * 
 */


package kr.co.mlec.day20;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest01 {
	public static void main(String[] args) {
		try {
		// ���� ���� : Ŭ���̾�Ʈ�� ������ �� 10001 �� ��Ʈ�� ����
		ServerSocket server = new ServerSocket(10001);
		
		System.out.println("���� ���� �� Ŭ���̾�Ʈ�� ��û�� �����");
		// Ŭ���̾�Ʈ�� ��û�� ���� ���
		// ������ ��û�� Ŭ���̾�Ʈ ������ ��� �ִ� ���� ��ü ��ȯ
		while(true){
		Socket client = server.accept();
		System.out.println("client : " + client); // toString���� ��ü�� ���
		}
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		}
}
