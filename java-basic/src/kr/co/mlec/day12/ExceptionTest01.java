package kr.co.mlec.day12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;

public class ExceptionTest01 {
	public static void main(String[] args) {
		// ���ܴ� ������ ������ ���� �������� ���� �� �ְ�
		// ���ܰ� �߻��ϰ� �Ǹ� JVM�� �ش� ���ܿ� ���õ�
		// ���� Ŭ���� ��ü�� ã�� ���� ��ü�� ������ ��
		// �˷��ش�
		
		// ������ ���� ���� : ��Ŭ���� ������ �ҽ� �ۼ��� �ڵ� ������ �Ǳ� ������
		//              �ҽ� �ۼ��� ���� �߻� ���θ� �� �� �ִ�
		//              �ݵ�� ���� ó���� �ؾ߸� ���α׷��� ������ �� �ִ�
		// CheckedException(������ ����)
		try {
			FileReader fr = new FileReader("a.txt");
		} catch (FileNotFoundException e) {
			// TODO �ڵ� ������ catch ���
			System.out.println("a.txt ������ ��� ���ܰ� �߻�����...");
			e.printStackTrace();
		}
			
		// RuntimeException�� ���� Ŭ���� NullPointerException �׽�Ʈ
		String str = "Hello";
		str = null;
		System.out.println("���ڿ��� ���� : "+str.length());
		
		
		Random r = new Random();
		int num = r.nextInt(3); // 0���� 2����
		System.out.println("������ ���� : "+num);
		// ���� ���� �߻� ���� : �ڵ带 ���� �������� �߻���
		//                �ʿ信 ���� ����ó���� ������
		// UnCheckedException(���� ����)
		System.out.println("������ ������ ������ : "+10/num);
		
	}
}
