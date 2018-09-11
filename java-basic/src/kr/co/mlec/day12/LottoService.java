package kr.co.mlec.day12;

import java.util.Random;

public class LottoService {

	// �ζ� ��ȣ(1-45)�� ���ڸ� ������ �� ��ȯ�Ѵ�
	public int[] getNumbers(){
		Random r = new Random();
		int [] numbers = new int[6];
		
		for(int i =0;i<numbers.length;i++){
			numbers[i]=r.nextInt(45);
		}
		
		return numbers;
		
	}
	/*
	 * 1.�ߺ��� ���ڰ� �ִ��� üũ�ؾ���
	 * 2.���� �߿� 0�� �� �ִ��� üũ��
	 */
	public boolean checkNumbers(int[] numbers)
			throws LottoZeroNumberException,LottoDupNumberException{
	
	
		for(int i = 0;i<numbers.length-1;i++){
			//�迭�� �Էµ� ��Ұ� 0�� ���
			if(numbers[i]==0){
				throw new LottoZeroNumberException();
			}
			for(int j =i+1;j<numbers.length;j++){
				if(numbers[i]==numbers[j]){
					throw new LottoDupNumberException(numbers[i]);
				}
			}
		}
	
		//�迭�� ������ ��Ұ� 0�� ���
		if(numbers[numbers.length-1]==0){
			throw new LottoZeroNumberException();
			
		}
		return true;
	}
}
	
