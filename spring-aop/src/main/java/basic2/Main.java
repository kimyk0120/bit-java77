/*
 * ��Ʈ�ѷ� ���� ���� 
 * BoardController ����Ϸ�
 * BoardController ����ð� : 4.276��
 * MemberController ����Ϸ�
 * MemberController ����ð� : 4.276
 */

package basic2;

public class Main {

	public static void main(String[] args) {

		try {
			System.out.println("��Ʈ�ѷ� ���� ����");
			Controller ctrl = new BoardController();
			ctrl.execute();
			
			
			ctrl = new MemberController();
			ctrl.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}