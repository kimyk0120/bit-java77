package kr.co.mlec.day12;

import java.io.FileReader;

public class ExceptionTest03 {

	public static void main(String[] args) {
		try{
			System.out.println(1);
			FileReader fr = new FileReader("data/member.txt");
			System.out.println(2);
			return; // �޼ҵ带 �ߴܽ�Ų��
		}
		catch(Exception e){
			System.out.println(3);
		}
		// �ܺ��ڿ�(�ϵ��ũ ����, �����ͺ��̽� ����, ��Ʈ��ũ ����)�� ���� ���� �۾��� ����� �ַ� ���
		// �ܺ��ڿ� ����(�ݱ� �۾�)
		finally{
			System.out.println(4); // finally�� ������ return���� �߿��ϰ� �����ϰ� �� ó���ϰ� ����
		}
		System.out.println(5); // ������ �κ��� return�� ������ �������� �ʴ´�
		}
	
}
// �������� �ִ� �ڵ�� ��� try�� �����ش� Ư���� ��츸 try�� ���⺸�ٴ� �����ִ� �ڵ�� ���� try��
// �ȿ� �־��ش�(ex: for��)