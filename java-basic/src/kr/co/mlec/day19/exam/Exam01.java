/*
* ������� > 
* ������ �ּҸ� �Է��ϼ��� : http://www.naver.com
* ������ �ּҴ� www�� �����ؾ� �մϴ�.
* 
* ������ �ּҸ� �Է��ϼ��� : www.naver.com
* www.naver.com ���� ����ϴ� �ּ�����
* ---------------------------------------
* 220.189.20.111 
* 220.189.20.64 
* ---------------------------------------
* 
* ������ �ּҸ� �Է��ϼ��� : www.aidfjeijf.com
* �������� �ʴ� ������ �ּ� �Դϴ�.
* 
* ������ �ּҸ� �Է��ϼ��� : quit
* ���α׷��� �����մϴ�.
* 
* ������ �ּҰ� ���� ��� ���� �߻�
*/

package kr.co.mlec.day19.exam;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Exam01 {
public static void main(String[] args) {
	while(true){
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �ּҸ� �Է��ϼ���.");
		String s = sc.nextLine();
		if(s.startsWith("www")){
	InetAddress[] addrs;
	try {
		addrs = InetAddress.getAllByName(s);
		System.out.println(s+"���� ����ϴ� �ּ� ����");
		System.out.println("---------------");
		for(InetAddress addr : addrs){
			System.out.println(addr.getHostAddress());
	}
		System.out.println("---------------");
	}catch (UnknownHostException e) {
		System.out.println("�������� �ʴ� ������ �ּ��Դϴ�.");
	}}
		else if(s.equalsIgnoreCase("quit")){
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
		}
		else{
			System.out.println("������ �ּҴ� www�� �����ؾ� �մϴ�.");
		}
	
	}
}
}
