package kr.co.mlec.day06;

public class VariableTest {
	public static void main(String [] args){
		
		// datatype
		
		// ����
		byte b = 100; // �Ĺݺο� ���� ���δ� 1byte = 8bit = 256 = (-128 ~ 127)
					  // -2^7 ~ 2^7 - 1
		short s = 1; // ���� �߿����� �ʴ�
		int i = 100; // - 2147483647 ~ 2147483647
		long l = 100; // int Ÿ���� ������ ��� ��쿡�� long Ÿ�� ���(giga,tera�� int�� ǥ���ȵ�)
					  // 100L�� ������ ��Ÿ�� �ǹ�
		
		// �Ǽ�
		float f = 1.1f; // float�� �ڿ� �׻� �ҹ���f�� �빮�� F�� �ٿ����Ѵ�.
			  f = 1.1F;	
		double d = 1.1;
		
		// ����
		// ���ڴ� �ƽ�Ű�ڵ�� ��ȯ�ȴ�.
		char c = 'a'; // '' �ȿ��� ������ �ѱ��ڸ�
		System.out.println(c);
			 c = '\u0061'; // �����ڵ�� ����, �����ڵ� �ڿ� 16���� �ִ�ū ���ڴ� ffff
		System.out.println(c);
			 c = 97; // 3���� ������� ��� a�� ��µȴ�
		System.out.println(c);
		
		boolean bool = true;
				bool = false; // true, false
			
		// �⺻��(8����)�� ��� �ҹ��� <-> �⺻���� �ݴ븻�� ������(�빮�ڷ� �����ϴ°��� ������)
		
		int[] iArr; // ������
		
		Byte bObj;
		Short sObj;
		
		// �ڹ� �⺻�� �ٵ��� �߿�
		if (bool){
			
		}
		
	}
}
