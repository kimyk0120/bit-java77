package kr.co.mlec.day12;

public class InvalidIndexException extends RuntimeException{

	public InvalidIndexException(){
		super("잘못된 인덱스입니다");
	}
	
	public InvalidIndexException(int index){
		super(index+"는(은) 잘못된 인덱스입니다");
	}
}
