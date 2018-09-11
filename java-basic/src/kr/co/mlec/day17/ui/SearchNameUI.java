package kr.co.mlec.day17.ui;

import java.util.ArrayList;
import java.util.Scanner;

import kr.co.mlec.day17.Product;

public class SearchNameUI implements IProductUI{
	private ArrayList<Product> list;
	
	public SearchNameUI() {
	}

	public SearchNameUI(ArrayList<Product> list) {
		this.list = list;
	}

	@Override
	public void execute() {
		System.out.println("-----------------------------");
		System.out.println("��ǰ�� �˻�");
		System.out.println("-----------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� �Է� : ");
		String n = sc.next();
		
		System.out.println("����ȸ��\t��ǰ��\t\t��ǰ��ȣ\t����");
		boolean flag = false;
		for(int i=0;i<list.size();i++){
			Product pd = list.get(i);
			if(pd.getName().contains(n)
					){
				System.out.println(list.get(i));
				flag = true;
			}
			}
		if(flag == false){
			System.out.println("�˻��� ��ǰ ������ �����ϴ�");
			
		}
		
	}
	
	

}
