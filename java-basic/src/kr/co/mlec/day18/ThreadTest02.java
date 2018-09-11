/*
 * Runnable Ȱ��
 * 
 * Thread(Runnable) �����ڸ� �̿���
 * ������ ������� �����ϱ� ���� start() �޼��尡 �ʿ���
 * ��� : Thread ��ü�� �ʿ���
 * 
 */


package kr.co.mlec.day18;

class LowerThread implements Runnable{

	@Override
	public void run() {
		for(int i = 1;i<=4;i++){
			for(char c = 'a' ; c<='z'; c++){
				System.out.print(c + "  ");
			}
			System.out.println();
		}
	}
	
}


public class ThreadTest02 {
	private static void doWork(){
		for(int i = 1;i<=4;i++){
			for(int c = 1 ; c<= 26; c++){
				System.out.print(c + "  ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	
	System.out.println("main ������ ����");
	
	Runnable r = new LowerThread();
	
	Thread t = new Thread(r);
	
	t.start(); // JVM�� �������� run �޼��带 ȣ���Ź
	
	doWork();
	
	System.out.println("main ������ ����");
}
}
