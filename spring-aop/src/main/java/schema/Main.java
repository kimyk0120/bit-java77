/*
 * ��Ʈ�ѷ� ���� ���� 
 * BoardController ����Ϸ�
 * BoardController ����ð� : 4.276��
 * MemberController ����Ϸ�
 * MemberController ����ð� : 4.276
 */

package schema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		try {
			System.out.println("��Ʈ�ѷ� ���� ����");

			ApplicationContext container = new ClassPathXmlApplicationContext("schema/test.xml");

			Controller ctrl = container.getBean("board", Controller.class);
			ctrl.execute();
			ctrl = container.getBean("member", Controller.class);
			ctrl.execute();

			// �ٽ� ��� ���� Ŭ���� Ÿ������ ȣ���ϱ� ���ؼ���
			// aop:config �±׿� proxy-target-class="true"���� �� ������
			// Controller ctrl =
			// container.getBean("board",BoardController.class);
			// ctrl.execute();
			// ctrl = container.getBean("member", MemberController.class);
			// ctrl.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
