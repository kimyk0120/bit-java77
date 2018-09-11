package kr.co.mlec.day15.exam;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exam01 {
	private static void createDir(Calendar c){

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/HH");
		
		// c.getTime() : Date ��ü ��ȯ
		String dirStr = sdf.format(c.getTime());
		
		File f = new File("data/"+dirStr);
		System.out.println((f.mkdirs()?"���丮 ����":"���� ����"));
		
	}
	
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		createDir(c);
		c.set(2014, 2,1,2,1);
		createDir(c);
	}

}
