/*
 * ���� �Է�(���� : -1) : 3
 * ���� �Է�(���� : -1) : 7
 * ���� �Է�(���� : -1) : 2
 * ���� �Է�(���� : -1) : -1
 * 
 * ��� : 12
 */

package kr.co.mlec.day06;

import java.util.Scanner;

public class LoopExam01 {
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		int sum=0;
		
		while(true){
			System.out.print("���� �Է�(���� : -1) : ");
			int num = sc.nextInt();
			
			
			
			if(num==-1) break;
			
			sum+= num; // sum = sum + num;
			
			
		}
		System.out.println("��� : "+sum);
		
	}
	
}
