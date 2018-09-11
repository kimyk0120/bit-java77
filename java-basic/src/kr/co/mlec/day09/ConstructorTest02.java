package kr.co.mlec.day09;

// ���� ��
// ������� �̸��� ���������̰� ���̴� 0���Դϴ�
// ������� �̸��� �����̰� ���̴� 7���Դϴ�
// ������� �̸��� �����̰� ���̴� 0���Դϴ�
class Cat{
	String name;
	int age;
	
	void info(){
			System.out.println("������� �̸��� "+name+"�̰� ���̴� "+age+"���Դϴ�");
	}
	
	Cat(){
		// ������ �������� ȣ�� �����ϴ�
		this("��������",0); // �ش� �Ű������� ����ִ� �����ڸ� �θ��� this.name this.age��
						 // �ݺ��� �ʿ� ����, �׻� ������ ������ �� ���� ��ġ�Ѵ�
	}
	Cat(String name,int age){
		this.name = name;
		this.age = age;
	}
	Cat(String name){
		this(name,0);
	}
	
}

public class ConstructorTest02 {

	public static void main(String[] args) {

		Cat c = new Cat();
		Cat c2 = new Cat("����",7);
		Cat c3 = new Cat("����");
		
		c.info();
		c2.info();
		c3.info();
	}

}
