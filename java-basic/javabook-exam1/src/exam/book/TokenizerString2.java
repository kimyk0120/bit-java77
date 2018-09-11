package exam.book;

import java.util.StringTokenizer;

public class TokenizerString2 {

	public static void main(String[] args) {

		String phoneNum = "TEL 82-02-997-2059"; // 국제 전화번호
		String javaCode = "num+=1";
		
		System.out.println("First Result........");
		
		StringTokenizer st1 =  new StringTokenizer(phoneNum);
		while(st1.hasMoreTokens()){
			System.out.println(st1.nextToken());  // space를 기준으로 토큰이 나뉜다.
		} 
		
		
		System.out.println("\n Second Result..............");
		StringTokenizer st2 = new StringTokenizer(phoneNum, " -");
		
		while(st2.hasMoreTokens()){
			System.out.println(st2.nextToken());  // "-" 를 찾아 기준으로 나누네 ㅋ
		} 
			
		
		System.out.println("\n third Result..............");
		StringTokenizer st3 = new StringTokenizer(javaCode ,"+=", true);
		
		while(st3.hasMoreTokens()){
			System.out.println(st3.nextToken());  // 
		} 
		

		
		
		
	}

}
