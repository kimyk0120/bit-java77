package kr.co.mlec.day07;

import java.util.Scanner;

class Bread{
	int price;
	String name;
}

class BreadMng{
	// Ŭ���� ���� : Ŭ���� �ȿ� ������ �޼ҵ忡 ���Ե��� ���� ����
	Bread [] breadlist = new Bread [20]; // �޼ҵ��, �������� �ҹ��� Ŭ�������� �׻� �빮�ڷ� ����
	
	int pos = 0;
	Scanner sc = new Scanner(System.in); // ���ο����� ���̴ϱ� Ŭ���� �������� �̵�
	
	void showMenu(){
		System.out.println("---------------");
		System.out.println("1. �� ���� ���");
		System.out.println("2. ��ü �� ���� ����");
		System.out.println("3. �������� ��ȸ");
		System.out.println("4. ���� ��� �� ���� ����");
		System.out.println("5. ���� �� �� ���� ����");
		System.out.println("6. �̸����� ���� ��ȸ");
		System.out.println("7. �ý��� ����");
		System.out.println("---------------");
		System.out.print("�޴��� �������ּ���(1 ~ 7) : ");
		int menu = sc.nextInt();
		switch(menu){
		case 1:
		add(); // �̹� ���� Ŭ���� �ȿ� �����ϱ� �տ� ��ü�� ���� �θ� �ʿ䰡 ����
		break;
		
		case 2:
		view(); 
		break;
	
		case 3:
		System.out.print("������ �Է��ϼ��� : ");
		int price = sc.nextInt();
		viewByPrice(price); 
		break;

		case 4:
		viewMaxPriceBread();
		break;

		case 5:
		viewMinPriceBread(); 
		break;

		case 6:
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.next();
		viewByName(name);
		break;

		case 7:
		System.out.println("���α׷��� �����մϴ�");
		System.exit(0); // ���� ���ư��� ���α׷��� �ߴܽ�Ų��. �� ������ ������ ���� ����
	}
	}
	
	// ���� ������ ����ϴ� ���	
	void add(){
		System.out.println("�� ������ ����մϴ�.");
		//                  �� ��ĳ�� Ŭ�������� �Ȱ��� ��������� �޼��尡 �ִ�	
		while(true){
		Bread b = new Bread();
		System.out.print("���� �̸� : ");
		String name = sc.next(); // next��� �޼��带 ã�´�
		b.name = name;
		System.out.print("���� ���� : ");
		int price = sc.nextInt();
		b.price = price;
		
		breadlist[pos++] = b;
		
		System.out.print("��� �Է��Ͻðڽ��ϱ�? (Y.��, N.�ƴϿ�) :");
//		String isCon = sc.next();
//		if(isCon.equals("N"))
//				{
//			break;
//				}
		if(sc.next().equals("N")){
			break;
			}
		}
	}
	
	// ��ϵ� ���� ������ ���� �ִ� ���
	void view(){
		System.out.println();
		System.out.println("�� ����");
		System.out.println("--------------------");		
		System.out.println("�̸�\t����\t");
		System.out.println("--------------------");
		// ��ϵ� ���� ���� ���
		for(int i=0;i<pos;i++){
			Bread b = breadlist[i];
			System.out.println(b.name+"\t"+b.price);
		}
		System.out.println("--------------------");
	}
	
	// Ư���� ������ �޾Ƽ� �ش� �������� ������ �� �ִ� ��
	void viewByPrice(int price){
	/*
	 * 1000������ ���� ������ ��
	 * -------------------
	 * �̸�     ����
	 * �Һ���   800
	 * ���ϻ�   700
	 * -------------------	
	 */
		
		System.out.println(price+"������ ���� ������ ��");
		System.out.println("�̸�\t����\t");
		System.out.println("--------------------");
			for(int i=0;i<pos;i++){
				Bread b = breadlist[i];
				
				if(b.price<=price)
			{	
				System.out.println(b.name+"\t"+b.price);
		}
		}
			System.out.println("--------------------");
	}
	
	// ���� ��� ��
	
	void viewMaxPriceBread() {
		/*
		 * ���� ������ ��� ��
		 * -----------------
		 * �Һ��� 600
		 * -----------------
		 */
		 Bread maxBread = breadlist[0];
		 
		 for(int i=1;i<pos;i++){
			 Bread b = breadlist[i];
			 if(maxBread.price<b.price){
				 maxBread.price = b.price;
			 }
		 }
		System.out.println("���� ������ ��� ��");
		System.out.println("--------------------");
		System.out.println(maxBread.name+"\t"+maxBread.price);
		System.out.println("--------------------");	
	}
	
	// ���� �� ��
	
	void viewMinPriceBread() {
		/*
		 * ���� ������ �� ��
		 * -----------------
		 * �Һ��� 600
		 * -----------------
		 */
		Bread minBread = breadlist[0];
		
		for(int i=1;i<pos;i++){
			Bread b = breadlist[i];
			if(minBread.price > b.price){
				minBread = b;
			}
			
		}
		System.out.println("���� ������ �� ��");
		System.out.println("--------------------");
		System.out.println(minBread.name+"\t"+minBread.price);
		System.out.println("--------------------");
	}
	
	// ���� �̸��� �޾Ƽ� �ش� ���� ��ϵǾ� �ִ��� Ȯ��
	
	void viewByName(String name){
		
		System.out.println(name+"���� ����");
		System.out.println("--------------------");
		
		
		// �ݺ��� ������ ���Ҵ��� Ȯ���� �� �ִ� ���(flag�� �ƴ� int�� Ȯ��)
		int i = 0;
		for( ; i<pos; i++){
		Bread b = breadlist[i];
		if(name.equals(b.name)){
		System.out.println("�̸� : "+b.name);
		System.out.println("���� : "+b.price);
		break;
		}
		
		}
		
		if(i==pos){
		System.out.println("�ش� ���� ������ ã���� �����ϴ�.");
		}
		System.out.println("--------------------");
		
//		boolean flag = false; // flag������ for������ break�� �������Դ��� ���� ���� ��� for������ �������Դ���
//							  // üũ �� �� �ִ�
//		//int findCnt=0;
//		for(int i = 0; i<pos; i++){
//			Bread b = breadlist[i];
//			if(name.equals(b.name)){
//				System.out.println("�̸� : "+b.name);
//				System.out.println("���� : "+b.price);
//				flag = true;
//				//findCnt++;
//				break;
//			}
//			
//		}
//		
//		// �극��ũ�� �ݺ��� ������� üũ
//		if(flag==false){
//			System.out.println("�ش� ���� ������ ã���� �����ϴ�.");
//		}
//		// if(findCnt == 0){
//		// System.out.println("�ش� ���� ������ ã���� �����ϴ�.");
//		// }
//		System.out.println("--------------------");
	}
	
}

public class MethodTest02 {

	public static void main(String [] args){
		
		BreadMng mng = new BreadMng();
		while(true){
			mng.showMenu();
		}
		
		/*mng.add();
		mng.view();
		// 1000������ ���� ������ ���� ���
		mng.viewByPrice(1000);
		// ������ ���� ��� �� ���� ����
		mng.viewMaxPriceBread();
		// ������ ���� �� �� ���� ����
		mng.viewMinPriceBread();
		mng.viewByName("soboru");
	*/
	}
	
}
