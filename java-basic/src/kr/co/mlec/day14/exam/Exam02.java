/*
 * 
 * ��츮,80
 * ȫ����,70
 * ���Ͽ�,90
 * ��ȿ��,100
 * 
 * ���α׷� �ۼ� ����
 * 1. ������ �ִ� ������ �о ����Ʈ�� ��´�
 * 		- ����Ʈ�� �Ķ���� Ÿ���� StudentVO�� �����Ѵ�
 * 2. ��������� ������ ���� �������� �ۼ��Ѵ�
 * 
 * �� 4��
 * --------------------
 * �̸�         ����
 * --------------------
 * ��츮       80
 * ȫ����       70
 * ���Ͽ�       90
 * ��ȿ��      100
 * --------------------
 * 1�� : ��ȿ��
 * 
 */

package kr.co.mlec.day14.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



class StudentVO{
	String name;
	int scr;
	public StudentVO(){
		
	}
	public StudentVO(String name, int scr) {
		this.name = name;
		this.scr = scr;
	}
	
}


public class Exam02 {

	public static void main(String[] args) {
		
		ArrayList<StudentVO> list = new ArrayList<>();	
		
		try {
			Scanner sc = new Scanner(new File("data\\exam02.txt"));
			while(sc.hasNextLine()){
				String str = sc.nextLine();
				String [] Arr = str.split(",");
				StudentVO student = new StudentVO(Arr[0],Integer.parseInt(Arr[1]));
				list.add(student);
			}
			System.out.println("�� "+list.size()+"��");
			System.out.println("---------------");
			System.out.println("�̸�\t����");
			System.out.println("---------------");
			int max = -1;
			int j = 0;
			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i).name+"\t"+list.get(i).scr);
				if(list.get(i).scr<max){
					continue;
				}
				max=list.get(i).scr;
				j=i;
			}
			System.out.println("---------------");
			System.out.println("1�� : "+list.get(j).name);
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
