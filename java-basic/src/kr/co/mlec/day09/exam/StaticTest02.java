package kr.co.mlec.day09.exam;

public class StaticTest02 {
	
	int i = 100;
	static int j = 200;
	
	void test(){
		System.out.println(i);
		System.out.println(j);
	}
	
	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		StaticTest02 test02 = new StaticTest02();
		// static ���������� (static���� ����� block) static���� ����� �͵鸸
		// ������ �����ϴ�. �� �ν��Ͻ� ���� �Ǵ� �޼��带 �����Ϸ��� �ν��Ͻ� ��ü�� ������ ��
		// ������ ��ü ������ �����ؾ� �Ѵ�
		System.out.println(test02.i);
	}

}
