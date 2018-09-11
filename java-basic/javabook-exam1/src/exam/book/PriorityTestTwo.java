package exam.book;

class MessageSendingThread2 extends Thread {

	String message;

	public MessageSendingThread2(String str, int prio) {
		message = str;
		setPriority(prio);
	}

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			System.out.println(message + "(" + getPriority() + ")");
			try {
				
				sleep(1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class PriorityTestTwo {
	public static void main(String[] args) {
		MessageSendingThread2 tr1 = new MessageSendingThread2("First", Thread.MAX_PRIORITY);
		MessageSendingThread2 tr2 = new MessageSendingThread2("second", Thread.NORM_PRIORITY);
		MessageSendingThread2 tr3 = new MessageSendingThread2("Third", Thread.MIN_PRIORITY);
		
		tr1.start();
		tr2.start();
		tr3.start();
		
	}

}
