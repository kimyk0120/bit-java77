/*
 * FileWriter : ���Ͽ� ����ϴ� ��Ʈ��(����)
 * write(int ch)
 * close() : ��Ʈ���� ������ ���, ���������� flush()�� ȣ��
 * flush() : ���ۿ� �ִ� ������ ������ ��������
 */
package kr.co.mlec.day15;

import java.io.FileWriter;
import java.io.IOException;

public class Exam05 {

	public static void main(String[] args) {
		// ������ �����ϸ� ����� ������ ���ٸ� ���Ӱ� �����ؼ� ���
		// ���Ͽ� ������ �߰��ϰ� �ʹٸ� ��ü ������ append �ɼǿ� true�� ����
		FileWriter fw = null; 
		try {
//					new FileOutputStream("data/ioexam04.txt");
					fw = new FileWriter("data/ioexam05.txt",true);
			int ch = 'c';
			
			fw.write(97); // write �޼ҵ�� int�� �������� ���� �ִ�
			fw.write('b');
			fw.write(ch);
			
			System.out.println("���Ͽ� ������ ����߽��ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			// ��Ʈ�� �ݱ�
			if(fw!=null){
			try {
				fw.close(); // ���Ͽ� ������ �� �ö���� close()�� �� �ٿ�����Ѵ�
			} catch (IOException e) {
				// TODO �ڵ� ������ catch ���
				e.printStackTrace();
				}
			}
		}
	
	}

}
