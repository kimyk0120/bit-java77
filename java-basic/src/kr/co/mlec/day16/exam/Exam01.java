package kr.co.mlec.day16.exam;

public class Exam01 {
public static void main(String[] args) {
	
	// data/ioexam01.txt ������
	// data/a/b/ioexam01.txt�� �����ϴ� ��� ����
	try{
	FileUtil.copy("data/ioexam01.txt","data/a/b/ioexam01.txt");
	
	// data/a/b ���丮�� ������ ��� �ش� ���丮�� ioexam02.txt ����
	// data/ioexam02.txt ������ ������ data/a/b�� ����
	// FileUtil.copy("data/ioexam02.txt", "data/a/b");
	
	}
	catch(Exception e){
		System.out.println("���� ���� �� ���� �߻�");
	}
}
	
}
