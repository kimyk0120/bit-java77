package configDivide;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		String path = "configDivide/config2.xml";

		System.out.println("컨테이너 로딩전");

		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext(
				// new String[] { "configDivide/config1.xml",
				// "configDivide/config2.xml" });
				"configDivide/config3.xml");
		
		System.out.println("컨테이너 로딩후");

		Menu menu = container.getBean("menu", Menu.class);
		menu.info();

	}
}
