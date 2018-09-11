package kr.co.mlec.day09.exam;

class Member {
	String id;
	String password;
	static int count;
	
	// Ŭ���� ���� �ε��� ȣ��Ǵ� static ���� ����
	static {
		System.out.println("Member Ŭ���� ������ Method Area ������ �ε��Ǿ����ϴ�");
	}
	
	Member(){
		System.out.println("������ ȣ��Ǿ����ϴ�");
	}
	
}

public class StaticTest01 {

	public static void main(String[] args) {
		System.out.println("���� �޼��� ���� ����");
		Member m;
		System.out.println("Member Ŭ������ ���");
		// static ���� �ѹ��� ����ȴ�
		m = new Member();
		Member m2 = new Member();
		// m, m2�� ��ü�� �����ߴٰ� MethodArea�� count ���� ��ȯ��Ų��
		// static���� ������ ������ Ŭ���� ������ �����ϴ°��� �Ǵ� ��� �� ����� �߸��� ����
		// �ùٸ� ǥ���� Member.count = 1;
		m.count = 1;
		m2.count = 2;
		
		System.out.println("count : "+Member.count);
		System.out.println("���� �޼��� ���� ����");
	}
}
