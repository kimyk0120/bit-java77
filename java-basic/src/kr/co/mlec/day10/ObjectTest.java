package kr.co.mlec.day10;
/*
 * 
 */

import java.util.Random;


class Animal2 {
	
}

// ����, Ŭ���� ���ǽ� ��������� extends�� ������� �ʾҴٸ�
// �����Ϸ��� extends java.lang.Object �� �߰��Ѵ�
class Duck extends Animal2 {
	
}
	
class IceCream{
	String name;
	int price;
	@Override
	public String toString() {
		return "IceCream [name=" + name + ", price=" + price + "]";
	}
	
	// alt + shift + s, s
	/*public String toString(){
		return "IceCream[name="+name+", price = "+ price +"]";
	}
	*/
	
	
}

public class ObjectTest {

	public static void main(String[] args) {
		IceCream ice = new IceCream();
		ice.name = "������";
		ice.price = 1200;
		System.out.println(ice);
		
		Object obj = new Random(); // ����ȯ , ��ĳ����
		int [] arr = {1,2,3};
		System.out.println(arr);
		obj = arr;
		obj = "aaa";
	
		Duck d = new Duck();
		Object obj2 = d;
		
		
		System.out.println(d.toString());
		
		// ��ü���� ��ü�� ����ϰ� �Ǹ� ��ü�� toString() �޼��尡 �ڵ�ȣ���
		System.out.println(d); // d.toString()
		
		Integer iObj = new Integer(100);
		System.out.println(iObj);
		
	}

}
