package basic2;

import java.util.Random;

public class MemberController implements Controller{

	@Override
	public void execute() throws Exception {
		
		long s = System.currentTimeMillis();		
		
		Random r = new Random();
		for (int i = 1; i < 100 ; i++) {
			int num = r.nextInt(100)+1;
			Thread.sleep(num);
		}

		double time = (System.currentTimeMillis() - s) / 1000;
		System.out.println("MemberController ����Ϸ�");
		System.out.println("MemberController ����ó���ð� : " + time + "��");

	}

}
