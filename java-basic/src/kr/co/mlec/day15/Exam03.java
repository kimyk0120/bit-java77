/*
 * FileReader
 */


package kr.co.mlec.day15;

import java.io.FileReader;

public class Exam03 {

	public static void main(String[] args) {
		try{
		FileReader fis = new FileReader("src/co/kr/mlec/day06/ArrayTest.java");
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
