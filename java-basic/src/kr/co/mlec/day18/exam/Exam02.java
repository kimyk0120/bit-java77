package kr.co.mlec.day18.exam;


class EyesInterface implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=100;i++){
			System.out.println(i+"��° ���� ���̴� �۾��Դϴ�");
		}
	}
}
class NoseInterface implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=100;i++){
			System.out.println(i+"��° �ڸ� ���̴� �۾��Դϴ�");
		}
	}
}
class LipsInterface implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=100;i++){
			System.out.println(i+"��° ���� ���̴� �۾��Դϴ�");
		}
	}
}

public class Exam02 {

	public static void main(String[] args) {
		
		System.out.println("main ������ ����");
		
		Runnable e = new EyesInterface();
		Runnable n = new NoseInterface();
		Runnable l = new LipsInterface();
		
		Thread t1 = new Thread(e);
		Thread t2 = new Thread(n);
		Thread t3 = new Thread(l);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
