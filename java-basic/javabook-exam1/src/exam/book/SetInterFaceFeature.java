package exam.book;

import java.util.HashSet;
import java.util.Iterator;

public class SetInterFaceFeature {

	public static void main(String[] args) {
		
		HashSet<String> hSet = new HashSet<>();
		hSet.add("FIrst");
		hSet.add("Second");
		hSet.add("Third");
		hSet.add("FIrst");

		System.out.println("저장된 데이터 수  : " + hSet.size());
		
		Iterator<String> itr = hSet.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
	
}
