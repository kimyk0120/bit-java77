/*
 * 	������ ���� : NoN Runnable
 * 	sleep, join, io �����, ����ȭ(Sync)
 */


package kr.co.mlec.day18;

public class ThreadTest04 {
	public static void main(String[] args) {
		System.out.println("2�� ���� sleep ���¿� ���ϴ�");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO �ڵ� ������ catch ���
			e.printStackTrace();
		}
		
		System.out.println("sleep ���¿��� ��������");
		
	}
}
