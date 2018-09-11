/*
 * ������ ���� - ����,�����⵵,�ֿ�
 */


package kr.co.mlec.day14.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		String movieStar = getMovieStar("���� ����");
		System.out.println(movieStar);
		movieStar = getMovieStar("�±ر� �ֳ�����");
		System.out.println(movieStar);
	}

	private static String getMovieStar(String movieName) {
		List<String> list = new ArrayList<>();
		String result = "������� �����ϴ�";
		try {
			Scanner sc = new Scanner(new File("data/exam04.txt"));
			while(sc.hasNextLine()){
				String str = sc.nextLine();
				String [] arr = str.split(",");
				if(movieName.equals(arr[0])){
					return arr[2];
				}
				
			}
				
		} catch (FileNotFoundException e) {
			// TODO �ڵ� ������ catch ���
			e.printStackTrace();
		}
		return result;		
		
		}
	
	
}
