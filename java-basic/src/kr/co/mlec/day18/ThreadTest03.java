/*
 * ������ ���� ���
 * - ����Ŭ���� �߿��� �͸�Ŭ������ Ȱ���ϴ� ���
 * - ��ü ���� + Ŭ������ ����
 * - �͸�Ŭ���� ����
 * 	 new Ŭ������[���]() {
 * 		����..
 * 		�޼���..
 * 		}
 * 
 * 	 class Test{
 * 		����
 * 		�޼���..
 * 		} ���� �߰�ȣ �κа� ����
 * 
 * 	 new Thread(){};
 *   
 *   new Runnable(){
 *   	public void run(){
 *   
 *      }
 *   };
 * 	 
 */

package kr.co.mlec.day18;

class Human {
}

class Child extends Human {
	public void play() {
		System.out.println("��ġ�� �ʰ� ���");
	}
}

// class MyThread extends Thread{
// public void run(){
// System.out.println("������ ����");
// }
// }

//class MyRun implements Runnable {
//
//	@Override
//	public void run() {
//		System.out.println("Runnable ����");
//	}
//}

public class ThreadTest03 {
	public static void main(String[] args) {
//		Runnable r = new MyRun();
//		
//		Thread t = new Thread(r);
//		t.start();
		
		// �͸�Ŭ������ ���� : Runnable r = new MyRun();
		
		Runnable r = new Runnable(){
			public void run() {
				System.out.println("Runnable ����");
			}
		};
		Thread t = new Thread(r);
		t.start();
		
		// Thread t = new MyThread();

		// ���� �ڵ带 �͸�Ŭ���� ������� ����
		/*Thread t = new Thread() {
			public void run() {
				System.out.println("������ ����");
			}
		};*/

		// Human h = new Child();

		// Child Ŭ������ ������ �͸�Ŭ������ ����
		// Human h2 = new Human();
		/*
		 * Human h2 = new Human(){ public void play() { System.out.println(
		 * "��ġ�� �ʰ� ���"); } };
		 */
	}
}
