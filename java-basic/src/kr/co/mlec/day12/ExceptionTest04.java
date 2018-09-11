package kr.co.mlec.day12;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest04 {

	public static void main(String[] args) {
		
		try {
		
		// FileNotFoundException
		System.out.println(1);
		FileReader fr = new FileReader("data/a.txt");
		
		// ArithmeticException
		System.out.println(1/0);
		System.out.println(3);

		// ArrayIndexOutOfBoundsException
		int [] arr = new int[1];
		arr[1] = 1;
		
		}
		// catch���� ������°��� �����ϰ��� jdk 7 �������� ����
		catch (FileNotFoundException|ArrayIndexOutOfBoundsException|ArithmeticException fnfe){
			// ���� Ȯ�ν� �ַ� ����ϴ� �޼���
			// String(��ȯŸ��) getMessage() : ������ ���� �޽����� �Ѱ��ش�
			String errMsg = fnfe.getMessage();
			System.out.println("���� �޽��� : "+errMsg);
			// ������ �߻��� ��ġ�� �������ش�
			fnfe.printStackTrace(); // MethodArea,Stacks,Heap �߿� Stacks�� ��ġ�� ����
		}
		catch(Exception e){ 
			e.printStackTrace();
		}
		System.out.println(2);
		
	}

}
