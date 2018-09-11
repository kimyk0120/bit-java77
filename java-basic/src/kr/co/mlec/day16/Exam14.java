package kr.co.mlec.day16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exam14 {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);
				FileWriter fw = new FileWriter("data/ioexam14.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);) {
			System.out.print("�̸��� �Է��ϼ��� : ");
			String name = sc.nextLine();
			System.out.print("���̸� �Է��ϼ��� : ");
			int age = sc.nextInt();
			bw.write("�̸� : " + name + ", ���� : " + age);
			pw.printf("�̸� : %s, ����: %d", name, age);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
