package kr.co.mlec.day06.exam;

import java.util.Scanner;

class Student{
String name;
int age;
int isMajor;
int gender;
}

public class Exam02 {
	

	public static void main (String [] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("�л� ������ �Է��ϼ���");
	int cnt = 0;
	
	Student [] list = new Student [20];

	while(true){
	Student s3 = new Student();
	
	System.out.print("�̸� : ");
	s3.name = sc.next();
	System.out.print("���� : ");
	s3.age = sc.nextInt();
	System.out.print("����(1.����, 2.������) : ");
	s3.isMajor = sc.nextInt();
	System.out.print("����(1.����, 2.����) : ");
	s3.gender = sc.nextInt();
	
	list[cnt++] = s3;
	
	System.out.print("��� �Ͻðڽ��ϱ�? (Y.���, N.����): ");
	if(sc.next().equals("N")){
	break;
		}
	}
	
	System.out.println("�� �л����� "+cnt+"�� �Դϴ�.");
	for(int i=0;i<cnt;i++){
	Student s = list[i];
	System.out.println(s.name+"\t"+s.age+"\t"+(s.isMajor==1?"����":"������")+"\t"+(s.gender==1?"����":"����"));
}
}


	}



