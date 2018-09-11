/*
 * ������
 * 1. ���� ���ϴ� Ÿ�Ը� ��� ���� �� ����
 * 	- ��Ҹ� ��� �κ��� Object �迭�� Ȱ���߱� ������ �������� ������ Ÿ���� ���� �� �ִ�
 * 2. �ڵ��� ����ȯ�� �ؾ��ϱ� ������ ������������
 * 
 * ���� �������� �ذ��ϱ� ���ؼ� JDK1.5 �������� ���ʸ�(Generic) ���� ����
 * ���� : Ŭ������<Ÿ��(�Ķ����)>
 */
package kr.co.mlec.day14;

public class MyGenericTest {

	public static void main(String[] args) {
		// JDK 1.7 Generic <> ǥ�� ��������
		MyGenericList<String> list = new MyGenericList<>(5);
		
		list.add("1"); // String Ÿ�Ը� ���� �� �ִ�
		
		String s = list.get(0); // ����ȯ �ʿ� ���� �ٷ� ���� �� �ִ�
		
		
		/* Generic ��� ��
		MyGenericList list = new MyGenericList(5);
		list.add("a");
		list.add(100);
	
		// SearchUI
		for (int i =0;i<list.size();i++){
			String data = (String)list.get(i);
			System.out.println(i+"��° ��� : "+data);
		}
		*/
	}
	
}
