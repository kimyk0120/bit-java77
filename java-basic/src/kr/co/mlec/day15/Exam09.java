/*
 * �ӵ� ��� ���� : buffer - ����ڰ� �迭�� ����
 * 
 * API���� �����ϴ� ���۸� Ȱ���� Ŭ������ ���
 * BufferedInputStream
 * BufferedOutputStream
 * 
 * BufferedReader
 * BufferedWriter
 */



package kr.co.mlec.day15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam09 {

	public static void main(String[] args) {
		// ���� ���縦 ���� ��Ʈ�� ����
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		// �ӵ� ����� ���� ���۸� Ȱ���� Ŭ���� ����
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try{
			
			// ������ �а� ���� ���� ��Ʈ�� ����
			fis = new FileInputStream("data/ioexam08.txt");
			fos = new FileOutputStream("data/ioexam08copy.txt");
			
			// ���� ��Ʈ�� Ŭ������ �ӵ��� ������ ������
			// �ӵ� ����� ���� Buffered Ŭ���� Ȱ��
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			while(true){
				int ch = bis.read();
				if(ch==-1)break;
				bos.write(ch);
			}
			System.out.println("���� ���簡 �Ϸ�Ǿ����ϴ�");
			
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			if(bis!=null){
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(bos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
