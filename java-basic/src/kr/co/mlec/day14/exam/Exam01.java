/*
 * 1. exam01.txt ������ ������ �о ����Ʈ�� �Է��Ѵ�
 * 2. ����Ʈ�� �Էµ� ������ �����ؼ� �Ʒ��� ���� ����� �����
 * 		
 * 		���
 * 		--------
 * 		����
 *		--------
 *		95
		27
		85
		55
		70
		--------
		���� : ...
		��� : ...
 */
package kr.co.mlec.day14.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam01 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("data\\Exam01.txt"));
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int sum=0;
		
		while (sc.hasNextLine()) {
			list.add(sc.nextInt());
		}
		
		System.out.println("���");
		System.out.println("--------");
		System.out.println("����");
		System.out.println("--------");
		
		for(int i = 0;i<list.size();i++){
			Integer nums = list.get(i);
			System.out.println(nums);
			sum+=nums;
		}
		System.out.println("--------");
		System.out.println("���� : "+sum);
		System.out.println("���� : "+(float)sum/list.size());
}
	
}
