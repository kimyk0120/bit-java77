package kr.co.mlec.day14;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class MapTest {
	
	private static HashMap<String, String> makeMap(){
		HashMap<String, String> temp = new HashMap<> ();
		
		Random r = new Random();
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0;i<10;i++){
			char ch = alpha.charAt(r.nextInt(alpha.length()));
			temp.put(String.valueOf(ch), ch+""+i);
		}
		
		return temp;
	}
	
	
	public static void main(String[] args) {
		HashMap<String, String> map = makeMap();
		System.out.println(map);
				
		// �ʿ� �� Ű���� �� ��� ���� �����͸� �����ϴ� ���
		// 1. ���� Ű���� ��� �����´�
		// 2. Ű���� ũ�⸸ŭ �ݺ����鼭 Ű�� �ش��ϴ� ���� ����
		
		Set<String> keys = map.keySet();
		for(String key : keys){
			System.out.print("key : "+key+"\t");
			System.out.print("value : "+map.get(key)+"\n");
		}
		
		/*
		HashMap<String, String> map = new HashMap<> ();
		
		// map.put (K,V) : ������ �Է�
		map.put("name", "��ũ ��ũ����");
		map.put("id", "mark");
		map.put("email", "mark@facebook.com");
		
		// map.get(K) : ������ ����
		String id = map.get("id");
		System.out.println("id : "+id);
		
		// Ű�� �ߺ��� ������� �ʴ´�, �ߺ��� Ű�� ���� �ԷµǸ� ���� ���� �����
		map.put("name","��");
		String name = map.get("name");
		System.out.println(name);
		
		*/
	}

}
