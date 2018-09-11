/*
 * 	close ����
 * 	- 1.7 �������� try~catch �� ���ؼ� �ڵ� close()�� ����
 *  BufferedReader
 *  - String ReadLine() : �ٴ����� �д� �޼���, �ٳѱ� ������ ����
 *  					  null (���ڿ��� ���� ��Ÿ��)
 */



package kr.co.mlec.day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Exam10 {

	public static void main(String[] args) {
		// ���� ���縦 ���� ��Ʈ�� ����
//		FileReader fis = null;
//		FileWriter fos = null;
		
		// �ӵ� ����� ���� ���۸� Ȱ���� Ŭ���� ����
//		BufferedReader bis = null;
//		BufferedWriter bos = null;
		
//		BufferedWriter
//		=
		
		
		// �ڵ� close
		try(
				// ������ �а� ���� ���� ��Ʈ�� ����
				FileReader fis = new FileReader("data/ioexam10.txt");
				FileWriter fos = new FileWriter("data/ioexam10copy.txt");
				
				// ���� ��Ʈ�� Ŭ������ �ӵ��� ������ ������
				// �ӵ� ����� ���� Buffered Ŭ���� Ȱ��
				
				BufferedReader bis = new BufferedReader(fis);
				BufferedWriter bos = new BufferedWriter(fos);
				){
			
			
			while(true){
				String ch = bis.readLine();
				if(ch==null)break;
				bos.write(ch);
			}
			System.out.println("���� ���簡 �Ϸ�Ǿ����ϴ�");
			
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
