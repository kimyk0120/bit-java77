package kr.co.mlec.day13.exam;

import java.util.Calendar;

public class Test01Answer {
	public static void main(String[] args) {
	
		Calendar c = Calendar.getInstance();
		
	System.out.printf("%d�� %2d��\n",c.get(Calendar.YEAR),c.get(Calendar.MONTH)+1); // �߰��� ���ڴ� �ڸ���
	System.out.println("��\t��\tȭ\t��\t��\t��\t��");	
	
	
	// ������ ��¥
	int lastDate = c.getActualMaximum(Calendar.DATE);
	// ���� ���� 1�Ϸ� ������ ���� ������ ����
	c.set(Calendar.DATE, 1);
	int day = c.get(Calendar.DAY_OF_WEEK);
	int nlCnt=0;
	for(int i=1;i<day;i++){
		System.out.print("\t");
		nlCnt++;
	}
	
	for(int i=1;i<=lastDate;i++){
		System.out.print(i+((++nlCnt%7==0)?"\n":"\t"));
	}
	}
}
