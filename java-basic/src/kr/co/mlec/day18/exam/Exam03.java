package kr.co.mlec.day18.exam;


public class Exam03 {

	public static void main(String[] args) {
		
		System.out.println("main ������ ����");

		new Thread(){
			public void run(){
				for (int i = 1;i<=100;i++){
					System.out.println("�� ���̱� "+i+"��° �۾�");
				}
			}
		}.start();
		
//		Runnable nRun = new Runnable(){
//			public void run(){
//				for (int i = 1;i<=100;i++){
//					System.out.println("�� ���̱� "+i+"��° �۾�");
//				}
//			}
//		};


		new Thread(new Runnable(){
			public void run(){
				for (int i = 1;i<=100;i++){
					System.out.println("�� ���̱� "+i+"��° �۾�");
				}
			}
		}).start();
		
		
		
	}
}
