package kr.co.mlec.day14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		// �ε��� ���� ����, �ߺ��� ���� �ʴ´�
		HashSet<String> set = new HashSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		
		System.out.println("ũ�� : "+set.size());
		// set�� ��ġ �������� �ʱ� ������ index ������ �Ұ���
		set.remove("b");

		// �ߺ������ ���� �ʱ� ������ d��Ҵ� �߰����� �ʴ´�
		set.add("d");
		set.add("e");
		System.out.println("ũ�� : "+set.size());
		
		boolean result = set.isEmpty();
		System.out.println(result?"��� �������":"��Ұ� ������");
		
		set.clear();
		System.out.println("��ü ���� �� ũ�� "+set.size());
		
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		// ��� ��� ��� 
		for(String s : set){
			System.out.println(s);
		}
		// ======================================
		
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()){
			String s = ite.next();
			System.out.println(s);
		}
		
		// Set ��Ҹ� �迭�� ���
		Object [] oArr = set.toArray();
		System.out.println(Arrays.toString(oArr));
		// ����ȯ�� ������Ѵ�
		/*
		for(Object obj : oArr){
			String s = (String)obj;
			System.out.println(s);
		}*/
		// sArr �迭�� set�� ������ ��
		String[] sArr = new String[set.size()];
		set.toArray(sArr);
		// rArr �迭�� set�� ������ ��
		String[] rArr = set.toArray(new String[set.size()]);
		for(String s : rArr){
			System.out.println(s);
		}
	
	}
}