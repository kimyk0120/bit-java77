package setterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		String path = "setterInjection/test.xml";

		System.out.println("�����̳� �ε���");
		
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext(path);
		
		System.out.println("�����̳� �ε���");
		
//		ISand sand = (ISand) container.getBean("menu");
//		sand.info();
	}
}
