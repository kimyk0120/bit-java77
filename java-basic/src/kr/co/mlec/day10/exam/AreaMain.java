/*

-	������ ���� ���� ���ڱ��� �����Ǿ��ٸ� 
     ������ ������ ������ ���ϴ� Ŭ������ ȣ���մϴ�.
-	��°���� �Ʒ��� ���� ��µ˴ϴ�.
���簢���� ��� : ���簢���� ������ 9 �Դϴ�
���簢���� ��� : ���簢���� ������ 12 �Դϴ�
�ﰢ���� ���   : �ﰢ���� ������ 6 �Դϴ�
���� ���       : ���� ������ 6 �Դϴ�
 */
package kr.co.mlec.day10.exam;

import java.util.Random;

public class AreaMain {
	public static void main(String[] args) {
		Random r = new Random();
		Shape s = null;
		// 1-���簢��, 2-���簢��, 3-�ﰢ��, 4-��
		int type = r.nextInt(4) + 1;
		switch (type) {
		case 1: 
			s = new Square(r.nextInt(10) + 1);
			break;
		case 2: 
			s = new Rectangle(
					r.nextInt(10) + 1, r.nextInt(10) + 1);
			break;
		case 3: 
			s = new Triangle(
					r.nextInt(10) + 1, r.nextInt(10) + 1);
			break;
		case 4:
			s = new Circle(r.nextInt(10) + 1);
			break;
		}
		s.area();
	}
}





















