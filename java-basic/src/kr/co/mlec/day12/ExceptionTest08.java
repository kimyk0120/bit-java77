package kr.co.mlec.day12;

public class ExceptionTest08 {

	public static void main(String[] args) {
		MyList mList = new MyList(2);
		mList.add("�ϳ�");
		mList.add("��");
		
		String data = mList.get(2);
		System.out.println("1��° �ε��� �� : "+data);
		
//		mList.add("��");
	}
}
