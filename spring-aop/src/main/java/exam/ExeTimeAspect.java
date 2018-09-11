package exam;

import org.aspectj.lang.ProceedingJoinPoint;

public class ExeTimeAspect {

	public Object exeTime(ProceedingJoinPoint point) throws Throwable {

		// 현재시간
		long s = System.currentTimeMillis();

		Object ret =null;
		
		try {

			ret = point.proceed();

		} finally {
			// 최종시간
			double time = (System.currentTimeMillis() - s) / 1000d;
			System.out.println("걸린 시간 : " + time);
		}
		
		return ret;
		
	}

}
