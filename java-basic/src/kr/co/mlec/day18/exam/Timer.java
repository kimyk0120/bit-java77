package kr.co.mlec.day18.exam;

public class Timer extends Thread{
	private int time;
	
	public Timer(int time){
		this.time = time;
	}
	/*
	 * 20�� ���ҽ��ϴ�.
	 * 10�� ���ҽ��ϴ�.
	 * 3�� ���ҽ��ϴ�.
	 * 2�� ���ҽ��ϴ�.
	 * 1�� ���ҽ��ϴ�.
	 * ����Ǿ����ϴ�.
	 */
	
	public void run(){
		for(int i=time;i>0;i--){
			if((i<30&&i%10==0) || i<4){
		System.out.println(i+"�� ���ҽ��ϴ�.");}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO �ڵ� ������ catch ���
			e.printStackTrace();
		}
		}
		System.out.println("����Ǿ����ϴ�");
	}
}
