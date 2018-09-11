package kr.co.mlec.day12;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest02 {

	public static void main(String[] args) {
		// try : ���ܹ߻� �ڵ带 ���� ����
		// catch : try ������ ���ܰ� �߻��� ��� �߻��� ���ܿ� ���� ó���� ����
		// 		    �޼���ó�� �Ű������� ������
		//         �Ű����� Ÿ������ ����Ǵ� ���� try���� �߻��� ����Ŭ���� Ÿ���� �����
		
		try {
		
			int [] arr = new int[1];
			
			arr[1] = 1;
			
			System.out.println(1);
			// FileNotFoundException
			// data/a.txt ������ �������
			// 1. ����� JVM�� ������ ���� �Ͱ� ������ ����Ŭ������ ã�´�
			// 2. FileNotFoundException ��ü�� �����Ѵ�
			// 3. ������ ���� ��ü�� ó���� catch ���� ã�´�
			// 4. ó���� catch ���� �����ϸ� �ش� ������ ������ ���ܰ�ü�� �ѱ��
			// 
			// new FileNotFoundException(..);
			
		FileReader fr = new FileReader("data/a.txt");
		
			// new ArimeticException(..);
			// ����, ó���� catch ���� �������� ������ JVM �⺻ ����ó���Ⱑ ����ȴ�
			// ���α׷��� ������������ �����
		System.out.println(1/0);
		
		}
		catch (FileNotFoundException fnfe){
		// �����ڰ� �ۼ��ϴ� ���� ó�� �ڵ�
			System.out.println("a.txt ������ �������� �ʽ��ϴ�.");
		}
		catch (ArithmeticException ae){
			// �����ڰ� �ۼ��ϴ� ���� ó�� �ڵ�
				System.out.println(5);
			}
		catch (ArrayIndexOutOfBoundsException aioobe){
			System.out.println("ArrayIndexOutOfBoundsException�� �߻��Ͽ����ϴ�.");
		}
		catch(Exception e){ // ���� ���� �ø��� �ؿ� �ִ� ���ܴ� ������ �����ϱ� ������ ���
			                // �������� ������ ��� ���ܹ��� ������ �����Ƿ� ����
			System.out.println(7);
		}
		System.out.println(2);
		
	}

}
