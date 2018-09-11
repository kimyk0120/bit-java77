package kr.co.mlec.day17;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		try{
			searchEmployeeInfo("data/employee.txt","��");
			searchEmployeeInfo("data/employee.txt","��");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void searchEmployeeInfo(String readFileName, String lastName) throws Exception{
		List<saVO> list = new ArrayList<>();
		
		Scanner sc = new Scanner(new File(readFileName));
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			String [] sInfo = line.split(":");
			int i=Integer.parseInt(sInfo[1]);
			int j=Integer.parseInt(sInfo[3]);
			saVO stu = new saVO(sInfo[0],i,sInfo[2],j);
			list.add(stu);
		}
		int cnt = 0;
		System.out.println("==============================================");
		for(saVO s : list){
			if(s.getName().startsWith(lastName)){
				System.out.print("�̸� : "+s.getName()+"\t");
				System.out.print("���� : "+s.getAge()+"\t");
				System.out.print("�μ� : "+s.getDep()+"\t");
				System.out.println("���� : "+s.getSal());
				cnt++;
			}
		}
		System.out.println("==============================================");
		System.out.println(lastName+"������ ���� ȸ���� �� "+cnt+"���Դϴ�.");
		System.out.println("==============================================");
		System.out.println();
	}
}
class saVO{
	String name;
	int age;
	String dep;
	int sal;
	public saVO() {
	}
	public saVO(String name, int age, String dep, int sal) {
		this.name = name;
		this.age = age;
		this.dep = dep;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
}