package constructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// constructorInjection/test.xml ������ ������ �ε�
		
		String path = "constructorInjection/test.xml";
		
		System.out.println("�����̳� �ε�");
		
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext(path);
		
		System.out.println("�����̳� �ε� ����");
		
//		Menu menu = (Menu)container.getBean("menu3");
//		menu.printSand();
		
	}
}
