package kr.co.mlec.day06;

import java.util.Scanner; // ������ �ͼ����������� ���� Ÿ���� �ϴ� ������ �߿�
import java.util.Random;

public class ConditionTest {

	/*
	 * �޼��� �ȿ� ����Ǵ� ����
	 * ��������, ���ú���
	 * �ڵ� �ʱ�ȭ�� �߻����� �ʴ´�
	 * ����� ������ ����ϱ� ���� ���� �ݵ�� �ʱ�ȭ�ϴ� �κ��� �־�� �Ѵ�
	 */
	
	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		Scanner sc = new Scanner(System.in); // �������� ����ڰ� ���� ������ִ�
		// java.util�� ����ִ� �������� ���� �����Ҷ� new�� �����Ѵ� 
		System.out.print("���� �Է��ϼ��� : "); // println�� �ٳѱ�� Ŀ���� ��������
		int num = sc.nextInt();
		
		System.out.print("���� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		int result;
		
		if(num==num2){
			result = 1; // ���ǿ� ���� �޶����� �κ��� ���� ��°��� ���Ѵ�
		}
		else {
			result = 0;
		}
		System.out.println("��°��� "+result);
		
		
//		ConditionTest ct = new ConditionTest(); // ������ ������ش�
//		Random r = new Random(); // ���� ����� �Լ� �����̶�� Ŭ������ �����Ѵ� API�̴� JDK�� ��ġ�ɶ� ����´�
//		// ����� ���ؼ� new�� �������ش�
		
		System.out.print("���� �Է��ϼ��� : ");
		int month = sc.nextInt();
		
		
		String s; // �ڹٴ� ���� ������ ������ ���� �־����� �ʴ´� null�� �� �־��ָ� default���� Ȯ���� ���� �־��ش�
		
		switch (month){ // switch (���ذ�)
		case 12: //break�� ������ ������ ������ ��������
		case 1:
		case 2:	
			s="�ܿ�";	
			break; // ����� �������ö� ���°� break;
		case 3:
		case 4:
		case 5:
			s="��";
			break; // ����� �������ö� ���°� break;
		default:
			s="���� �Ǵ� ����";
		}
		System.out.println(s+"�Դϴ�."); // �ߺ��Ǵ� �κ��� �ϳ��� ���°��� ����
		
		int age;
		int i = 12;
		
		if(i>10){
			age = i;
		}
		else{
			age= -1;
		}
		System.out.println(age);
		
	}

}
