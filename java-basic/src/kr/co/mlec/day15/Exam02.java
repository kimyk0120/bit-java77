/*
 * FileInputStream
 */


package kr.co.mlec.day15;

import java.io.FileInputStream;

public class Exam02 {

	public static void main(String[] args) {
		try{
		FileInputStream fis = new FileInputStream("src/co/kr/mlec/day06/ArrayTest.java");
		// read() ���� ���ڿ� ���� �ƽ�Ű�ڵ带 ��ȯ
		// ��, ���� ������ ���� ���(��Ʈ�� ���� ���) -1�� ��ȯ��
		while(true){
			
		int ch = fis.read();
		// ��Ʈ�� ��
		if(ch==-1)break;
		System.out.print((char)ch);
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
