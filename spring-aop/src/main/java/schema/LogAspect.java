package schema;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

public class LogAspect {
	// after ���� ��� ����
	// ȭ�鿡 ############# ���
	public void logAfter() {
		System.out.println("####################");
	}

	// ���� ����� ȣ���ϰ� �� �ٽɱ�� Ŭ���� ������ ����
	public void log(JoinPoint point) {
		// �ٽ� ��� Ŭ���� ��ü
		Class<?> clz = point.getTarget().getClass();
		// �ٽɱ�� Ŭ���� �̸�
		String cName = clz.getName();

		// �ٽɱ�� Ŭ���� �����ϴ� �޼���
		Signature sign = point.getSignature();

		// �ٽɱ�� Ŭ���� �޼��� �̸�
		String mName = sign.getName();

		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String time = sdf.format(new Date());
		System.out.println(cName + "." + mName + " : " + time + "�� ȣ��Ǿ����ϴ�.");
	}

	// �ٽ�Ŭ������ �޼��带 ȣ���ϴ� ����� ���� Ŭ������
	// �Ű������� ���ؼ� �޴´�.

	// �ٽ� Ŭ������ ���� ����� �ùٸ��� �����ϱ� ���ؼ�
	// ��ȯ Ÿ���� Object Ÿ������ �����Ѵ�.
	public Object logAround(ProceedingJoinPoint point) throws Throwable {
		// before
		System.out.println("***************************");
		// �ٽ� ��� Ŭ���� ��ü
		Class<?> clz = point.getTarget().getClass();
		// �ٽɱ�� Ŭ���� �̸�
		String cName = clz.getName();

		// �ٽɱ�� Ŭ���� �����ϴ� �޼���
		Signature sign = point.getSignature();

		// �ٽɱ�� Ŭ���� �޼��� �̸�
		String mName = sign.getName();

		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String time = sdf.format(new Date());
		System.out.println(cName + "." + mName + " : " + time + "�� ȣ��Ǿ����ϴ�.");
		// �ٽ� ��� ȣ��...

		Object ret = null;
		try {
			ret = point.proceed();
			System.out.println("�ٽ�Ŭ���� ���� ��� : " + ret);
			// after-returning
		} finally {
			// after
			System.out.println("###########################");
		}
		return ret;

	}

}
