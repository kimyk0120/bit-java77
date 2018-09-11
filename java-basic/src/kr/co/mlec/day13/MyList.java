package kr.co.mlec.day13;


public class MyList {
	
	private Object [] arr;
	private int pos=0;
	
	public MyList(int size) {
		arr = new Object[size];
	}
	/*
	 * 1. �Է� �Ǳ� ���� ũ�⸦ üũ�Ѵ�
	 * 2. ���ο� Ȯ��� �迭�� �����Ѵ�
	 * 3. ���� �迭�� ������ ���Ӱ� ������ �迭�� �����Ѵ�
	 * 4. ���� �迭�� ������ ���Ӱ� ������ �迭�� �����Ѵ�
	 */
	
	
	public void add(Object data){
		// �迭�� ũ��� �Էµ� �������� ũ�Ⱑ ���� ��
		if(arr.length==pos){
			Object [] temp = new Object[arr.length*2];
			System.arraycopy(arr, 0, temp, 0, arr.length); // ���� �迭�� �� �迭�� �̵�
			arr=temp;
		}
		arr[pos++] = data; // ������ ���� ������ ���� �����͸� �Է��Ѵ�
	}
	
	/*
	 * ���� ������ true
	 * ���� ���� �� false
	 * 
	 * ���� ���� ���
	 * 1. index ��ȣ�� 0���� ���� ���
	 * 2. index ��ȣ�� pos���� ũ�ų� �������
	 */
	
	public boolean remove(int index){
		if(index<0||index>=pos) return false;
		
		int numMoved=pos-index-1;
		
			if(numMoved > 0){
				System.arraycopy(arr,index+1,arr,index,numMoved);
			}
			arr[--pos]=null;
		
		return true;
	}
	
	public int size(){
		return pos;
	}
	
	public Object get(int index) throws InvalidIndexException{
		
		if(pos <= index){ // ��Ÿ���� ���� try catch�� �� �ص��ȴ�
			throw new InvalidIndexException(index);
		}
		
		return arr[index];
	}
}
