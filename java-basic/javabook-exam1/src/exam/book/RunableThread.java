package exam.book;

class Sum {
	int num;

	public Sum() {
		num = 0;
	}

	public void addNum(int n) {
		num += n;
	}

	public int getNum() {
		return num;
	}

}

class AdderThread extends Sum implements Runnable {

	int start, end;

	public AdderThread(int s, int e) {
		start = s;
		end = e;
	}

	@Override
	public void run() {

		for (int i = start; i <= end; i++) {
			addNum(i);
		}

	}

}

public class RunableThread {
	public static void main(String[] args) {
		
		AdderThread at1 = new AdderThread(1, 50);
		AdderThread at2 = new AdderThread(51, 100);
		
		Thread tr1 = new Thread(at1);
		Thread tr2 = new Thread(at2);
		
		tr1.start();
		tr2.start();
		
		try {
			
			tr1.join();
			tr2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("1~100 Sum : " + (at1.getNum()+at2.getNum()));
		
	}
}
