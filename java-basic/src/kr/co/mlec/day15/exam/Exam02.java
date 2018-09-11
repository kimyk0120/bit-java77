package kr.co.mlec.day15.exam;

import java.io.File;

public class Exam02 {

	private static void showFileInfoByExt(String dir,String ext){
		
		File f = new File(dir);
		
		String [] fArr = ext.split(",");
		
		System.out.println(f.getPath()+" �ؿ� "+ext+" Ȯ���ڸ� ���� ���� ���");
		System.out.println("--------------");
		String [] fList = f.list();
		for(String name : fList){
			if(name.endsWith("."+fArr[0])|name.endsWith("."+fArr[1])){
			System.out.println(name);
			}
		}
		System.out.println("--------------");
		
	}
	
	
	public static void main(String[] args) {
		/*
		 *  data ���� �ؿ� �ִ� ���� �߿��� Ȯ���ڰ� avi ���ϸ� ȭ�鿡 ���
		 */
		showFileInfoByExt("data","avi");
		showFileInfoByExt("data","avi,txt");
	}

}
