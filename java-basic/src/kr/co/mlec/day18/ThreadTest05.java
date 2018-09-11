/*
 * join : �ٸ� �����带 ��ٸ���(������ �ð���, ����)
 * 
 * join(long) : ������ �ð��� ��ٸ���
 * join() : ���� ��ٸ���
 */

package kr.co.mlec.day18;

class Girl extends Thread {
	public void run(){
		try {
			System.out.println("��ģ : ��ģ ��ȭ�ؼ� ������");
			System.out.println("��ģ : ��ģ�� ��� ������ �������� �γ��� �׽�Ʈ");
			System.out.println("��ģ : 10�� �� ��ٸ��� ������ſ���");
			for(int i = 1;i<=10;i++){
				Thread.sleep(1000);
				
				System.out.println(i+"�� ������");
			}
			Thread.sleep(1000);
			System.out.println("��ģ : ��ģ�� ���׿�");
			System.out.println("��ģ : ���̹��� �߰�~~");
			
		} catch (InterruptedException e) {
			// TODO �ڵ� ������ catch ���
			e.printStackTrace();
		}
	}
}

class Boy extends Thread {
	private void sleep(int time){
		try {
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			// TODO �ڵ� ������ catch ���
			e.printStackTrace();
		}
	}
	
	public void run() {
		System.out.println("��ģ : ��ȭ�� ����");
		sleep(1);
		System.out.println("��ģ : ��ȭǥ 2�� ����");
		sleep(1);
		System.out.println("��ģ : ��ģ �������� �ʾ���");
		sleep(1);
		System.out.println("��ģ : ��ģ ��ٸ�(�� �γ��� 3��)");
		Girl g = new Girl();
		g.start();
		try {
//			g.join(); // g ������ ��ü�� ����ɶ����� �����
			g.join(3000); // g ������ ��ü�� 3�ʵ��� ��ٸ���
		} catch (InterruptedException e) {
			// TODO �ڵ� ������ catch ���
			e.printStackTrace();
		} 
		sleep(1);
		System.out.println("��ģ : ��ģ �� ����, ��ȭ ȥ�ڼ� ��");
	}
}

public class ThreadTest05 {
	public static void main(String[] args) {
		// ��ģ ������ ����
		Boy b = new Boy();
		b.start();
	}
}
