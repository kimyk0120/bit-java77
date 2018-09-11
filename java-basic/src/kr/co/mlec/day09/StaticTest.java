package kr.co.mlec.day09;

class Member {
	String id;
	String password;
	static int count;

	// Ŭ���� ���� �ε��� ȣ��Ǵ� static ����� �����Ѵ�.
	static {
		System.out.println("Memeber Ŭ���� ������ Method Area ������ �ε���");
	}

	Member() {
		System.out.println("������ ȣ���");
	}
}

public class StaticTest {
	public static void main(String[] args) {
		System.out.println("���� �޼��� ���� ����");
		Member m;
		System.out.println("Member Ŭ������ ���");

		m = new Member();
		Member m2 = new Member();

		// �߸��� ����
		// m.count = 1; --> Member.count = 1;
		// m2.count = 2;

		System.out.println("count : " + Member.count);
		System.out.println("���� �޼��� ���� ����");

	}
}
