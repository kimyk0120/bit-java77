package componentScan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		String path = "componentScan/test.xml";

		System.out.println("�����̳� �ε���");

		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext(path);

		System.out.println("�����̳� �ε���");

		Menu menu = container.getBean("menu", Menu.class);
		System.out.println("info-----------------------------------");
		menu.info();
		System.out.println("info-----------------------------------");
		

	}
}
