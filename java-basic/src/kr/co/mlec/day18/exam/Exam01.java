package kr.co.mlec.day18.exam;

class Animal {}
/* �̹� �ٸ� Ŭ������ ��ӹް� ���� ���� Thread Ŭ������ ����� �Ұ���(���ϻ��)
 * �̷� ��� Runnable �������̽��� �̿�
class Dog extends Animal{
	
}
*/

class Eyes extends Thread{
	public void run(){
		for(int i=1;i<=100;i++){
			System.out.println(i+"��° ���� ���̴� �۾��Դϴ�");
		}
	}
	
}

class Lips extends Thread{
	public void run(){
		for(int i=1;i<=100;i++){
			System.out.println(i+"��° ���� ���̴� �۾��Դϴ�");
		}
	}
}
class Nose extends Thread{
	public void run(){
	for(int i=1;i<=100;i++){
		System.out.println(i+"��° �ڸ� ���̴� �۾��Դϴ�");
		
	}
}
}
public class Exam01 {

	
	public static void main(String[] args) {

		Thread e = new Eyes();
		Thread l = new Lips();
		Thread n = new Nose();
		
		n.start();
		e.start();
		l.start();
		
	}

}
