package kr.co.mlec.day06;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		int [] arr = new int[3];  // �迭�� �⺻���� �ƴ� �������̹Ƿ� new�� �ٿ��ش�
								   // �迭�� ���鶧 ũ�⸦ �׻� ��������Ѵ�
						           // [] ���� ������ [] 1���� [] [] 2���� [] [] [] 3����
		// �⺻�� ���� 0 �Ǽ� 0.0
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]); // 0�� �Ȱ��� Ȯ���Ҽ� �ִ�
//		
		String [] sArr = new String[3];

		
		// �ܼ��ϰ� �迭�� ó������ ���������� ���� Ȯ��
//		for(int i=0;i<sArr.length;i++){
//			System.out.println(sArr[i]);
//		}
//		
		// 1.5���� �����Ǵ� ���� for
		sArr[0]="java";
		sArr[1]="is";
		sArr[2]="easy";
		for(String temp:sArr){	// �տ��� ���� �迭�� ������Ÿ�԰� ������ ����, �ڴ� �迭�� ũ�⸸ŭ ����
			System.out.println(temp);
		}		
		
		char [] cArr = new char[5];
		// �⺻�� ����
		
		boolean [] bArr = new boolean[2];
		// �⺻�� false
	
		char[] cArr1 = new char[3];
		cArr1[0]='j';
		cArr1[1]='a';
		cArr1[2]='v';
		
		for(char temp:cArr1){
			System.out.println(temp);
		}
		
		// �迭�� ���븸�� Ȯ���� ��� ��ȣ�� ��� ������ ���ڿ��� �Ѱ��ش�
		String str = Arrays.toString(sArr); 
		System.out.println("sArr�� ���ڿ� : "+str);
		
//		System.out.println(Arrays.toString(sArr)); // ������ �ѹ��� ���ȴٸ� ���� ������ �����̹Ƿ�
												   // �ٷ� ���� �ִ°��� ������
	
		int [] arr2 = new int[2];
		arr2[0] = 10;
		arr2[1] = 20;
		
		
		int [] arr3 = {10, 20}; // ����� ���ÿ� �ʱ�ȭ, ���� ���� ���, ������ �����Ҷ��� ����
		// arr3 = {30, 40}; �̷��� ������ �Ұ����ϴ�
		
		// �޼����� �Ű������� �ѱ� ��� ���� ���(??)
		int [] arr4 = new int[]{10,20}; // �� �ٸ� ���
		arr4 = new int[]{30, 40}; //���� ���Ŀ��� ���� �ؼ� ���� �����ϴ�
		
		// �迭 ����
		int [] src = {10, 20, 30, 40, 50};
		
		int [] dest = new int[src.length];
		
		// src �迭�� ������ dest �迭�� ����, ���� ���� ���� �Լ�
		System.arraycopy(src, 1, dest, 0, 4);
		
		
		// ����� ��� �迭 ���, Arrays.toString(�迭��) ���� ���� ���� �Լ�
		System.out.println(Arrays.toString(dest));
		
	}

}