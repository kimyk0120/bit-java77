package kr.co.mlec.day07.exam;

import java.util.*;

public class BaseBall {
	public static void main(String[] args) {

		int Number[] = new int[3]; // ��ǻ�Ͱ� ���� ��
		int Fit[] = new int[3]; // ����ڰ� ���߱����ؼ� ������ ��
		int temp = 0; // 1-9�̻��� ���� ������ �ĳ��� ���ؼ�
		int counter = 0; // ����� ���ߴ��� ���� ���ؼ�
		boolean loop = true;

		while (true) { // ��ǻ�Ͱ� �������� ���� ������.
			for (int i = 0; i < Number.length; i++) {
				Number[i] = (int) (Math.random() * 9) + 1;
			}
			// �ٸ� ���ڰ� ���ö����� ��� ������.
			if (Number[0] != Number[1] && Number[1] != Number[2] && Number[0] != Number[2]) {
				break;
			}
		}

		while (loop) {
			int strike = 0; // ��Ʈ����ũ��
			int ball = 0;
			System.out.print("�߱� ������ �����մϴ� :");
			Scanner Input = new Scanner(System.in);
			for (int i = 0; i < Fit.length; i++) {
				try {
					temp = Input.nextInt();
					Fit[i] = temp;
					if (temp > 10 || temp < 0) {
						System.out.println("1��9�� ������ �Է��ϼ��� ");
					}
				} catch (Exception e) {
					System.out.println("������ �ƴ� ���� �ԷµǾ����ϴ�. ");
				}
			}
			for (int i = 0; i < Number.length; i++) {
				for (int j = 0; j < Fit.length; j++) {
					// �ε����� ���� �����ؾ� strike
					if (Number[i] == Fit[j] && i == j) {
						strike++;
					} else if (Number[i] == Fit[j] && i != j) {
						ball++;
					}
				}
			}
			System.out.println(strike + "��Ÿ����ũ" + ball + "��");
			if (strike == 3) {
				loop = false;
			}
			counter++;
		} // while ����
		System.out.println("Ƚ�� : " + (counter - 1));
		System.out.println("Game Over");
	}
}
