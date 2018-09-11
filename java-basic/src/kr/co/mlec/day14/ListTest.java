package kr.co.mlec.day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListTest {
	public static void main(String [] args){
//		LinkedList<String> list = new LinkedList<>(); // ������ �������� �˻��� ������
		ArrayList<String> list = new ArrayList<>(); // �˻��� �������� ������ ������
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		list.remove("b");
		System.out.println(list); // list.toString()
		
		
		System.out.println("����Ʈ�� ��� ��� ����");
		list.clear();
		System.out.println(list.size());
		
		boolean result = list.isEmpty();
		System.out.println(result?"�������":"�������");
		
		if(list.contains("c")){
			System.out.println("C ��� ����");
		}
		
		else {
			System.out.println("C ��� ����");
		}
		
		// ��� ��ġ ã��, ����Ʈ���� b��� ���ڿ��� ���° ��ġ�� �ֽ��ϱ�? ��ã���� -1 ��ȯ 
//		int index = list.indexOf("b"); 
		int index = list.indexOf("e");
		System.out.println("e ����� ��ġ : "+index);
		
		// ����Ʈ�� ��� ���
		// Iterator ��ȯ�� Ȱ�� ó������ ������ ��� ��ȯ
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()){
			String data = ite.next();
			System.out.println("ite -> "+data);
		}
		
		// 1.5����
		for(String s : list ){
			System.out.println(s);
		}
		
		
		// 1.4����
		for(int i = 0;i<list.size();i++){
			String data = list.get(i);
			System.out.println(data);
		}
		
		
		
		/*
		for(int i=0;i<list.size();i++){
			String data = list.get(i);
			System.out.println(data);
		}
		
		list.remove(1);
		for(int i=0;i<list.size();i++){
			String data = list.get(i);
			System.out.println(data);
		}
		*/
	}
}
