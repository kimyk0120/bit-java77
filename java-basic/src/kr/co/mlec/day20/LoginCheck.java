package kr.co.mlec.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LoginCheck {
	// member.txt ������ ������ �о 
	// �Ű������� �Ѿ�� login ��ü�� ���̵�� �н����� ����
	// ������ ȸ�������� �ִ��� �Ǵ��Ѵ�
	// ������ ȸ�� ������ ������ true, ������ false
	public static boolean check(LoginVO login) throws FileNotFoundException{
		
			
			Scanner sc = new Scanner(new File("src/kr/co/mlec/day20/member.txt"));

			while(sc.hasNextLine()){
				String str = sc.nextLine();
				String [] arr = str.split(":");
				if(login.getId().equals(arr[0])&&
						login.getPass().equals(arr[1])){
					return true;
				}
			}
			
			
			
		
		return false;
	}
}
