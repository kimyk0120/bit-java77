package kr.co.mlec.day17.ui;

import java.util.ArrayList;

import kr.co.mlec.day17.Product;

public class SearchUI implements IProductUI{
	
	private ArrayList<Product> list;
	
	public SearchUI() {
	}
	public SearchUI(ArrayList<Product> list) {
		this.list = list;
	}


	@Override
	public void execute() {
		System.out.println("-----------------------------");
		System.out.println("��ǰ ����");
		System.out.println("�� "+list.size()+"��");
		System.out.println("-----------------------------");
		System.out.println("����ȸ��\t��ǰ��\t\t��ǰ��ȣ\t����");
		System.out.println("-----------------------------");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println("-----------------------------");
	}

}
