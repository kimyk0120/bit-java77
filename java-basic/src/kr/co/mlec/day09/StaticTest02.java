package kr.co.mlec.day09;

public class StaticTest02 {

	// static int i = 100;
	int i = 100;
	static int j = 200;
	void test(){
		System.out.println(i);
		System.out.println(j);
	}
	
	public static void main(String[] args) {

		StaticTest02 test02 = new StaticTest02();
		// static ���������� static����� �͵鸸 ������ �����ϴ�.
		// �� , �ν��Ͻ� ���� �Ǵ� �޼��带 �����Ϸ���
		// �ν��Ͻ� ��ü�� ������ �� ������ ��ü����?? ���� �����ؾ� �Ѵ�.
		System.out.println(test02.i);

	}
}
