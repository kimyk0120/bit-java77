package kr.co.mlec.day12;

public class InvalidIndexException extends RuntimeException{

	public InvalidIndexException(){
		super("�߸��� �ε����Դϴ�");
	}
	
	public InvalidIndexException(int index){
		super(index+"��(��) �߸��� �ε����Դϴ�");
	}
}
