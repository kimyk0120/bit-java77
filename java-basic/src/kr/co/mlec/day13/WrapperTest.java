/*
 * �⺻���� ���� ��ü Ÿ��
 * --------------------------
 * byte Byte
 * short Short
 * int Integer
 * long Long
 * float Float
 * double Double
 * boolean Boolean
 * char Character
 * --------------------------
 */



package kr.co.mlec.day13;

public class WrapperTest {

	private static void call(Object o){
		
	}
	
	public static void main(String[] args) {
		
		// 1.4�������� ����ϴ� ���
		int i = 100;
		// int�� ����Ŭ���� Ÿ�� ��ȯ
		Integer iObj = new Integer(i);
		call(iObj);
	
		call(i); // new Integer(i)
		
		// boolean�� ����Ŭ���� Ÿ�� ��ȯ
		boolean flag = false;
		Boolean bObj = new Boolean(flag);
		call(bObj);

		// 1.5�������� ���
		// AutoBoxing   : �⺻��->������ �ڵ����� ����
		// AutoUnboxing : ������->�⺻�� �ڵ����� ����
		
		int i2 = 100;
		Integer iObj2 = i2;
		call(iObj2);
		int i3 = iObj2;
		
		call(i2);
		
	}
}
