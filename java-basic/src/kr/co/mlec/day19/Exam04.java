package kr.co.mlec.day19;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Exam04 {
	public static void main(String[] args) throws Exception {
		String msg = "�ڹ�";
		String encodeMsg = URLEncoder.encode(msg,"UTF-8");
		System.out.println("���ڵ��� �޽��� : "+encodeMsg);
	}
}
