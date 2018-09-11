package kr.co.mlec.day10;

class Member {
	private String id;
	private int age;
	
	// Ŭ���� = ���� + �޼���, ���� ������ �Ұ����ϸ� �޼���� �ذ��ؾ��Ѵ�
	// ���� �����ϴ� �޼��� : setter , �޼��� �̸��� set���� ����
	// set�ʵ��
	// ��Ÿó�� �ҹ��ڷ� ���ٰ� ������ ������ �빮�ڷ� ǥ�� (camel ǥ���)
	// �ڵ��Ҷ� ���������ڴ� �� �ݾƳ��� �ϳ��� �����ִ� ���� ����
	
	public void setId(String id){
		this.id = id;
	}
	public void setAge(int age){
		this.age = age;
	}
	// ���� �����ϴ� �޼��� : getter , �޼��� �̸��� get���� ����
	public String getId(){
		return id;
	}
	public int getAge(){
		return age;
	}
	
	
	Member(){}
	
	Member(String id, int age){
		this.id = id;
		if(age<1){
			System.out.println("�߸��� ���̰��� �Է��ϼ̽��ϴ�");
			System.out.println("���̴� 1����� �����մϴ�");
		} else {
		this.age = age;
		}
	}
}

public class PrivateTest {
	public static void main(String[] args) {
		Member m = new Member("hong",-15);
	}
}
