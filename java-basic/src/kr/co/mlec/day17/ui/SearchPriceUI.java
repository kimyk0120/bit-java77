package kr.co.mlec.day17.ui;

import java.util.ArrayList;
import java.util.Scanner;

import kr.co.mlec.day17.Product;

public class SearchPriceUI implements IProductUI {
private ArrayList<Product> list;

public SearchPriceUI() {
}

	public SearchPriceUI(ArrayList<Product> list) {
	this.list = list;
}

	@Override
	public void execute() {
		System.out.println("-----------------------------");
		System.out.println("�ݾ����� �˻�");
		System.out.println("-----------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ݾ� : ");
		int low = sc.nextInt();
		System.out.print("���� �ݾ� : ");
		int high = sc.nextInt();
		System.out.println("����ȸ��\t��ǰ��\t\t��ǰ��ȣ\t����");
		boolean flag = false;
		for(int i=0;i<list.size();i++){
			Product pd = list.get(i);
			if(Integer.parseInt(pd.getPrice())>low&&
					Integer.parseInt(pd.getPrice())<high){
				System.out.println(list.get(i));
				flag = true;
			}
			}
		if(flag == false){
			System.out.println("�˻��� ��ǰ ������ �����ϴ�");
			
		}
		
	}

}
