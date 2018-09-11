package kr.co.mlec.day08;

import java.util.Arrays;

class MyUtil {
	void test() {
	};

	static void test2() {
	};
}

public class StringTest03 {

	public static void main(String[] args) throws Exception {

		String str = "Hello";
		str = "�ڹ�";

		// boolean bool = str.contains("ell");
		// System.out.println(bool);

		// ���ڿ��� ������ ����Ʈ �迭�� ��ȯ
		byte[] arr = str.getBytes(); // ����Ʈ �迭��UTF-8� �ִ�, �⺻���� EUC-KR
		System.out.println(Arrays.toString(arr));

//		UTF-8str.getBytes("EUC-KR"); // �ѱ��� 2����Ʈ
//		System.out.println(Arrays.toString(arr));

		arr = str.getBytes("UTF-8"); // �ѱ��� 3����Ʈ
		System.out.println(Arrays.toString(arr));

		// char charAt(int index) - String
		// MyUtil.test();

		// String s = 100+"";
		//
		// String s2 = String.valueOf(100);
		//
		//
		// MyUtil mu = new MyUtil();
		// mu.test();
		//
		// MyUtil.test2(); // ����ƽ�� ������ Ŭ���� �̸����� ���� ������ �� �ִ�
		//
		// String str = "Hello Java";
		//
		// String name = "ȫ�浿";
		// int age = 33;
		// String email = "hong@hong.com";
		//
		// System.out.println("�̸� : "+name+", ���� : "+age+", �̸��� : "+email);

		// format ����
		// %s : ���ڿ�
		// %c : ����
		// %d : ����
		// System.out.printf("�̸� : %s , ���� : %d , �̸��� : %s\n"
		// , name, age, email);
		//
		//
		// // �޼��� ����ο� static�� �ִٸ� Ŭ�����̸�.�޼���� ����
		// String result = String.format("�̸� : %s , ���� : %d , �̸��� : %s\n"
		// , name, age, email); // Ŭ���� �̸����� ����, ���������� �ִµ� �޼ҵ忡 static
		// //
		// System.out.println(result);

		// boolean flag = str.isEmpty(); // ���ڿ��� 0�� �´��� true false�� �Ǵ�
		// System.out.println(flag?"�������":"��������");

		// str= " Hello Java ";
		// System.out.println(str.length());
		// System.out.println(str);
		//
		// // ���ڿ��� ���� ������ ����(�ٸ� ���� ���)
		// str = str.trim();
		//
		// str = str.replace(" ","");
		// System.out.println(str.length());
		// System.out.println(str);

		// String result = str.toUpperCase();
		// System.out.println(result);
		//
		// result = str.toLowerCase();
		// System.out.println(result);

		//
		// int index = str.indexOf("l"); // �ε����� ��ȣ
		// System.out.println(index);
		//
		// index = str.indexOf("l",index + 1); // ó�� ã�� ������ �ε��� +1���� ã�ƶ�
		// System.out.println(index);
		//
		// index = str.lastIndexOf("l"); // �ڿ������� �˻�
		// System.out.println(index);
		//
		// String result = str.substring(1,4);
		// System.out.println("str.substring(1,4) : "+result); // ������ +1�� ������Ѵ�
		//
		// result = str.substring(1,str.length());
		// System.out.println("str.substring(1,str.length()) : "+result);
		//
		// result = str.substring(1); // ���������� �ѹ��� �ڸ��� �ִ�
		// System.out.println("str.substring(1) : "+result);
		//
		/*
		 * ȭ�鿡�� �̷��� ���̵��� �ϼ��� �̸� : ȫ�浿 ���� : 33 �̸��� : hong@hong.com
		 */

		String pInfo = "ȫ�浿:33:hong@hong.com";

		// String [] pArr = pInfo.split(":"); // �迭�� �Ѱ��ش�
		// for (String data : pArr){ // ������ �迭 ������ ���� Ÿ������ �Ѱ��ش�
		// System.out.println(data);
		// }

		// result = str.replaceAll("[0-9]", ""); // ����ǥ���� ������ �����ϱ�!!!
		// System.out.println(result);

		// int index = pInfo.indexOf("[0-9]");
		// System.out.println(index);

		// for(int i = 0; i<pInfo.length();i++){
		// int b = 0;
		// String s = "";
		// s+=pInfo.charAt(i);
		// System.out.print(s);
		// if(pInfo.charAt(i)==':'){
		// b = i;
		// for(int k=b+1;k<pInfo.length();k++){
		// s="";
		// s+=pInfo.charAt(i);
		// System.out.println(s);
		// }
		// }

		// String[] arr = {"", "", ""};
		// int loc = 0;
		// while (true) { int search = pInfo.indexOf(":", 0);
		// if (search == -1) {
		// break;
		// }
		// arr[loc++] = pInfo.substring(0, search);
		// pInfo = pInfo.substring(search + 1);
		// } arr[loc++] = pInfo;
		// System.out.println("�̸� : " + arr[0]);
		// System.out.println("���� : " + arr[1]);
		// System.out.println("�̸��� : " + arr[2]);

		// String temp = "";
		// int count = 0;
		// for (int i = 0; i < pInfo.length(); i++) {
		// char ch = pInfo.charAt(i);
		// if (ch != ':') temp += ch;
		// else { String msg = "";
		// switch (count) {
		// case 0: msg += "�̸� : " + temp;
		// break;
		// case 1: msg += "���� : " + temp;
		// break;
		// }
		// System.out.println(msg);
		// temp = "";
		// count++;
		// }
		// }
		// System.out.println("�̸��� : " + temp);

	}

	// char s = pInfo.charAt(1);
	// System.out.println(s);

	// str = "Hello";
	// if(str.equals("hello")){
	// }
	//
	// if (str.equalsIgnoreCase("hello")){ // ��ҹ��ڸ� �������� �ʴ´�
	// System.out.println("equalsIgnoreCase : ");
	// }
	// String result = str.replaceAll("l", "k"); // replaceAll ���� ��쿡��
	// // ù��° ���� ����ǥ����
	// // regular expression
	// // ���ڿ��� Ư���� ������ �ɾ(���ΰ���)
	// System.out.println("replaceAll : "+result);
	// result = str.replace("l", "k");
	// System.out.println("replace : "+result);
	//
	// str = "Hello 123 Java";
	//
	// result = str.replaceAll("[0-9]", ""); // ����ǥ���� ������ �����ϱ�!!!
	// System.out.println(result);
	//
	// result = str.replaceAll("0","");
	// System.out.println("replaceAll : "+result);

	/*
	 * System.out.println(str);
	 * 
	 * char ch = str.charAt(1); System.out.println(ch);
	 * 
	 * //int length()
	 * 
	 * int len =str.length(); 
	 * System.out.println(str+"�� ���ڿ� ���̴� "+len+"�Դϴ�.");
	 * 
	 * // for (int i = str.length()-1; i>=0; i--){ //
	 * System.out.println(str.charAt(i)); // }
	 * 
	 * // avaJ olleH // for (int i = str.length()-1; i>=0; i--){ //
	 * System.out.print(str.charAt(i)); // }
	 * 
	 * // Hello Java -> Hello Jv //removeChar(str, 'l');
	 * 
	 * String result = removeChar2(str,'a'); System.out.println();
	 * System.out.println(result);
	 * 
	 * str.replace('l', 'k' ); // =���� ���Թ��� �ʴ� �̻� str ��ü�� �� �ٲ��
	 * System.out.println(str);
	 * 
	 * str = str.replace('l', 'k' ); // =���� ���Թ��� �ʴ� �̻� str ��ü�� �� �ٲ��
	 * System.out.println(str);
	 * 
	 * }
	 * 
	 * 
	 * static String removeChar2(String str, char ch){ String result = "";
	 * for(int i = 0;i<str.length();i++){ if(str.charAt(i)!=ch){
	 * result+=str.charAt(i); } } return result; }
	 * 
	 * 
	 * // static void removeChar(String str, char ch){ // for(int i =
	 * 0;i<str.length();i++){ // if(str.charAt(i)!=ch){ //
	 * System.out.print(str.charAt(i)); // } // } // }
	 * 
	 * 
	 * // ����� ��� // static void removeChar(String str, char ch){ // for(int i =
	 * 0;i<str.length();i++){ // char c = str.charAt(i); // if(c==ch) //
	 * continue; // System.out.print(str.charAt(i)); // } // }
	 */
}
