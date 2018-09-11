package autoWired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		String path = "autoWired/test1.xml";
		String path = "autoWired/test2.xml";

		System.out.println("컨테이너 로딩전");

		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext(path);

		System.out.println("컨테이너 로딩후");

		Menu menu = container.getBean("menu", Menu.class);
		System.out.println("info-----------------------------------");
		menu.info();
		System.out.println("info-----------------------------------");
		

	}
}
