package kr.co.mlec.day07.exam;

import java.util.Random;
import java.util.Scanner;

class AnswerVO {

	int num[] = new int[3];

}

public class BaseballGame {

	static Scanner sc = new Scanner(System.in);
	// �� ����

	void randomNum() {
		Random random = new Random();
		AnswerVO answer = new AnswerVO();

		while (true) {
			answer.num[0] = random.nextInt(9) + 1;

			answer.num[1] = random.nextInt(9) + 1;

			answer.num[2] = random.nextInt(9) + 1;

			if (answer.num[0] != answer.num[1] && answer.num[1] != answer.num[2] && answer.num[2] != answer.num[0]) {
				break;
			}
		}

		System.out.println("Ȯ�ο� �� : " + answer.num[0] + " " + answer.num[1] + " " + answer.num[2]);
	}

	// ����
	void exit() {

		String go = sc.next();

		if (go.equals("N")) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {

		BaseballGame game = new BaseballGame();

		System.out.print("�߱������� �����մϴ�. (Y/N) : ");
		String go = sc.next();

		// �����߻�
		game.randomNum();

		// ���� �Է�
		AnswerVO answer = new AnswerVO();
		int[] call = new int[3];

		System.out.println("���� ������ �Է��ϼ��� (�Է����� : 1 2 3) : ");
		call[0] = sc.nextInt();
		call[1] = sc.nextInt();
		call[2] = sc.nextInt();

		// ���� ���� �ݰ��� ��

		// ����
		game.exit();
	}

}
