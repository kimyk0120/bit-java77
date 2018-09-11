package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

// ���������� ó���� Ŭ���� 
public class HistoryAspect {

	// �ٽɱ�� �޼��尡 ������ ��
	// ȣ��� Ŭ������ �޼��� ������ ������ ���̽���
	// �����ϴ� ���

	public void history(JoinPoint point) {
		// Ŭ������(��Ű������)
		// �޼���� ���
		// �ٽ� ��� Ŭ���� ��ü
		Class<?> clz = point.getTarget().getClass();
		// �ٽɱ�� Ŭ���� �̸�
		String cName = clz.getName();

		// �ٽɱ�� Ŭ���� �����ϴ� �޼���
		Signature sign = point.getSignature();

		// �ٽɱ�� Ŭ���� �޼��� �̸�
		String mName = sign.getName();

		String sql = " insert into t77_history (  class_name, method_name) values("
				+ " ? , ? )";

		// ������ ���̽� �Է�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, cName);
			pstmt.setString(2, mName);

			pstmt.executeUpdate();
			
			
			System.out.println("�����丮 ��� ����");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�����丮 �Է��� ���� �߻�");
		}

	}

}
