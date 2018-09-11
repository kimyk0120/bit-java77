/*
 * ������
 * 1. �����ε� : �޼����� �̸��� ���� �Ű������� Ÿ�� �Ǵ� ������ �ٸ���
 * 2. �������̵� : �켱 ��� ���迡�� �߻��Ѵ�, �θ�Ŭ������ �޼��� ����θ� �����ϰ�
 * 			     �ڽ�Ŭ�������� �����ϴ� ���� ���Ѵ�
 * 			     �θ�Ŭ������ �޼����� ������ �ڽ�Ŭ���� �����ؼ� ó���ϰ� ������
 * 
 * ��� 
 * 1. extends Ű���带 �̿��ؼ� ����Ѵ�
 * class Ŭ������ extends ����� Ŭ������
 * class Manager extends Employee
 * 2. �θ�, ����, super : Employee
 *    �ڽ�, ����, sub : Manager
 * 3. �θ�Ŭ������ ����Ǿ� �ִ� ���� �Ǵ� �޼��带 ��ġ �ڽ��� ��ó�� �����ؼ� ����� �� �ִ�
 *    ��, ���������ڰ� ���Ǿ�߸� �����ϴ�
 *    (public, protected, default, private)
 * 4. �θ� �ڵ忡 �����Ϸ��� �� �� ����ϴ� Ű���� : super
 *    super.���� : �θ�Ŭ������ ������� ����
 *    super.�޼��� : �θ�Ŭ������ �޼��带 ����
 *    super([��, ...]) : �θ�Ŭ������ �����ڸ� ȣ��
*/

package kr.co.mlec.day09;


class Animal{
	void cry(){
		System.out.println(1);
	}
}

class Duck extends Animal {
	void cry(){ // �������̵��� �θ� Ŭ������ ���� �̸� �޼ҵ带 ����
		System.out.println(1);
		System.out.println(2);
	}
}

class Dept {
	int deptNo; // �μ���ȣ
	String name; // �μ���
}

// ��� ���� ǥ�� Ŭ����
class Employee{
	String empNo; // ���
//	private String name; // ����� ��� ��Ű�� �ʴ´�
	String name; // �����
	String hireDate;
	Dept dept; // �μ�����
	
	Employee(){}
	Employee(String empNo,String name,String hireDate){
		this.empNo = empNo;
		this.name = name;
		this.hireDate = hireDate;
	}
	void info(){
		System.out.println("��� : "+empNo);
		System.out.println("�̸� : "+name);
		System.out.println("�Ի��� : "+hireDate);
	}
}

// ��� �߿��� ������ ����� ǥ��
class Manager extends Employee{
	//����Ǵ� �κ��� ��� Ŭ������ �ִ� �Ӽ��� ������ ����
	// ��� ���� Ȱ��
	Employee[] empList;
	
	Manager(){}
	Manager(String empNo,String name,String hireDate, Employee[] empList){
		super(empNo,name,hireDate);
//		this.empNo = empNo;
//		this.name = name;
//		this.hireDate = hireDate;
		this.empList = empList;
	}
	void info(){ // ������
		super.info(); // �θ� info�� ������ �ִ��� Ȯ���ϰ� ������ ����Ѵ�
					  // �׳� info�� �Ұ�� �ڽ��� Ŭ������ �ִ� �ڽ��� �޼ҵ带 �����ϹǷ� ��� ����
		
		// �θ�Ŭ������ �ִ� ���뿡 �߰����� �۾� ����
		System.out.println("�����ϴ� ��� ���� ���");
		System.out.println("-------------------");
		for(Employee e : empList){ // empList�� �迭��ŭ �ϳ��� ������ 
								   // ù��° e�� e1, �ι�° e�� e2�� �ȴ�
			System.out.println(e.name);
		}
		System.out.println("-------------------");
	}
}

public class ExtendsTest {
	
	public static void main(String[] args) {

		Employee e1 = new Employee("m0001","����ȣ","2016-04-10");
		// ��� : m0001
		// �̸� : ����ȣ
		// �Ի��� : 2016-04-10
		e1.info();
		Employee e2 = new Employee("m0002","��â��","2016-04-18");
		e2.info();
		
		Manager m = new Manager("m0000","�̻�","2016-04-01",new Employee[]{e1,e2});
		System.out.println("������ ����");
		m.info();
		
		/*
		Employee e1 = new Employee();
		e1.empNo = "m0001";
		e1.name = "����ȣ";
		e1.hireDate = "2016-04-10";
		
		Employee e2 = new Employee();
		e2.empNo = "m0002";
		e2.name = "��â��";
		e2.hireDate = "2016-04-18";
		
		Manager m = new Manager();
		m.empNo = "m0000";
		m.name = "�̻�";
		m.hireDate = "2016-04-01";
		m.empList = new Employee[]{e1,e2};
		
		System.out.println(m.name);
		*/
	}

}
