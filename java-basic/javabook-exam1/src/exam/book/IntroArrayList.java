package exam.book;

import java.util.ArrayList;

public class IntroArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		/* 데이터의 저장 */
		list.add(new Integer(11));
		list.add(new Integer(22));
		list.add(new Integer(33));
		
		/*데이터의 참조*/
		System.out.println("1차 참조");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));   // 0이 첫번째 
		}

		/*데이터의 삭제*/
		list.remove(0);  //첫번째 데이터 삭제
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
	}

}
