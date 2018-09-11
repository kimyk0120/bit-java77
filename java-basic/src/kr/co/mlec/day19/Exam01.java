/*
 * IP ���� Ŭ����
 * 
 * InetAddress
 */

package kr.co.mlec.day19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Exam01 {

	public static void main(String[] args) {
		// ���� ����ϴ� ��ǻ���� �ּ� ���� ����
		try {
			// Ư�� �������ּҸ� ���ؼ� �ּ� ������ ���
//			InetAddress addr = InetAddress.getByName("www.naver.com");
//			System.out.println(addr);
			
			InetAddress [] addrs = InetAddress.getAllByName("www.daum.net");
			for(InetAddress addr : addrs){
				System.out.println(addr);
			}
				
			
			/*
			InetAddress local = 
					InetAddress.getLocalHost();
			System.out.println(local); // local.toString() ��ü�� �׳� ȣ���ϸ� toString
			System.out.println(local.getHostAddress());
			*/
		} catch (UnknownHostException e) {
			// TODO �ڵ� ������ catch ���
			e.printStackTrace();
		} // �ڱ⸦ ��Ÿ���� ����ȣ��Ʈ
	}
}
