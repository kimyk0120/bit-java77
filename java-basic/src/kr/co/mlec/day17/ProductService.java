package kr.co.mlec.day17;

import java.io.File;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import kr.co.mlec.day17.ui.ExitUI;
import kr.co.mlec.day17.ui.IProductUI;
import kr.co.mlec.day17.ui.SearchNameUI;
import kr.co.mlec.day17.ui.SearchPriceUI;
import kr.co.mlec.day17.ui.SearchUI;

public class ProductService {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Product> list = new ArrayList<>();
	
	private void loadingFile(){
		try(
				Scanner sc = new Scanner(new File("data/product.txt"));
				){
			while(sc.hasNextLine()){
				Product pd = new Product();
				String str = sc.nextLine();
				String [] sArr = str.split(":");
				pd.setCom(sArr[0]);
				pd.setName(sArr[1]);
				pd.setNo(sArr[2]);
				pd.setPrice(sArr[3]);
				list.add(pd);
			}
		}
		catch(Exception e){
		}
	}
	
	public void execute(){
		loadingFile();
		
		while(true) {
			System.out.println("-----------------------------");
			System.out.println("��ǰ���� �ý���");
			System.out.println("-----------------------------");
			System.out.println("1. ��ü �˻�   ");
			System.out.println("2. �ݾ� �˻�   ");
			System.out.println("3. ��ǰ�� �˻�   ");
			System.out.println("4. ���� ");
			System.out.println("-----------------------------");
			System.out.print("�޴� ���� : ");

			int i = sc.nextInt();
			
			IProductUI ui = null;
			
			switch(i) {
			case 1 :
				ui = new SearchUI(list);
				break;
			
			case 2 :
				ui = new SearchPriceUI(list);
				break;
			
			case 3 :
				ui = new SearchNameUI(list);
				break;

			case 4 :
				ui = new ExitUI();
				break;
			}
			ui.execute();
		}
		
		
	}
	
	
}
