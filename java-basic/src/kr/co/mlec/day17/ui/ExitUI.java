package kr.co.mlec.day17.ui;

import java.util.Scanner;

public class ExitUI implements IProductUI {
	
	
	@Override
	public void execute() {
		System.out.print("�����Ͻðڽ��ϱ�? (��� : N, ���� : ����) : ");
		Scanner sc = new Scanner(System.in);
		String c = sc.nextLine();
		if(c.equals("N")){
		}
		else if(c.equals("")){
			System.out.print("����Ǿ����ϴ�");
			System.exit(0);
		}
	}

}
