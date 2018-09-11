package setterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		String path = "setterInjection/test.xml";

		System.out.println("컨테이너 로딩전");
		
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext(path);
		
		System.out.println("컨테이너 로딩후");
		
//		ISand sand = (ISand) container.getBean("menu");
//		sand.info();
	}
}
