package kr.co.mlec.day06;

/*
 * for, while, do~while(���� ������� ����)
 */

// for���� �ݺ��� ��� �Ǵ��� ������������ ���ϰ� while�� ���� ������ �𸦶� ���ϴ�

public class LoopTest {
	public static void main(String [] args){
		
		int i = 0;
		for( ; i<10 ; i++){ //int i = 0 ������ �� for�� �ȿ����� ���δ�
			
		}
		System.out.println(i); // for���� �������ü� �����Ƿ� ����loop
		
		i = 0;
		for( ; i<10 ; i++){
			System.out.println(i);
		}
		
		int k = 0;
		while(k<10){
			System.out.println(k);
			k++;
		}
		
		k = 0;
		while(k<10){
			System.out.println(k);
			k++;
		}
		
	}
}
