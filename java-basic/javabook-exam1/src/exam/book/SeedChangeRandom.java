package exam.book;

import java.util.Random;

public class SeedChangeRandom {

	public static void main(String[] args) {
		
		Random r = new Random(12);
		r.setSeed(System.currentTimeMillis());
		
		for (int i = 0; i < 100; i++) {
			System.out.println(r.nextInt(1000));
		}
		
	}
	
}
