package exam.book;

import java.util.HashSet;
import java.util.Iterator;

class SimpleNumber {
	int num;

	public SimpleNumber(int n) {
		num = n;
	}
	
	
	public String toString(){
		return String.valueOf(num);
	}
	

}

public class HashSetEqualityOne {

	public static void main(String[] args) {
		
		HashSet<SimpleNumber> hSet = new HashSet<>();
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(20));
		hSet.add(new SimpleNumber(20));
		
		System.out.println("����� ������ �� : " + hSet.size());
		
		Iterator<SimpleNumber> itr = hSet.iterator();
		
		while(itr.hasNext()) System.out.println(itr.next());
		
		
	}

}
