package kr.co.mlec.day08;

import java.io.UnsupportedEncodingException;
import java.util.Random;

public class StringTest02 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		// ������ : new �������� �� �� ����
		// Ŭ���� �̸��� �����ϴ�

		String str = new String();
		System.out.println("str : " + str);
		byte[] bytes = { 97, 98, 99 }; // byte �迭 97�� �ƽ�Ű �ڵ尪 a 98�� b 99�� c
		String str2 = new String(bytes);
		System.out.println("str2 : " + str2);

		try {
			String str3 = new String(bytes, "utf-8");
			System.out.println("str3 : " + str3);
		} catch (UnsupportedEncodingException e) {
			// TODO �ڵ� ������ catch ���
			e.printStackTrace();
		}

		// String(String another)
		String str4 = new String("abc");
		System.out.println("str4 : " + str4);

		// String(char [] cArr)
		// char [] cArr = {'a','b','c'};
		// String str5 = new String(cArr); // ���ڿ��� ��ȯ

		String str5 = new String(new char[] { 'a', 'b', 'c' });
		System.out.println("str5 : " + str5);

		// String(StringBuffer buffer)
		StringBuffer buffer = new StringBuffer("abc");
		// buffer.append("b");
		// buffer.append("c");
		String str6 = new String(buffer);
		System.out.println("str6 : " + str6);

		Random r = new Random();
		// String str7 = new String(r);
		// System.out.println("str7 :"+str7);

	}

}
