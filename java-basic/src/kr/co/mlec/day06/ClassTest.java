/*
 * ����� ���� Ÿ�� ����
 * - class�� Ȱ��
 */

package kr.co.mlec.day06;

import java.util.Scanner;

// Ŭ������ ù���ڴ� �׻� �빮�ڷ� �����Ѵ�
class Student{
	String name;
	int age;
	// true : ����, false : ������
	// boolean isMajor = true;
	int major; // 1:����, 2:������
	// char majorYn; // 'Y':����, 'N':������
	// ����
	int gender; // 1:����, 2:����
}

public class ClassTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// �ԷµǴ� �л� ������ ��� ���� �迭�� ����
		// ��, �л� �Է������� �ִ� 20������ ������
		
		Student [] list = new Student[20];
		// �迭�� �ԷµǴ� ��ġ ���� ���� ����
		int loc = 0;
		
		System.out.println("�л� ������ ����մϴ�. ");
		while(true){
			
			Student s2 = new Student();
			
			System.out.print("�̸� : ");
			/* ������ �ѹ��� ���ȴٸ� ������ �������� �ʰ� ó���Ѵ�
			 * String name = sc.next(); // ���ڿ��� ������
			s2.name = name;
			*/
			s2.name = sc.next();
			
			System.out.print("���� : ");
			s2.age = sc.nextInt();
			
			System.out.print("��������(1. ����, 2. ������) : ");
			s2.major = sc.nextInt(); 
			
			System.out.print("����(1. ����, 2. ����) : ");
			s2.gender = sc.nextInt();
			
			// �л� ������ �Է��� �� �� �迭�� �߰�
			
//			list[loc] = s2;
//			loc++;
			list[loc++] = s2;
			
			System.out.print("��� �Է�(Y: �Է�, N: ����) : ");
			String isCon = sc.next();
			if(isCon.equals("N")){
				break;
			}	
		}
		 // loc: ���� �Էµ� �������� ī��Ʈ ���� ��Ÿ��
		System.out.println("---------------------------");
		System.out.println("�� "+loc+"��");
        System.out.println("�̸�\t����\t����\t����");
		System.out.println("---------------------------");
		for(int i = 0 ; i<loc ; i++){
			Student s = list[i];
			System.out.println(
					s.name+"\t"+s.age+"\t"+(s.gender==1?"����":"����")+"\t"+(s.major==1?"����":"������"));
			
		}
		System.out.println("---------------------------");
				
	}

}

// �� ��� �̸�,����,����,����