package kr.co.mlec.day07;



public class FlagTest {

	public static void main(String[] args) {
		
		int [] arr = {4, 9, 1, 6};
		
		int cnt=0;
		  
		for(int i = 0; i<arr.length; i++){
			// ��Ұ� ¦���� ��� �ݺ� �����
			if(arr[i]%2==0){
				cnt++;
			}
		}
		if(cnt==0){
			System.out.println("�迭�� ��� ��Ұ� Ȧ�� �Դϴ�.");
		}
		else {
			System.out.println("�迭�� ¦���� "+cnt+"�� �ֽ��ϴ�.");
		}
		 /* int [] arr = {4, 9, 1, 6};
		
		boolean flag = true;
		
		
		for(int i = 0; i<arr.length; i++){
			// ��Ұ� ¦���� ��� �ݺ� �����
			if(arr[i]%2==0){
				flag = false;
				break;
			}
		}
		if(flag=true){
			System.out.println("�迭�� ��� ��Ұ� Ȧ�� �Դϴ�.");
		}
		else {
			System.out.println("�迭�� ��� ��Ҵ� Ȧ���� �ƴմϴ�.");
		}
		*/
		
	}

}
