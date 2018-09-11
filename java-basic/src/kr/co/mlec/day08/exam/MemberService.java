/*
 * 	data/member.txt ������ ������ �о ȸ���� ���� ���񽺸� ����
 */

package kr.co.mlec.day08.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MemberService {

	Scanner sc = new Scanner(System.in);
	MemberVO[] list = new MemberVO[10];
	int pos = 0;

	// ȸ������ ���� �غ� ���� �޼��� ȣ��
	void execute() {
		load();
		while (true) {
			int choice = menu();
			switch (choice) {
			case 1:
				listAll();
				break;
			case 2:
				viewByAge();
				break;
			case 3:
				System.out.println("�ý����� �����մϴ�");
				System.exit(0);
			}
		}
	}

	void viewByAge() {
		System.out.println("���ɺ� ȸ�� ����");
		System.out.println("---------------");
		System.out.println("1. 10��");
		System.out.println("2. 20��");
		System.out.println("3. 30��");
		System.out.println("4. 40��");
		System.out.println("5. ��Ÿ");
		System.out.print("���ɴ븦 �����ϼ��� : ");
		int choice = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < pos; i++) {

			MemberVO member = list[i];
			switch (choice) {

			case 1:
				if (member.age > 10 & member.age < 20)
					System.out.println(member.name + "\t" + member.age);
				break;
			case 2:
				if (member.age > 20 & member.age < 30)
					System.out.println(member.name + "\t" + member.age);
				break;
			case 3:
				if (member.age > 30 & member.age < 40)
					System.out.println(member.name + "\t" + member.age);
				break;
			case 4:
				if (member.age > 40 & member.age < 50)
					System.out.println(member.name + "\t" + member.age);
				break;
			case 5:
				if (member.age < 10 & member.age > 50)
					System.out.println(member.name + "\t" + member.age);
				if (i == 0) {
					System.out.println("��Ÿ ���ɴ��� ȸ���� �����ϴ�");
				}
				break;
			default:
				break;
			}
		}
	}

	void listAll() {
		System.out.println("---------------");
		System.out.println("��ü : " + pos + "��");
		System.out.println("---------------");
		for (int i = 0; i < pos; i++) {
			MemberVO member = list[i];
			System.out.println(member.name + "\t" + member.age);
		}
		System.out.println("---------------");
	}

	int menu() {
		System.out.println("---------------");
		System.out.println("1. ȸ�� ���� ����");
		System.out.println("2. ���ɺ� ȸ�� ����");
		System.out.println("3. ����");
		System.out.println("---------------");
		System.out.print("�޴��� �����ϼ��� : ");
		int choice = Integer.parseInt(sc.nextLine()); // nextLine�� ���ڿ��� ��ȯ
														// ���������� �ޱ����� parseInt���
		return choice;
	}

	// String[] split(String data) {
	// return new String[2];
	// }

	// ȸ�� ���񽺸� �ϱ� ���ؼ� ������ ������ �о �޸𸮿� �ø��� ����
	void load() {

		// String[] arr = split("�����:25");

		try {
			Scanner sc = new Scanner(new File("data/member.txt"));
			while (sc.hasNextLine()) {
				// �����:25
				String line = sc.nextLine();
				// split�� :�� �������� �������� �迭�� ������ ����

				String[] infoArr = line.split(":");

				MemberVO member = new MemberVO();
				member.name = infoArr[0];
				// "25" ���ڿ��� ���� 25�� ��ȯ
				// Integer.parseInt(���ڿ�)
				member.age = Integer.parseInt(infoArr[1]);
				list[pos++] = member;
			}
			System.out.println("ȸ�� ���� �ε� ����!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
