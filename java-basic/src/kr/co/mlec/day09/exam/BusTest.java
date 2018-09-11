//360�� ���� �������.
//�°� 3�� ����.
//�°� 1�� ����.
//�°� 1�� ����.
//�°� 2�� ����.
//�°� 5�� ����.
//�°� 3�� ����.
//360�� ������ ���� �����ο�: 3��.
//��� ������ ���� �����ο�: 9��.
//740�� ���� �������.
//�°� 2�� ����.
//�°� 1�� ����.
//�°� 3�� ����.
//�°� 2�� ����.
//�°� 2�� ����.
//�°� 3�� ����.
//740�� ������ ���� �����ο�: 1��.
//��� ������ ���� �����ο�: 16��.

package kr.co.mlec.day09.exam;

class Bus{
	int busNo;
	int count;
	static int accumulateCount;
	
	Bus(){}
	Bus(int busNo){
		this.busNo = busNo;
		System.out.println(busNo+"�� ���� �������.");
	}
	void ride(){
		ride(1);
//		this.count=count++;
//		System.out.println("�°� 1�� ����");
	}
	void ride(int count){
		this.count+=count;
		System.out.println("�°� "+count+"�� ����");
		Bus.accumulateCount+=count;
	}
	void leave(int count){
		this.count-=count;
		System.out.println("�°� "+count+"�� ����");
	}
	void leave(){
		leave(1);
	}
	void info(){
		System.out.println(busNo+"�� ������ ���� �����ο� : "+count+"��");
		System.out.println("��� ������ ���� �����ο� : "+Bus.accumulateCount+"��");
	}
}

public class BusTest {

	public static void main(String[] args) {
		Bus no360 = new Bus(360);
		no360.ride(3);
		no360.leave();
		no360.ride();
		no360.leave(2);
		no360.ride(5);
		no360.leave(3);
		no360.info();

		Bus no740 = new Bus(740);
		no740.ride(2);
		no740.leave(1);
		no740.ride(3);
		no740.leave(2);
		no740.ride(2);
		no740.leave(3);
		no740.info();
	}

}

