/*
 * �ִ밪 ã��
 */

package kr.co.mlec.day07;

public class MaxTest {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int [] arr = {4, 1, 8, 9, 100, -3, -76, 49};
		int max=0;
		max = arr[0];
		int min = arr[0];
		// �迭�� ù��° ���� max�� ����ְ� �ݺ����� �迭�� �ι�° ������ ù��° ���� ���Ѵ�
		for (int i = 1 ; i<arr.length; i++){
			if(max<arr[i]){
			 max=arr[i];
			}	
			if(min>arr[i]){
				 min=arr[i];
				}	
		}
		
		System.out.println("�ִ밪�� "+max+" �ּҰ��� "+min);

	}

}
