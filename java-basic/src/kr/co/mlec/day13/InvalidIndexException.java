package kr.co.mlec.day13;

public class InvalidIndexException extends RuntimeException{

	public InvalidIndexException(){
		super("�߸��� �ε����Դϴ�");
	}
	
	public InvalidIndexException(int index){
		super(index+"��(��) �߸��� �ε����Դϴ�");
	}
}
