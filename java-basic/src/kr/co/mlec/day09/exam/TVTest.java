package kr.co.mlec.day09.exam;
/*
	Ƽ�� ������ �մϴ�.
	���� TV ���� : 9
	���� TV ä�� : 11
	ä�� 36������ ����
	ä�� ����
	���� TVä�� : 37
	TV ��û ����
	Ƽ�� ������ ���ϴ�.
 */
public class TVTest {

	public static void main(String[] args) {

		TV tv = new TV(11, 9);
		tv.powerOn();
		System.out.println("���� TV ���� : " + tv.getVolume());
		System.out.println("���� TV ä�� : " + tv.getChannel());
		System.out.println("ä�� 36������ ����");
		tv.setChannel(36);
		System.out.println("ä�� ����");
		tv.channelUp();
		System.out.println("���� TVä�� : " + tv.getChannel());
		System.out.println("TV ��û ����");
		tv.powerOff();
	}
}
