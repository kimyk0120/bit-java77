package kr.co.mlec.day08;

public class StringTest01 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		String s = "a";
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) { // ��ü�� �ڲ� ����� �������÷��� ������ �� ���� ��ü��
											// �ڲ� �����ϹǷ� �ð��� ���� �ɸ���
			s += i;
		}
		long end = System.currentTimeMillis();
		double time = (end - start) / 1000d; // �ڿ� �������� �ٿ��༭ ��Ȯ�� ���� ��´�
		System.out.println("String ���� ��� : " + time);

		start = System.currentTimeMillis(); // ���ڿ��� ���� �� ��쿡�� StringBuffer
		StringBuffer sb = new StringBuffer("a");
		for (int i = 0; i < 100000; i++) {
			sb.append(i);
		}
		end = System.currentTimeMillis();
		time = (end - start) / 1000d; // �ڿ� �������� �ٿ��༭ ��Ȯ�� ���� ��´�
		System.out.println("StringBuffer ���� ��� : " + time);

	}

}
