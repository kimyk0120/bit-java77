/*
 * FileOutputStream : ���Ͽ� ����ϴ� ��Ʈ��(����Ʈ)
 * write(int ch)
 */
package kr.co.mlec.day15;

import java.io.FileOutputStream;

public class Exam04 {

	public static void main(String[] args) {
		// ������ �����ϸ� ����� ������ ���ٸ� ���Ӱ� �����ؼ� ���
		// ���Ͽ� ������ �߰��ϰ� �ʹٸ� ��ü ������ append �ɼǿ� true�� ����
		try {
			FileOutputStream fos = 
//					new FileOutputStream("data/ioexam04.txt");
					new FileOutputStream("data/ioexam04.txt",true);
			int ch = 'c';
			
			fos.write(97); // write �޼ҵ�� int�� �������� ���� �ִ�
			fos.write('b');
			fos.write(ch);
			
			System.out.println("���Ͽ� ������ ����߽��ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}

}
