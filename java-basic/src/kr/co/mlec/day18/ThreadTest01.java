/*
 * 	Thread�� Ȱ���ϴ� ���
 * 	1. Thread Ŭ������ ��ӹ޴� ���
 *  2. Runnable �������̽��� ��ӹ޴� ���
 * 
 * 	�����尡 ó���� ��
 * 	- public void run() �޼ҵ忡�� ����
 * 
 *  �⺻������ main �����尡 �ڵ����� ������
 */

package kr.co.mlec.day18;

// ���� �빮�ڸ� ȭ�鿡 ���(4��)
// Thread Ŭ������ ��ӹ޾Ƽ� ���
class UpperThread extends Thread {
	public void run(){ // �θ�� �޼ҵ� ����θ� �Ȱ��� �������ش�(������,�������̵�)
		for(int i = 1;i<=4;i++){
			for(char c = 'A' ; c<='Z'; c++){
				System.out.print(c + "  ");
			}
			System.out.println();
		}
	}
}

public class ThreadTest01 {
	
	private static void doWork(){
		for(int i = 1;i<=4;i++){
			for(int c = 1 ; c<= 26; c++){
				System.out.print(c + "  ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		// main, ut : ����
		
		System.out.println("main ������ ����");
		// ������ ��ü(ut)
//		UpperThread ut = new UpperThread();
		Thread ut = new UpperThread();
		
		// ������ ���� ��Ű��
//		ut.run(); // ���� �����ڰ� ���۽�Ű�� �ȵ�
		
		ut.start(); // JVM�� �������� run �޼��带 ȣ���Ź
		
		doWork();
		
		System.out.println("main ������ ����");

		
		
	}

}
