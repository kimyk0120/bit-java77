// getName() : �������� �̸��� �����´�

package kr.co.mlec.day18.exam;

import java.util.Random;

class CallCenter extends Thread{
	int money; // �� �հ� �ݾ�
	
	
	CallCenter(String name){
		super(name); // Thread(String) : �������� �̸��� ������
	}
	
	public void run(){
		// ������ �ݾ��� ��� : 1000 ~ 10000
		Random r = new Random();
		for(int i=1;i<=10;i++){
			try{
				Thread.sleep(1000);
				
			}
			catch(InterruptedException e){
			}
			money+=(r.nextInt(10)+1)*1000;
			System.out.println(getName() + " ��� �ݾ�("+money+")");
		}
	}
}

public class Exam05 {
	public static void main(String[] args) {
		CallCenter c1 = new CallCenter("1�� : ");
		CallCenter c2 = new CallCenter("2�� : ");
		CallCenter c3 = new CallCenter("3�� : ");
		
		c1.start();
		c2.start();
		c3.start();
		
		try {
			c1.join();
			c2.join();
			c3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int totMoney = c1.money+c2.money+c3.money;
		System.out.println("�� ��� �ݾ� : "+totMoney+"��");
	
	}
}
