package exam.book;

import java.util.ArrayList;

public class IntroArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		/* �������� ���� */
		list.add(new Integer(11));
		list.add(new Integer(22));
		list.add(new Integer(33));
		
		/*�������� ����*/
		System.out.println("1�� ����");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));   // 0�� ù��° 
		}

		/*�������� ����*/
		list.remove(0);  //ù��° ������ ����
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
	}

}
