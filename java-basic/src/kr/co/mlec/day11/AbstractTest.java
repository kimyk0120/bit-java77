/*
 * �߻�Ŭ���� 
 * 1. Ŭ������ ����ο� abstract Ű���尡 ���� Ŭ����
 * 2. �߻�޼��� : �޼����� ����ο� abstract�� ���� �޼���
 *    - �޼����� ��������(�ٵ�) {}�� �����Ѵ�
 * 3. �߻�Ŭ������ ��� ���� Ŭ������ �ݵ�� (�ʼ�) ��ӹ��� Ŭ������ �߻�޼��带 �������̵�(������)�ؾ��Ѵ� �ʼ�
 * 4. �߻�Ŭ������ �߻�޼���� ������ �޼��带 ���ÿ� ������ �� �ִ�
 * 5. ��ü ������ �Ұ����ϴ� (new�� �ȵȴ�) �߻�Ŭ������ �ν��Ͻ��� ���� ����� ����
 * 6. �߻�Ŭ���� Ÿ���� ��ü ������ �ּҰ��� �����ϱ� ���ؼ���
 *    �ڽ�Ŭ������ �̿��Ѵ�
 * 	  Print p = new �ڽ�Ŭ����();
 *    �߻�Ŭ������ ������ ������ Ŭ������ ���� ����ϰ��� �ϴ� �޼��带 ������ �ľ��ؾ��Ѵ�
 *    ���ŷο��� �����ִ�
 */

package kr.co.mlec.day11;

abstract class Print{
	String name;
	public void info(){
		System.out.println(name+"������...");
	}
	public abstract void print(); // �޼����� �����
	
}

class SamsungPrint extends Print{
	public SamsungPrint(){
		name = "Samsung";
	}
	@Override
	public void print() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("�����ǵ� print �޼���");
	}
}
class LgPrint extends Print{
	public LgPrint(){
		name = "Lg";
	}
	@Override
	public void print() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("�����ǵ� print �޼���");
	}
}

public class AbstractTest {
	public static void main(String[] args){
//		Print p = new Print();
		Print p = new SamsungPrint();
		// �߻�޼��带 ȣ�� �� �ڽ�Ŭ������ �����ǵ� �޼��尡 ȣ��ȴ�
		p.info();
		p.print();
		
		p = new LgPrint(); // ������ ������
		p.info();
		p.print();
	}
}
