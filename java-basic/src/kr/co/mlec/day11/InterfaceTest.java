/*
 * Interface
 * 
 * 1. ������
 * 	  class Ű���� �ڸ��� interface Ű���带 ���
 * 2. �������̽��� ����Ǵ� ��� �޼���� �ڵ����� public abstract�� �߰���
 * 3. �������̽��� ����Ǵ� ��� ������ �ڵ����� public static final �߰���
 * 4. Ŭ������ �������̽��� ����� ��� implements Ű���带 �����
 *    Ŭ���� extends Ŭ����
 *    Ŭ���� implements �������̽�
 *    �������̽� extends �������̽�
 * 5. �������̽��� ��ü ������ �Ұ���
 * 6. �������̽� Ÿ���� ���� ������ �ڽ�Ŭ������ �̿��ؼ� ��´�
 * 7. �������̽��� ���� ����� �����Ѵ�
 *    - Ŭ������ ���� ��Ӹ� ������
 *    	class Test extends A, B (X)
 *    	class Test implements TV, Printable, ... (O)
 */

package kr.co.mlec.day11;

// ������ �ƴ� �߻󰳳�
interface TV{
	// ����� �� �̸� ��Ģ : ���δ� �빮�ڷ� ǥ���ϵ� �ܾ�� �ܾ���̿� '_'�� ���
	int MIN_CHANNEL = 1; // �������̽��� ������ �ڵ����� public static final�� �տ� �پ��ٰ� ���� ��
	int MAX_CHANNEL = 130;
	
	/* public abstract */ void powerOn(); // public abstract�� �ڵ� �߰���
	public void powerOff();
	public void channelUp();
	public void channelDown();
	public void soundUp();
	public void soundDown();
}

class SamsungTV implements TV{

	@Override // ������̼�(�� �޼ҵ�� � �޼ҵ��Դϴ� ��� �߰����� ������ �ش�) �޼ҵ��� ��ɰ� ���� �����ϴ�
	public void powerOn() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("�Ｚ Ƽ�� ������ �Ҵ�.");
	}

	@Override
	public void powerOff() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("�Ｚ Ƽ�� ������ ����.");
	}

	@Override
	public void channelUp() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("�Ｚ Ƽ�� ä���� �ø���.");
	}

	@Override
	public void channelDown() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("�Ｚ Ƽ�� ä���� ������.");
	}

	@Override
	public void soundUp() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("�Ｚ Ƽ�� �Ҹ��� �ø���.");
	}

	@Override
	public void soundDown() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("�Ｚ Ƽ�� �Ҹ��� ������.");
	}
}
class LgTV implements TV{
	
	@Override // ������̼�(�� �޼ҵ�� � �޼ҵ��Դϴ� ��� �߰����� ������ �ش�) �޼ҵ��� ��ɰ� ���� �����ϴ�
	public void powerOn() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("LG Ƽ�� ������ �Ҵ�.");
	}
	
	@Override
	public void powerOff() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("LG Ƽ�� ������ ����.");
	}
	
	@Override
	public void channelUp() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("LG Ƽ�� ä���� �ø���.");
	}
	
	@Override
	public void channelDown() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("LG Ƽ�� ä���� ������.");
	}
	
	@Override
	public void soundUp() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("LG Ƽ�� �Ҹ��� �ø���.");
	}
	
	@Override
	public void soundDown() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("LG Ƽ�� �Ҹ��� ������.");
	}
}

public class InterfaceTest {
	public static void showTV(TV tv){
		tv.powerOn();
		tv.channelUp();
		tv.soundUp();
		tv.powerOff();
	}
	
	public static void main(String[] args) {
//		TV.MAX_CHANNEL = 200;
		TV tv = new LgTV(); // ��ü ���� ������ ��� ���ؼ� �ڽ� �̿�
		
		
		System.out.println("TV �ִ� ä�� : "+TV.MAX_CHANNEL);
		System.out.println("TV �ּ� ä�� : "+TV.MIN_CHANNEL);
		showTV(new SamsungTV());
		
		showTV(new LgTV());
		
		
//		TV tv = new LgTV();
//		tv.powerOn();
//		tv.channelUp();
//		tv.soundUp();
//		tv.powerOff();
	}
}
