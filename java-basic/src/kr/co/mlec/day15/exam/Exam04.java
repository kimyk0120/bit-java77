package kr.co.mlec.day15.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam04 {
	
	private static String showInfoByCity(String city) throws FileNotFoundException{
		
		String totalResult = "";
		
			int cnt = 0;
			String result = "";
			Scanner sc = new Scanner(new File("data/person.txt"));
			while(sc.hasNextLine()){
				String str = sc.nextLine();
				String [] arr = str.split(":");
				if(arr[1].contains(city)){
					result = result+"�̸� : "+arr[0]+", ������ : "+arr[1]+"\n";
					cnt++;
				}
		}
			totalResult = city+" �˻��� ��� : "+cnt+"��\n"+result;
			System.out.print(totalResult);
			return totalResult;
	}
	private static String showInfoByName(String name) throws FileNotFoundException{
		
		String totalResult = "";
		
			int cnt = 0;
			String result = "";
			Scanner sc = new Scanner(new File("data/person.txt"));
			while(sc.hasNextLine()){
				String str = sc.nextLine();
				String [] arr = str.split(":");
				if(arr[0].startsWith(name)){
					result = result+"�̸� : "+arr[0]+", ������ : "+arr[1]+"\n";
					cnt++;
				}
		}
			totalResult = name+"�� �����ϴ� ��� : "+cnt+"��\n"+result;
			System.out.print(totalResult);
			return totalResult;
	}
		
	
	public static void main(String[] args) throws IOException {

		
		String result = "";
		while(true){
			
			FileWriter fw = new FileWriter("data/searchResult.txt");
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("�׸��� �����ϼ���(1.������ 2.�̸� 3.����)");
			
			int i = sc.nextInt();
			switch(i){
			case 1:
				System.out.print("�������� �Է��ϼ���:");
				String city = sc.next();
				result = result + showInfoByCity(city);
				break;
			case 2:
				System.out.print("�̸��� �Է��ϼ���:");
				String name = sc.next();
				result = result + showInfoByName(name);
				break;
			case 3:
				System.out.print("�˻��� ����� ���� �� �����Ͻðڽ��ϱ�?(Y/N) ");
				String s = sc.next();
				if(s.equals("Y")){
					fw.write(result);
					fw.close();
					System.out.println("�˻� ����� ����Ǿ����ϴ�");
					System.out.println("���α׷��� �����մϴ�");
					System.exit(0);
				}else if(s.equals("N")){
					System.out.println("���α׷��� �����մϴ�");
					System.exit(0);
					break;
				}
				else{
					System.out.println("�׸��� �ٽ� �����ϼ���");
					continue;
				}
			default:
				System.out.println("�׸��� �ٽ� �����ϼ���");
				break;
				
			}
		}
		
		
	}

}
