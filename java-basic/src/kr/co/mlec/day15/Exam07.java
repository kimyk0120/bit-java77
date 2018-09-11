/*
 * �ӵ��� ��������
 * - �ѹ� ������ ���� ������ ���� �Ѳ����� ���� ���(���� Ȱ��)
 * - ���� ���� ���鶧 �迭�� �̿�
 * - 1024 byte ������
 */
package kr.co.mlec.day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam07 {

	public static void main(String[] args){
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try{
			fis=new FileInputStream("data/ioexam07.txt");
			fos=new FileOutputStream("data/ioexam07copy.txt");
			
			// ���� ���� �����
			// byte ó�� ��Ʈ��(InputStream, OutputStream) : byte �迭
			// char ó�� ��Ʈ��(Reader, Writer) : char �迭
			
			byte[] arr = new byte[5];
			
			while(true){
				int c = fis.read(arr);
				if(c==-1)break;
				
				// arr �迭�� ������ ���, 0��° ��ġ���� c ũ�� ��ŭ ���
				fos.write(arr,0,c);
			}
			
			System.out.println("���� ���簡 �Ϸ�Ǿ����ϴ�");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			if(fis!=null){
				try{
					fis.close();
				}
			catch(Exception e){
				e.printStackTrace();
			}
			}
			if(fos!=null){
				try{
					fos.close();
				}
			catch(Exception e){
				e.printStackTrace();
			}
			}
			
		}
	}

}
