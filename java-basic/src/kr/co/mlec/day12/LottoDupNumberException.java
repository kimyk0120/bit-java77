package kr.co.mlec.day12;

public class LottoDupNumberException extends Exception{
	public LottoDupNumberException(){
		super("������ �ζ� ��ȣ�� �ߺ��Ǿ����ϴ�");
	}
	public LottoDupNumberException(int num){
		super("������ �ζ� ��ȣ("+num+")�� �ߺ��Ǿ����ϴ�");
	}
}
