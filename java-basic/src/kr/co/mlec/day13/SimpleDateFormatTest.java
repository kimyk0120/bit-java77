package kr.co.mlec.day13;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {
public static void main(String[] args) {
	Calendar c = Calendar.getInstance();
	
	// ����ð� : 2015-12-02 12:03
	
	
	
//	System.out.println("����ð� : "
//			+c.get(Calendar.YEAR)+"-"+		
//			+(c.get(Calendar.MONTH)+1)+"-"+
//			+c.get(Calendar.DATE)+" "
//			+c.get(Calendar.HOUR_OF_DAY)+":"
//			+c.get(Calendar.MINUTE)
//			);
	
	// �ϴ��� : ��¥ ������ ������ ���Ͽ� �´� ���ڿ��� ��ȯ
	// ������(��¥), ��� �ٲ���(����)
	// y : �⵵ 
	// M : ��
	// d : ��
	// H : 24�ð�
	// h : 12�ð�
	// m : ��
	// s : ��
	// ����ð� : 2015-12-02 12:03 -> yyyy-MM-dd HH:mm
	// ����ð� : 2015�� 12�� 2�� 12�� 3�� -> yyyy�� MM�� dd�� HH�� mm��
	
	// SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	String str = sdf.format(c.getTime());
	System.out.println(str);
	
}
}
