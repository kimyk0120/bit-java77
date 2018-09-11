package exam.book;

class ShowThread extends Thread {

	String threadName;

	public ShowThread(String name) {
		threadName = name; 
	}

	// 오버라이딩 like main
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println( threadName );
			try {

				sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}

public class ThreadUnderstand extends Thread {

	public static void main(String[] args) {
		ShowThread st1 = new ShowThread("Thread -- 1");
		ShowThread st2 = new ShowThread("Thread -- 2 ");
		st1.start();
		st2.start();
	}

}
