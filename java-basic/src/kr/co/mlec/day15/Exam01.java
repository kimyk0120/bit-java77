package kr.co.mlec.day15;

import java.io.InputStream;
import java.io.InputStreamReader;

public class Exam01 {
	public static void main(String[] args) {
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		System.out.print("�Է� : ");
		try{
		while(true){
			int ch = isr.read();
			System.out.print((char)ch); // �������� r �������� n ���Ͱ��� �߰�
		}
			
			
			/*
		int ch = in.read();
		System.out.println("���� �� : "+ch);
		ch = in.read();
		System.out.println("���� �� : "+ch);
		ch = in.read();
		System.out.println("���� �� : "+ch);
		*/
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
