/*
 * File Ŭ����
 * - ���� ��ü�� ������ �ƴ� ������ ������ ���� �� �ִ�
 * - 
 */

package kr.co.mlec.day15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam11 {
	public static void main(String[] args) throws Exception {
		// ���ϸ� �Ǵ� ���丮���� �����ڿ� �־��ش�
		// �ݵ�� ������ �ʿ�� ���� : data/ioexam10.txt
		//File f = new File("data/ioexam10.txt");
//		File f = new File("data/2015/12/04");
		File f = new File("data");
		
		System.out.println(f.getPath());
		System.out.println("--------------");
		String [] fList = f.list();
		for(String name : fList){
			System.out.println(name);
		}
		System.out.println("--------------");
		
//		// ���丮�� ����
//		System.out.println((f.mkdirs()?"���丮 ����":"���� ����"));
//		// mkdir �ϸ� ������ �ϳ��� ����� �ְ� �������� ������� mkdirs�� ������Ѵ�
//		
//		System.out.println(f.isFile()?"�����̴�":"������ �ƴϴ�");
//		System.out.println(f.isDirectory()?"���丮�̴�":"���丮�� �ƴϴ�");

		
		
		
		/*
		if(f.exists()){ // f�� ����Ű�� ������ �����ϸ� true, �׷��� ������ false
			System.out.println("������");
			
			// ������ ����Ʈ ũ�� ��������
			long len = f.length(); // ������ ����� ���� ũ�ٺ��� long Ÿ������ ��ȯ�Ѵ� int�� 21�������
			System.out.println("������ ������ : "+len);
			
			String name = f.getName(); // ���� ����� �� ���� ��ȯ,ioexam10.txt
			String path = f.getPath(); // ��ü ��θ� ��ȯ
			String parent = f.getParent(); // data
			System.out.println("name : "+name);
			System.out.println("path : "+path);
			System.out.println("parent : "+parent);
			
			long time =f.lastModified(); // ������ ������ �ð� ����
			System.out.println("time : "+time);
			
			Date d = new Date(time);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String sTime = sdf.format(d);
			System.out.println("������ ���� �ð� : "+sTime);

			System.out.println(f.canRead()?"�б� ����":"�б� �Ұ���");
			System.out.println(f.canWrite()?"���� ����":"���� �Ұ���");
			
		}else{
			System.out.println("������������");
			if(f.createNewFile()){ // �������� ������ f�� ������ �����Ѵ�
				System.out.println("���� ������ ����");
				
			}else{
				System.out.println("���� ������ ����");
			}
		}
		*/
		
	}
}
