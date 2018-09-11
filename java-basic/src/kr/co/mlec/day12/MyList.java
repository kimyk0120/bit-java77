package kr.co.mlec.day12;

public class MyList {
	
	private String [] arr;
	private int pos=0;
	
	public MyList(int size) {
		arr = new String[size];
	}

	public void add(String data){
		arr[pos++] = data;
		
	}
	
	public String get(int index) throws InvalidIndexException{
		
		if(pos <= index){ // ��Ÿ���� ���� try catch�� �� �ص��ȴ�
			throw new InvalidIndexException(index);
		}
		
		return arr[index];
	}
}
