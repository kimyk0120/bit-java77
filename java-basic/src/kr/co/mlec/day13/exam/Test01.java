package kr.co.mlec.day13.exam;

import java.util.Calendar;

import java.util.Scanner;
public class Test01 {
public static void main(String[] args) {
	
	Calendar c = Calendar.getInstance(); // �ٸ� �ڽ� Ŭ������ �����ؼ� �ش�
	int year = c.get(Calendar.YEAR);
	int month = c.get(Calendar.MONTH);

	while(true){
		
		c.set(Calendar.DATE, 1);
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("\t\t"+year+"�� "+(month+1)+"��");
		int lastDate = c.getActualMaximum(Calendar.DATE);
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		int count = 0;
		for(int i = 1;i<day;i++){
			System.out.print("\t");
			count++;
		}
		for(int i=1;i<=lastDate;i++){
			System.out.print(
                    i+((++count % 7==0? "\n":"\t")));
        }
		
	System.out.println("\n�׸��� �����ϼ���(1.����޺��� 2.�����޺��� 3.�����޺��� 4.����)");
	
	Scanner sc = new Scanner(System.in);
	int i=sc.nextInt();
	switch(i){
	case 1:
		c = Calendar.getInstance();
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH);
		day = c.get(Calendar.DAY_OF_WEEK);
	break;
	case 2:
		if(--month<0){
			--year;
			month=11;
		}
		c.set(year, month, 1);
		break;
	case 3:
		if(++month>11){
			++year;
			month=0;
		}
		c.set(year, month, 1);
		break;
	case 4:
		System.out.println("�޷� ���α׷��� �����մϴ�");
		System.exit(0);
	default:
		break;
		
	
}
}
}
}

