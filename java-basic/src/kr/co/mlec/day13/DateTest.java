/*
 * Date �ڹٰ� ó�� ������������ �ִ� ���
 * Calendar jdk 1.2�������� ��� ����
 * SimpleDateFormat 
 */


package kr.co.mlec.day13;

import java.util.Date;
public class DateTest {
	public static void main(String[] args) {
//		Date d = new Date(215,10,11); // ������ �ƴ����� ��Ŭ�������� �������� ����
		// ���� �ð� ���� ��������
		Date d = new Date();
		System.out.println(d);
		// �ð��� ���� : 1970.01.01 00:00:00 GMT
		Date d2 = new Date(1000);
		System.out.println(d2);

		// ���� �ð��� �и������� ������ ��ȯ : 1970�� �������� ���� �ð��� ��ȯ
		long time = System.currentTimeMillis();
		System.out.println("time :"+time);
		Date d3 = new Date(time);
		System.out.println(d3);
		
		Date d4 = new Date();
		// �ð� ������ long ������ ��ȯ : 1970�� ���� , ���Ӱ� ����°�
		time = d4.getTime();
		System.out.println("getTime :"+time);
		
		// time ���� �ش��ϴ� ��¥�� ����, ������ �ִ����� �ٲ۴�
		d4.setTime(time);
		System.out.println("setTime :"+d4);
		
	}
	
}
