package kr.co.mlec.day08;

import java.io.File;
import java.util.Scanner;

public class ScannerFileTest {

	public static void main(String[] args) throws Exception {

		// System.in -> �ܼ�
		// File -> ��ũ�� ����� ���� �б�
		// c:/member.txt -> c ����̺� �ؿ� member.txt
		// member.txt -> ��Ŭ�������� ����ÿ��� ���� ã����
		// ���� ������Ʈ �������� ã�´�, ��Ŭ������ �����ϸ� ���� ���� Java-basic
		Scanner sc = new Scanner(new File("data/member.txt"));

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
	}

}