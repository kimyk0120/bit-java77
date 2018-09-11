package exam;

import org.aspectj.lang.ProceedingJoinPoint;

public class ExeTimeAspect {

	public Object exeTime(ProceedingJoinPoint point) throws Throwable {

		// ����ð�
		long s = System.currentTimeMillis();

		Object ret =null;
		
		try {

			ret = point.proceed();

		} finally {
			// �����ð�
			double time = (System.currentTimeMillis() - s) / 1000d;
			System.out.println("�ɸ� �ð� : " + time);
		}
		
		return ret;
		
	}

}
