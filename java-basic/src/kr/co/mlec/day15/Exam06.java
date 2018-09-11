/*
 * ī�� ���α׷� �����
 *  - ������ ���� (Penguins.jpg)�� �о Penguins1.jpg�� �����ϴ� ���α׷� �ۼ�
 *  - ȭ�鿡 ���� �ϷῩ�θ� ���
 *    ��) ���� ���簡 �Ϸ�Ǿ����ϴ�
 */
package kr.co.mlec.day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam06 {

	public static void main(String[] args){
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try{
			fis=new FileInputStream("data/Calendar1.avi");
			fos=new FileOutputStream("data/Calendar2.avi");
			
			
			long s = System.currentTimeMillis();
			
			while(true){
				int c = fis.read();
				if(c==-1)break;
				fos.write(c);
			}
			long e = System.currentTimeMillis();
			double time = (e - s)/1000d;
			System.out.println("���� ���� �ð� : "+time+"��");
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
