/*
 * Calendar
 * - �߻�Ŭ����
 * - ��ü ������ �Ұ����ϴ�
 * - Calendar.getInstance();
 */


package kr.co.mlec.day13;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	public static void main(String[] args) {
		
		
//		Calendar c = new Calendar();
		Calendar c = Calendar.getInstance(); // �ٸ� �ڽ� Ŭ������ �����ؼ� �ش�
	
		/*
		System.out.println(c);
		
		//������ ���� : get(int field)
		int year = c.get(Calendar.YEAR);   // c.get(1);
		int month = 1+c.get(Calendar.MONTH); // c.get(2);
		
		int date = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		int day = c.get(Calendar.DAY_OF_WEEK); // 1(��)~7(��)
		
//		System.out.println(year);
//		System.out.println(month);
//		System.out.println(date);
//		System.out.println(hour);
//		System.out.println(min);
//		System.out.println(sec);
//		System.out.println(day);
		
//		Calendar�� ��ü�� Date�� ������ �� ���
		Date d = c.getTime();
		System.out.println(d);
		
//		1970�� �������� ��ȯ
		long time = c.getTimeInMillis();
		Date d2 = new Date(time);
		System.out.println(d2);
		
		*/
		
//		Calendar ��ü�� ��¥ �� �ð� ���� ����
		// ������ ���� �� : 1��(0) ~ 12��(11)
//		c.set(2015,1,1); // 2���� ����
//		System.out.println((c.get(Calendar.MONTH)+1));
		
//		���� ���� 1���� ���� �������� ȭ�鿡 ���
		/*
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		c.set(year, month, 1); // ���� ���� 1�Ϸ� ����
		
		// Ư�� �κ��� �����ϱ� ���� set(int field, int value)
		c.set(Calendar.DATE, 1);
		
		int day = c.get(Calendar.DAY_OF_WEEK);
		String [] days = {"", "��","��","ȭ","��","��","��","��"};
		System.out.println(days[day]+"����");
		
		
		c.set(2015, 0,1);;
		int lastDate = c.getActualMaximum(Calendar.DATE);
		System.out.println(lastDate);

		c.set(2015, 1,1);;
		lastDate = c.getActualMaximum(Calendar.DATE);
		System.out.println(lastDate);
		
		c.set(2015, 2,1);;
		lastDate = c.getActualMaximum(Calendar.DATE);
		System.out.println(lastDate);
		*/
		
		
		
	}
}
