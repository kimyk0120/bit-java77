package kr.co.mlec.day15.exam;

import java.io.InputStream;
import java.io.InputStreamReader;

public class Exam03 {

	public static void main(String[] args) {
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		
		try{
		while(true){
			System.out.print("�Է� : ");
			int ch = (char)isr.read();
			isr.read();
			isr.read();
			
			if(Character.toUpperCase(ch)=='Q'){
				System.out.println("�����մϴ�.");
				break;
			}
			System.out.println("�Էµ� ���ڴ� "+(char)ch+"�Դϴ�");
		}
	}
		catch(Exception e){
			e.printStackTrace();
		}

}
}