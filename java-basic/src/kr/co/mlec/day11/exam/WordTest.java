package kr.co.mlec.day11.exam;

import java.io.File;
import java.util.Scanner;

class Words{
	String a=null;
	int c=0;
}

public class WordTest {

	public static void main(String[] args) throws Exception {

		
		Scanner sc = new Scanner(new File("data/word.txt"));
		while(sc.hasNextLine()){
		String s = sc.nextLine();
		System.out.println(s);
		}
		
		
//		Scanner sc = new Scanner(new File("data/word.txt"));
//		int cnt = 0;
//		int check = 0;
//		while (sc.hasNext()) {
//			String line = sc.next();
//			cnt++;
//		}
//		Words w = new Words();
//
//		String [] line = new String [1000];
//		
//		sc = new Scanner(new File("data/word.txt"));
//
//				for(int i = 0; i<cnt;i++){
//			line[i] = sc.next();
//			if(line[i].contains(".")==true){
//				line[i]=line[i].replace(".", "");
//			}
//			else if(line[i].contains(",")==true){
//				line[i]=line[i].replace(",","");
//			}
//			else if(line[i].contains(":")==true){
//				line[i]=line[i].replace(":","");
//			}
//		}
		

		
//        for(int i = 0; i < line.length; i++) {
//            
//            for(int j = i+1; j < line.length; j++) {
//                
//                if(line[i].compareTo(line[j]) > 0 ) {
//                    String temp = line[i];
//                    line[i] = line[j];
//                    line[j] = temp;
//                }
//            }
//            if ( i>0 && line[i].equals(line[i-1])){
//            // ���� line �迭�� index�� 0���� ũ�� ����index�� ��Ʈ����
//            // ����index�� ��Ʈ���� �����ϴٸ� ī��Ʈ�߰�.
//            // index�� 0�ϰ����� �����ٸ� outofboundexception ���ɴϴ�.
//
//                count++;
//                
//            }else if(i!=0){
//            // ���� ������ index�� �����ʰ� ������ index�� 0�� �ƴ϶��
//            // ���ݱ��� ������ ī��Ʈ(�ܾ��� ����) �� ����ϰ� �ʱ�ȭ
//                System.out.println(line[i-1] + " " + count);
//                count = 1;
//            }
//            
//            if (i == line.length - 1){
//                // ���� ������ �迭�� ������ index��� ���� �ܾ��� ���� ���.
//                    System.out.println(line[i] + " " + count);
//                }
		

	}
}





