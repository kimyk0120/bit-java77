package kr.co.mlec.day06.exam;

import java.util.Scanner;

public class Exam01Answer {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Scanner sc = new Scanner(System.in);

		System.out.print("����� ���� ���� �Է��ϼ��� : ");
		int row = sc.nextInt();
		
		System.out.print("����� ���� ���� �Է��ϼ��� : ");
		int showColumn = sc.nextInt();
				
		while(row >= 1){
			for(int i = 1; i<= showColumn; i++){
				System.out.print(row%2==1?"<":">");
			}
			
			--row;
			System.out.println();
		}
		
	}

}
