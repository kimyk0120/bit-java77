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

import java.io.FileReader;

public class ExceptionTest06 {

	public static void call() throws Exception{
		try{
		FileReader fr = new FileReader("data/a.txt");
		System.out.println(1/0);
		}
		catch (Exception e){
			System.out.println("������ ������ ������ ���� ���� ĳġ");
		
		// �����ڰ� ���ܸ� ���� �߻���Ų��
		// ���� �߻� Ű���� : throw
		
		throw e; // ���� ó��������� ���ܸ� ó����
		}
		
	}
	
	public static void main(String[] args){
		// call();
		try{
		call();
		}
		catch(Exception e){
			System.out.println("�����ڰ� ó���ϴ� ����ó�� ��ƾ ����");
//			e.printStackTrace();
		}
		
	}
	
}
