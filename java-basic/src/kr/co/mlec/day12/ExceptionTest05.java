/*
 * ����ó�����
 *  - throws Ű���带 �޼����� ����ο� ���
 *  - �޼��带 ȣ���ϴ� �ʿ��� ��� ����ó���� �����ؾ� �Ѵ�
 *  
 *  ��Ű��
 *  ����Ʈ
 *  Ŭ���������
 *  Ŭ�����ٵ�
 *    - �����������
 *    - ������
 *    - �Ϲ� ��ɸ޼���
 *    - ���θ޼���
 */

package kr.co.mlec.day12;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest05 {

	public static void call() throws FileNotFoundException{
		FileReader fr = new FileReader("data/a.txt");
	}
	
	public static void main(String[] args){
		
		// call();
		try{
		call();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
	}
	
}
